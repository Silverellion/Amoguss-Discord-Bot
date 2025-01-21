package com.firstBot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LeaveBannedServers extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        ArrayList<Long> bannedServers = BanList.getBannedServers();
        for(Long server : bannedServers) {
            Guild guild = event.getJDA().getGuildById(server);
            System.out.print("Left server: \n");
            if(guild!=null) {
                guild.leave().queue();
                System.out.print(guild.getName() + ", " + guild.getId());
            }
        }
    }
}
