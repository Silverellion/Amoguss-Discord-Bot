package com.firstBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class InitializeCommands extends ListenerAdapter {
    private final AdminCommands adminCommands = new AdminCommands();
    private static final String deleteBotMessages = "deletebotmessages";
    private static final String deleteAllMessages = "deleteallmessages";
    private static final String inThisChannel = "inthischannel";
    private static final String inGuild = "inguild";
    private static final String deleteStop = "deletestop";

    private static final String generatePokemonTeam = "generaterpokemonteam";
    private final PokemonCommands pokemonCommands = new PokemonCommands();

    private static final String startChat = "startchat";
    private static final String stopChat = "stopchat";
    private static final String startRandomMessages = "startrandommessages";
    private static final String stopRandomMessages = "stoprandommessages";
    private static final String startAutoModeration = "startautomoderation";
    private static final String stopAutoModeration = "stopautomoderation";
    private static final String clearMemory = "clearmemory";

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if(BanList.isUserBanned(event.getUser().getIdLong()) || BanList.isServerBanned(Objects.requireNonNull(event.getGuild()).getIdLong()))
            return;
        switch (event.getName()) {
            case deleteBotMessages -> {
                if(Objects.requireNonNull(event.getOption(deleteAllMessages)).getAsString().equals(inThisChannel))
                    adminCommands.deleteAllBotsMessagesInThisChannel(event);
                else
                    adminCommands.deleteAllBotsMessageInThisGuild(event);
            }
            case deleteAllMessages -> {
                if(Objects.requireNonNull(event.getOption(deleteAllMessages)).getAsString().equals(inThisChannel))
                    adminCommands.deleteAllMessagesInThisChannel(event);
                else
                    adminCommands.deleteAllMessagesInThisGuild(event);
            }
            case deleteStop -> adminCommands.stopDelete(event);
            case generatePokemonTeam -> pokemonCommands.generateTeam(event);
            case startChat -> AiCommands.startChat(event);
            case stopChat -> AiCommands.stopChat(event);

            case startRandomMessages -> AiCommands.startRandomMessages(event);
            case stopRandomMessages -> AiCommands.stopRandomMessages(event);

            case startAutoModeration -> AiCommands.startAutoModeration(event);
            case stopAutoModeration -> AiCommands.stopAutoModeration(event);

            case clearMemory -> AiCommands.clearMemory(event);
        }
    }

    @Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        pokemonCommands.pokemonButton(event);
    }

    @Override
    public void onReady(ReadyEvent event) {
        event.getJDA().updateCommands().addCommands(
                getDeleteBotMessages(),
                getDeleteAllMessages(),
                Commands.slash(deleteStop, "Stop the bot from deleting messages"),

                Commands.slash(generatePokemonTeam, "Generate Random Pokemon Teams"),

                Commands.slash(startChat, "Enable the bot to initiate AI chat (enabled by default)"),
                Commands.slash(stopChat, "Disable current and future AI chat of this bot inside this server"),

                Commands.slash(startRandomMessages, "Enable the bot to send random messages to a random channel that is available to the public"),
                Commands.slash(stopRandomMessages, "Disable the bot to send random messages to a random channel that is available to the public"),

                Commands.slash(startAutoModeration, "Enable the bot to delete any harmful messages"),
                Commands.slash(stopAutoModeration, "Disable the bot to delete any harmful messages"),

                Commands.slash(clearMemory, "Clear your conversation memory")
        ).queue();
    }


    public static SlashCommandData getDeleteBotMessages() {
        return Commands.slash(deleteBotMessages, "Deletes all bot messages in this channel or in the entire server, can be stopped with /deletestop")
                .addOptions(
                        new OptionData(OptionType.STRING, deleteBotMessages, "Delete this bot's messages", true)
                                .addChoice("In this channel", inThisChannel)
                                .addChoice("In the entire server", inGuild)
                );
    }

    public static SlashCommandData getDeleteAllMessages() {
        return Commands.slash(deleteAllMessages, "Deletes all messages in this channel or in the entire server, can be stopped with /deletestop")
                .addOptions(
                        new OptionData(OptionType.STRING, deleteAllMessages, "Delete all messages", true)
                                .addChoice("In this channel", inThisChannel)
                                .addChoice("In the entire server", inGuild)
                );
    }
}
