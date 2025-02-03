package com.firstBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Objects;

public class IDGetterHelper {
    public static long getGuildIDLongFromSlashCommandInteractionEvent(SlashCommandInteractionEvent event) {
        return Objects.requireNonNull(event.getGuild()).getIdLong();
    }
    public static long getGuildIDLongFromMessageReceivedEvent(MessageReceivedEvent event) {
        return event.getGuild().getIdLong();
    }
}
