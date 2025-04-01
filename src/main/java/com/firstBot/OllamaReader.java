package com.firstBot;

import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.store.memory.chat.ChatMemoryStore;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static dev.langchain4j.data.message.ChatMessageDeserializer.messagesFromJson;
import static dev.langchain4j.data.message.ChatMessageSerializer.messagesToJson;

public class OllamaReader {

    private final Assistant assistant;
    private final PersistentChatMemoryStore store;
    private final ChatMemoryProvider chatMemoryProvider;
    private final ChatLanguageModel model;
    private final String currentModelName = "gemma3";

    private interface Assistant {
        String chat(@MemoryId long memoryId, @UserMessage String userMessage); //@UserMessage UserMessage userMessage is too slow.
    }

    OllamaReader() {
        store = new PersistentChatMemoryStore();
        chatMemoryProvider = memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
                .maxMessages(5)
                .chatMemoryStore(store)
                .build();

        model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName(currentModelName)
                .temperature(2.0)
                .numPredict(4096) //maxToken == max characters that the bot will send in a message
                .build();

        assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .chatMemoryProvider(chatMemoryProvider)
                .build();
    }

    OllamaReader(double temperature, int maxToken) {
        store = new PersistentChatMemoryStore();
        chatMemoryProvider = memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
                .maxMessages(5)
                .chatMemoryStore(store)
                .build();

        model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName(currentModelName)
                .temperature(temperature)
                .numPredict(maxToken) //maxToken == max characters that the bot will send in a message
                .build();

        assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .chatMemoryProvider(chatMemoryProvider)
                .build();
    }

    public static class PersistentChatMemoryStore implements ChatMemoryStore {
        private final Map<Long, String> map = new ConcurrentHashMap<>();
        @Override
        public List<ChatMessage> getMessages(Object memoryId) {
            String json = map.get((long)memoryId);
            return messagesFromJson(json);
        }

        @Override
        public void updateMessages(Object memoryId, List<ChatMessage> messages) {
            String json = messagesToJson(messages);
            map.put((long)memoryId, json);
        }

        @Override
        public void deleteMessages(Object memoryId) {
            map.remove((long) memoryId);
        }
    }

    public String getResponse(long UID, String content) {
        return assistant.chat(UID, content);
    }

    public void clearMemory(long UID) {
        store.deleteMessages(UID);
    }
}
