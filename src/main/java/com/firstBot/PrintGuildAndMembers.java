package com.firstBot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class PrintGuildAndMembers extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        List<Guild> guilds = event.getJDA().getGuilds();
        StringBuilder s = new StringBuilder("Server list: \n");
        for(Guild guild : guilds) {
            s.append("----------------------------Name: ").append(guild.getName()).append(", ID: ").append(guild.getId()).append("----------------------------\n");
            s.append("-----Channel List-----\n");
            guild.getChannels().forEach(channel -> {
                if(channel instanceof GuildMessageChannel) {
                    s.append("Channel name: ").append(channel.getName()).append(", Channel ID: ").append(channel.getId()).append("\n");
                }
            });
            s.append("-----Member List-----\n");
            guild.loadMembers().onSuccess(members -> {
                for(Member member : members) {
                    s.append("Name: ").append(member.getUser().getName()).append(", ID: ").append(member.getId()).append("\n");
                }
            });
        }
        System.out.println(s);
    }
}
