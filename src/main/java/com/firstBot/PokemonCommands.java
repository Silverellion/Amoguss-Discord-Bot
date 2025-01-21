package com.firstBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.util.ArrayList;

public class PokemonCommands extends ListenerAdapter {
    private ArrayList<String> pokeList;
    private String gen;

    public void generateTeam(SlashCommandInteractionEvent event) {
        ActionRow ar1 = ActionRow.of(
                Button.primary("gen1", "Gen 1"),
                Button.primary("gen2", "Gen 2"),
                Button.primary("gen3", "Gen 3")
        );
        ActionRow ar2 = ActionRow.of(
                Button.primary("gen4", "Gen 4"),
                Button.primary("gen5", "Gen 5"),
                Button.primary("gen6", "Gen 6")
        );
        ActionRow ar3 = ActionRow.of(
                Button.primary("gen7", "Gen 7"),
                Button.primary("gen8", "Gen 8"),
                Button.primary("gen9", "Gen 9")
        );
        ActionRow ar4 = ActionRow.of(
                Button.primary("gen8nat", "Gen 8 nat Dex"),
                Button.primary("gen9nat", "Gen 9 nat Dex")
        );
        event.reply("Which format?")
                .setEphemeral(true)
                .addComponents(ar1, ar2, ar3, ar4)
                .queue();
    }

    public void pokemonButton(ButtonInteractionEvent event) {
        String buttonID = event.getComponentId();
        switch (buttonID) {
            case "gen1" -> {
                gen = "gen1";
                formatRespond(event);
            }
            case "gen2" -> {
                gen = "gen2";
                formatRespond(event);
            }
            case "gen3" -> {
                gen = "gen3";
                formatRespond(event);
            }
            case "gen4" -> {
                gen = "gen4";
                formatRespond(event);
            }
            case "gen5" -> {
                gen = "gen5";
                formatRespond(event);
            }
            case "gen6" -> {
                gen = "gen6";
                formatRespond(event);
            }
            case "gen7" -> {
                gen = "gen7";
                formatRespond(event);
            }
            case "gen8" -> {
                gen = "gen8";
                formatRespond(event);
            }
            case "gen9" -> {
                gen = "gen9";
                formatRespond(event);
            }
            case "gen8nat" -> {
                gen = "gen8nat";
                formatRespond(event);
            }
            case "gen9nat" -> {
                gen = "gen9nat";
                formatRespond(event);
            }
            case "AG" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "AG");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "UBER" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "UBER", event.getUser().getId());
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "OU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "OU", event.getUser().getId());
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "UU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "UU");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "RU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "RU");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "NU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "NU");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "PU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "PU");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "ZU" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "ZU");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "NFE" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "NFE");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "LC" -> {
                RandomPokemon pokes = new RandomPokemon(gen, "LC");
                pokeList = pokes.getTeam();
                defaultRespond(event);
            }
            case "confirm_button" -> {
                event.editMessage("Ok, here's your team:").setComponents().queue();
                event.getChannel().asTextChannel().sendMessage("# <@" + event.getUser().getId() + ">'s team: " + sendEmoji(pokeList)).queue();
            }
            case "decline_button" ->
                    event.editMessage("# Your team: " + sendEmoji(pokeList)).setComponents().queue();
        }
    }

    private void formatRespond(ButtonInteractionEvent event) {
        ActionRow ar1 = ActionRow.of(
                Button.primary("AG", "AG"),
                Button.primary("UBER", "Uber")
        );
        ActionRow ar2 = ActionRow.of(
                Button.primary("OU", "OU"),
                Button.primary("UU", "UU"),
                Button.primary("RU", "RU")
        );
        ActionRow ar3 = ActionRow.of(
                Button.primary("NU", "NU"),
                Button.primary("PU", "PU"),
                Button.primary("ZU", "ZU")
        );
        ActionRow ar4 = ActionRow.of(
                Button.primary("NFE", "NFE"),
                Button.primary("LC", "LC")
        );

        event.editMessage("Which format?")
                .setComponents(ar1, ar2, ar3, ar4)
                .queue();
    }

    private void defaultRespond(ButtonInteractionEvent event) {
        event.editMessage("# Your team: " + sendEmoji(pokeList) + "\nDo you want to show your team?")
                .setActionRow(
                         Button.primary("confirm_button", "Yes"),
                        Button.danger("decline_button", "No")
                )
                .queue();
    }

    public String sendEmoji(ArrayList<String> pokeList) {
        StringBuilder s = new StringBuilder();
        for(String emoji : pokeList) {
            s.append(emoji);
        }
        return s.toString();
    }
}
