package com.firstBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class InitializeCommands extends ListenerAdapter {
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
}
