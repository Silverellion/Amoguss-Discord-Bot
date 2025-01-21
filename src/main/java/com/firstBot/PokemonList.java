package com.firstBot;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PokemonList implements Iterable<Pokemon> {
    List<Pokemon> PokeList = new ArrayList<>();

    PokemonList(int gen) {
        initialize(gen);
    }

    @NotNull
    @Override
    public Iterator<Pokemon> iterator() {
        return PokeList.iterator();
    }

    public void initialize(int gen) {
        if(gen <= 7) {
            for (int i = 1; i <= gen; i++) {
                switch (i) {
                    case 1 -> initBabyGen1();
                    case 2 -> initBabyGen2();
                    case 3 -> initBabyGen3();
                    case 4 -> initBabyGen4();
                    case 5 -> initBabyGen5();
                    case 6 -> initBabyGen6();
                    case 7 -> initBabyGen7();
                }
            }
        }
        else if(gen == 8001) {
            initBabyGen1to7();
            initBabyGen8nat();
        }
        else if(gen == 8)
            initBabyGen8();
        else if(gen == 9001) {
            initBabyGen1to7();
            initBabyGen8nat();
            initBabyGen9nat();
        }
        else if(gen == 9) {
            initBabyGen9();
        }
        switch(gen) {
            case 1 -> initGen1();
            case 2 -> initGen2();
            case 3 -> initGen3();
            case 4 -> initGen4();
            case 5 -> initGen5();
            case 6 -> initGen6();
            case 7 -> initGen7();
            case 8 -> initGen8();
            case 9 -> initGen9();
            case 8001 -> initGen8nat();
            case 9001 -> initGen9nat();
        }
        if(gen >= 4) {
            //These Pokémons' evolved forms received evolution.
            PokeList.add(new Pokemon(92, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.LC)); // Gastly
            PokeList.add(new Pokemon(95, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Onix
            PokeList.add(new Pokemon(108, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Lickitung
            PokeList.add(new Pokemon(112, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.NFE)); // Rhydon
            PokeList.add(new Pokemon(117, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Seadra
            PokeList.add(new Pokemon(126, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Magmar
            PokeList.add(new Pokemon(137, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Porygon
            PokeList.add(new Pokemon(299, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nosepass
        }
        if(gen >= 5) {
            PokeList.add(new Pokemon(193, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Yanma
        }
        if(gen >= 6) {
            PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pikachu
            PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Electabuzz
        }
    }
    //SEGMENT BABY POKEMONS:
    //SEGMENT GEN 1:
    private void initBabyGen1() {
        PokeList.add(new Pokemon(1, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Bulbasaur
        PokeList.add(new Pokemon(2, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Ivysaur

        PokeList.add(new Pokemon(4, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Charmander
        PokeList.add(new Pokemon(5, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Charmeleon

        PokeList.add(new Pokemon(7, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Squirtle
        PokeList.add(new Pokemon(8, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Wartortle

        PokeList.add(new Pokemon(10, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Caterpie
        PokeList.add(new Pokemon(11, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Metapod

        PokeList.add(new Pokemon(13, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Weedle
        PokeList.add(new Pokemon(14, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Kakuna

        PokeList.add(new Pokemon(16, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Pidgey
        PokeList.add(new Pokemon(17, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Pidgeotto

        PokeList.add(new Pokemon(190001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rattata
        PokeList.add(new Pokemon(21, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Spearow
        PokeList.add(new Pokemon(23, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ekans
        PokeList.add(new Pokemon(270001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sandshrew

        PokeList.add(new Pokemon(29, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nidoran♀
        PokeList.add(new Pokemon(30, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Nidorina

        PokeList.add(new Pokemon(32, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nidoran♂
        PokeList.add(new Pokemon(33, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Nidorino

        PokeList.add(new Pokemon(35, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clefairy
        PokeList.add(new Pokemon(37, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Vulpix
        PokeList.add(new Pokemon(39, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Jigglypuff
        PokeList.add(new Pokemon(41, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Zubat

        PokeList.add(new Pokemon(43, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Oddish
        PokeList.add(new Pokemon(44, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Gloom

        PokeList.add(new Pokemon(46, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Paras
        PokeList.add(new Pokemon(48, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Venonat
        PokeList.add(new Pokemon(500001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Diglett
        PokeList.add(new Pokemon(520001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(54, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Psyduck

        PokeList.add(new Pokemon(56, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mankey
        PokeList.add(new Pokemon(580001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Growlithe

        PokeList.add(new Pokemon(60, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poliwag
        PokeList.add(new Pokemon(61, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Poliwhirl

        PokeList.add(new Pokemon(63, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Abra
        PokeList.add(new Pokemon(64, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Kadabra

        PokeList.add(new Pokemon(66, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Machop
        PokeList.add(new Pokemon(67, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Machoke

        PokeList.add(new Pokemon(69, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Bellsprout
        PokeList.add(new Pokemon(70, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Weepinbell

        PokeList.add(new Pokemon(72, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.LC)); // Tentacool

        PokeList.add(new Pokemon(740001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Geodude
        PokeList.add(new Pokemon(750001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Graveler

        PokeList.add(new Pokemon(770001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ponyta
        PokeList.add(new Pokemon(790001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Slowpoke
        PokeList.add(new Pokemon(81, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Magnemite
        PokeList.add(new Pokemon(830001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Farfetch'd
        PokeList.add(new Pokemon(84, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Doduo

        PokeList.add(new Pokemon(86, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Seel
        PokeList.add(new Pokemon(88, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grimer
        PokeList.add(new Pokemon(90, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellder

        PokeList.add(new Pokemon(96, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Drowzee
        PokeList.add(new Pokemon(98, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Krabby
        PokeList.add(new Pokemon(100001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Voltorb
        PokeList.add(new Pokemon(102, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Exeggcute
        PokeList.add(new Pokemon(104, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cubone

        PokeList.add(new Pokemon(109, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Koffing
        PokeList.add(new Pokemon(111, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Rhyhorn
        PokeList.add(new Pokemon(116, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Horsea
        PokeList.add(new Pokemon(118, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Goldeen
        PokeList.add(new Pokemon(120, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Staryu

        PokeList.add(new Pokemon(129, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magikarp
        PokeList.add(new Pokemon(1330001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Eevee
        PokeList.add(new Pokemon(138, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Omanyte
        PokeList.add(new Pokemon(140, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Kabuto

        PokeList.add(new Pokemon(147, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Dratini
        PokeList.add(new Pokemon(148, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dragonair
    }
    //SEGMENT GEN 2
    private void initBabyGen2() {
        PokeList.add(new Pokemon(152, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chikorita
        PokeList.add(new Pokemon(153, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Bayleef

        PokeList.add(new Pokemon(155, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cyndaquil
        PokeList.add(new Pokemon(156, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quilava

        PokeList.add(new Pokemon(158, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Totodile
        PokeList.add(new Pokemon(159, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Croconaw

        PokeList.add(new Pokemon(161, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sentret
        PokeList.add(new Pokemon(163, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Hoothoot
        PokeList.add(new Pokemon(165, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Ledyba
        PokeList.add(new Pokemon(167, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Spinarak
        PokeList.add(new Pokemon(170, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Chinchou

        PokeList.add(new Pokemon(172, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pichu
        PokeList.add(new Pokemon(173, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cleffa
        PokeList.add(new Pokemon(174, 2, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Igglybuff

        PokeList.add(new Pokemon(175, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Togepi
        PokeList.add(new Pokemon(176, 2, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Togetic

        PokeList.add(new Pokemon(177, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Natu

        PokeList.add(new Pokemon(179, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mareep
        PokeList.add(new Pokemon(180, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Flaaffy

        PokeList.add(new Pokemon(183, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Marill

        PokeList.add(new Pokemon(187, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Hoppip
        PokeList.add(new Pokemon(188, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Skiploom

        PokeList.add(new Pokemon(190, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Aipom
        PokeList.add(new Pokemon(191, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sunkern
        PokeList.add(new Pokemon(194, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Wooper
        PokeList.add(new Pokemon(198, 2, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Murkrow
        PokeList.add(new Pokemon(204, 2, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pineco

        PokeList.add(new Pokemon(209, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snubbull
        PokeList.add(new Pokemon(216, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Teddiursa
        PokeList.add(new Pokemon(218, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slugma
        PokeList.add(new Pokemon(220, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Swinub
        PokeList.add(new Pokemon(223, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Remoraid

        PokeList.add(new Pokemon(228, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Houndour
        PokeList.add(new Pokemon(231, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Phanpy
        PokeList.add(new Pokemon(236, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tyrogue
        PokeList.add(new Pokemon(238, 2, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Smoochum
        PokeList.add(new Pokemon(239, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Elekid

        PokeList.add(new Pokemon(240, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magby

        PokeList.add(new Pokemon(246, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Larvitar
        PokeList.add(new Pokemon(247, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Pupitar
    }
    //SEGMENT GEN 3
    private void initBabyGen3() {
        PokeList.add(new Pokemon(252, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Treecko
        PokeList.add(new Pokemon(253, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Grovyle

        PokeList.add(new Pokemon(255, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Torchic
        PokeList.add(new Pokemon(256, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Combusken

        PokeList.add(new Pokemon(258, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudkip
        PokeList.add(new Pokemon(259, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Marshtomp

        PokeList.add(new Pokemon(261, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poochyena
        PokeList.add(new Pokemon(2630001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Zigzagoon

        PokeList.add(new Pokemon(265, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wurmple
        PokeList.add(new Pokemon(266, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Silcoon
        PokeList.add(new Pokemon(268, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Cascoon

        PokeList.add(new Pokemon(270, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Lotad
        PokeList.add(new Pokemon(271, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.NFE)); // Lombre

        PokeList.add(new Pokemon(273, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Seedot
        PokeList.add(new Pokemon(274, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Nuzleaf

        PokeList.add(new Pokemon(276, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Taillow
        PokeList.add(new Pokemon(278, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Wingull

        PokeList.add(new Pokemon(280, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ralts
        PokeList.add(new Pokemon(281, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Kirlia

        PokeList.add(new Pokemon(283, 3, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.LC)); // Surskit
        PokeList.add(new Pokemon(285, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shroomish
        PokeList.add(new Pokemon(287, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slakoth
        PokeList.add(new Pokemon(288, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Vigoroth
        PokeList.add(new Pokemon(290, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nincada

        PokeList.add(new Pokemon(293, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Whismur
        PokeList.add(new Pokemon(294, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Loudred

        PokeList.add(new Pokemon(296, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Makuhita
        PokeList.add(new Pokemon(298, 3, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Azurill
        PokeList.add(new Pokemon(300, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skitty

        PokeList.add(new Pokemon(304, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Aron
        PokeList.add(new Pokemon(305, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.NFE)); // Lairon

        PokeList.add(new Pokemon(307, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Meditite
        PokeList.add(new Pokemon(309, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Electrike
        PokeList.add(new Pokemon(316, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gulpin
        PokeList.add(new Pokemon(318, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.LC)); // Carvanha
        PokeList.add(new Pokemon(320, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wailmer

        PokeList.add(new Pokemon(322, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Numel
        PokeList.add(new Pokemon(325, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Spoink

        PokeList.add(new Pokemon(328, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Trapinch
        PokeList.add(new Pokemon(329, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Vibrava

        PokeList.add(new Pokemon(331, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cacnea
        PokeList.add(new Pokemon(333, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Swablu
        PokeList.add(new Pokemon(339, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Barboach
        PokeList.add(new Pokemon(341, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Corphish
        PokeList.add(new Pokemon(343, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Baltoy

        PokeList.add(new Pokemon(345, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Lileep
        PokeList.add(new Pokemon(347, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.LC)); // Anorith
        PokeList.add(new Pokemon(349, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Feebas
        PokeList.add(new Pokemon(353, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shuppet
        PokeList.add(new Pokemon(355, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Duskull

        PokeList.add(new Pokemon(360, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wynaut
        PokeList.add(new Pokemon(361, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snorunt

        PokeList.add(new Pokemon(363, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.LC)); // Spheal
        PokeList.add(new Pokemon(364, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NFE)); // Sealeo

        PokeList.add(new Pokemon(366, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clamperl

        PokeList.add(new Pokemon(371, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bagon
        PokeList.add(new Pokemon(372, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Shelgon

        PokeList.add(new Pokemon(374, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Beldum
        PokeList.add(new Pokemon(375, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.NFE)); // Metang
    }
    //SEGMENT GEN 4
    private void initBabyGen4() {
        PokeList.add(new Pokemon(387, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Turtwig
        PokeList.add(new Pokemon(388, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Grotle

        PokeList.add(new Pokemon(390, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chimchar
        PokeList.add(new Pokemon(391, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Monferno

        PokeList.add(new Pokemon(393, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Piplup
        PokeList.add(new Pokemon(394, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Prinplup

        PokeList.add(new Pokemon(396, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Starly
        PokeList.add(new Pokemon(397, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Staravia

        PokeList.add(new Pokemon(399, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bidoof
        PokeList.add(new Pokemon(401, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Kricketot

        PokeList.add(new Pokemon(403, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shinx
        PokeList.add(new Pokemon(404, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Luxio

        PokeList.add(new Pokemon(406, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Budew
        PokeList.add(new Pokemon(408, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cranidos
        PokeList.add(new Pokemon(410, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Shieldon
        PokeList.add(new Pokemon(412, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Burmy
        PokeList.add(new Pokemon(415, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Combee

        PokeList.add(new Pokemon(418, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Buizel
        PokeList.add(new Pokemon(420, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cherubi
        PokeList.add(new Pokemon(422, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellos
        PokeList.add(new Pokemon(425, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Drifloon
        PokeList.add(new Pokemon(427, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Buneary

        PokeList.add(new Pokemon(431, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Glameow
        PokeList.add(new Pokemon(433, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chingling
        PokeList.add(new Pokemon(434, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC)); // Stunky
        PokeList.add(new Pokemon(436, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Bronzor
        PokeList.add(new Pokemon(438, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bonsly

        PokeList.add(new Pokemon(439, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Mime Jr.
        PokeList.add(new Pokemon(440, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Happiny
        PokeList.add(new Pokemon(443, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Gible
        PokeList.add(new Pokemon(444, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Gabite
        PokeList.add(new Pokemon(446, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Munchlax

        PokeList.add(new Pokemon(447, 4, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Riolu
        PokeList.add(new Pokemon(449, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hippopotas
        PokeList.add(new Pokemon(451, 4, Pokemon.Type.POISON, Pokemon.Type.BUG, Pokemon.Format.LC)); // Skorupi
        PokeList.add(new Pokemon(453, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Croagunk
        PokeList.add(new Pokemon(456, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Finneon

        PokeList.add(new Pokemon(458, 4, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Mantyke
        PokeList.add(new Pokemon(459, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Snover
    }
    //SEGMENT GEN 5
    private void initBabyGen5() {
        PokeList.add(new Pokemon(495, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snivy
        PokeList.add(new Pokemon(496, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Servine

        PokeList.add(new Pokemon(498, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tepig
        PokeList.add(new Pokemon(499, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Pignite

        PokeList.add(new Pokemon(501, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Oshawott
        PokeList.add(new Pokemon(502, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dewott

        PokeList.add(new Pokemon(504, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Patrat

        PokeList.add(new Pokemon(506, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Lillipup
        PokeList.add(new Pokemon(507, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Herdier

        PokeList.add(new Pokemon(509, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Purrloin

        PokeList.add(new Pokemon(511, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pansage
        PokeList.add(new Pokemon(513, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pansear
        PokeList.add(new Pokemon(515, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Panpour

        PokeList.add(new Pokemon(517, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Munna

        PokeList.add(new Pokemon(519, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Pidove
        PokeList.add(new Pokemon(520, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Tranquill

        PokeList.add(new Pokemon(522, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Blitzle

        PokeList.add(new Pokemon(524, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Roggenrola
        PokeList.add(new Pokemon(525, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Boldore

        PokeList.add(new Pokemon(527, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Woobat

        PokeList.add(new Pokemon(529, 5, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Drilbur

        PokeList.add(new Pokemon(532, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Timburr
        PokeList.add(new Pokemon(533, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gurdurr

        PokeList.add(new Pokemon(535, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tympole
        PokeList.add(new Pokemon(536, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Palpitoad

        PokeList.add(new Pokemon(540, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Sewaddle
        PokeList.add(new Pokemon(541, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.NFE)); // Swadloon

        PokeList.add(new Pokemon(543, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Venipede
        PokeList.add(new Pokemon(544, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Whirlipede

        PokeList.add(new Pokemon(546, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cottonee
        PokeList.add(new Pokemon(548, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Petilil

        PokeList.add(new Pokemon(551, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.LC)); // Sandile
        PokeList.add(new Pokemon(552, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Krokorok

        PokeList.add(new Pokemon(5540001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Darumaka
        PokeList.add(new Pokemon(557, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Dwebble
        PokeList.add(new Pokemon(559, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Scraggy
        PokeList.add(new Pokemon(5620001, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamask
        PokeList.add(new Pokemon(564, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Tirtouga

        PokeList.add(new Pokemon(566, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Archen
        PokeList.add(new Pokemon(568, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Trubbish
        PokeList.add(new Pokemon(5700001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(572, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Minccino

        PokeList.add(new Pokemon(574, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gothita
        PokeList.add(new Pokemon(575, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gothorita

        PokeList.add(new Pokemon(577, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Solosis
        PokeList.add(new Pokemon(578, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Duosion

        PokeList.add(new Pokemon(580, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Ducklett

        PokeList.add(new Pokemon(582, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Vanillite
        PokeList.add(new Pokemon(583, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Vanillish

        PokeList.add(new Pokemon(585, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Deerling
        PokeList.add(new Pokemon(588, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Karrablast
        PokeList.add(new Pokemon(590, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Foongus
        PokeList.add(new Pokemon(592, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Frillish
        PokeList.add(new Pokemon(595, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Joltik

        PokeList.add(new Pokemon(597, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Ferroseed

        PokeList.add(new Pokemon(599, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Klink
        PokeList.add(new Pokemon(600, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Klang

        PokeList.add(new Pokemon(602, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tynamo
        PokeList.add(new Pokemon(603, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Eelektrik
        PokeList.add(new Pokemon(605, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Elgyem

        PokeList.add(new Pokemon(607, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Litwick
        PokeList.add(new Pokemon(608, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Lampent

        PokeList.add(new Pokemon(610, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Axew
        PokeList.add(new Pokemon(611, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Fraxure

        PokeList.add(new Pokemon(613, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cubchoo
        PokeList.add(new Pokemon(616, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shelmet
        PokeList.add(new Pokemon(619, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mienfoo
        PokeList.add(new Pokemon(622, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Golett
        PokeList.add(new Pokemon(624, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Pawniard

        PokeList.add(new Pokemon(627, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Rufflet
        PokeList.add(new Pokemon(629, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Vullaby

        PokeList.add(new Pokemon(633, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Deino
        PokeList.add(new Pokemon(634, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Zweilous

        PokeList.add(new Pokemon(636, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Larvesta
    }
    //SEGMENT: GEN 6
    private void initBabyGen6() {
        PokeList.add(new Pokemon(650, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chespin
        PokeList.add(new Pokemon(651, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quilladin

        PokeList.add(new Pokemon(653, 6, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fennekin
        PokeList.add(new Pokemon(654, 6, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Braixen

        PokeList.add(new Pokemon(656, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Froakie
        PokeList.add(new Pokemon(657, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Frogadier

        PokeList.add(new Pokemon(659, 6, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bunnelby

        PokeList.add(new Pokemon(661, 6, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Fletchling
        PokeList.add(new Pokemon(662, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Fletchinder

        PokeList.add(new Pokemon(664, 6, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Scatterbug
        PokeList.add(new Pokemon(665, 6, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Spewpa

        PokeList.add(new Pokemon(667, 6, Pokemon.Type.FIRE, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Litleo

        PokeList.add(new Pokemon(669, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Flabébé
        PokeList.add(new Pokemon(670, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Floette

        PokeList.add(new Pokemon(672, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skiddo
        PokeList.add(new Pokemon(674, 6, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pancham
        PokeList.add(new Pokemon(677, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Espurr

        PokeList.add(new Pokemon(679, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Honedge
        PokeList.add(new Pokemon(680, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.NFE)); // Doublade

        PokeList.add(new Pokemon(682, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Spritzee
        PokeList.add(new Pokemon(684, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Swirlix
        PokeList.add(new Pokemon(686, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Inkay
        PokeList.add(new Pokemon(688, 6, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Binacle
        PokeList.add(new Pokemon(690, 6, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Skrelp

        PokeList.add(new Pokemon(692, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clauncher
        PokeList.add(new Pokemon(694, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Helioptile
        PokeList.add(new Pokemon(696, 6, Pokemon.Type.ROCK, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Tyrunt
        PokeList.add(new Pokemon(698, 6, Pokemon.Type.ROCK, Pokemon.Type.ICE, Pokemon.Format.LC)); // Amaura

        PokeList.add(new Pokemon(704, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Goomy
        PokeList.add(new Pokemon(7050001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Sliggoo

        PokeList.add(new Pokemon(708, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Phantump
        PokeList.add(new Pokemon(710, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Pumpkaboo

        PokeList.add(new Pokemon(712, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bergmite
        PokeList.add(new Pokemon(714, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Noibat
    }
    //SEGMENT: GEN 7
    private void initBabyGen7() {
        PokeList.add(new Pokemon(190002, 7, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(270002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(370002, 7, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC));
        PokeList.add(new Pokemon(500002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(520002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC));

        PokeList.add(new Pokemon(740002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.LC));
        PokeList.add(new Pokemon(750002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.NFE));

        PokeList.add(new Pokemon(880002, 7, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC));

        PokeList.add(new Pokemon(722, 7, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Rowlet
        PokeList.add(new Pokemon(723, 7, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Dartrix

        PokeList.add(new Pokemon(725, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Litten
        PokeList.add(new Pokemon(726, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Torracat

        PokeList.add(new Pokemon(728, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Popplio
        PokeList.add(new Pokemon(729, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Brionne

        PokeList.add(new Pokemon(731, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Pikipek
        PokeList.add(new Pokemon(732, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Trumbeak

        PokeList.add(new Pokemon(734, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yungoos

        PokeList.add(new Pokemon(736, 7, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grubbin
        PokeList.add(new Pokemon(737, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NFE)); // Charjabug

        PokeList.add(new Pokemon(739, 7, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Crabrawler
        PokeList.add(new Pokemon(742, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cutiefly
        PokeList.add(new Pokemon(744, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rockruff
        PokeList.add(new Pokemon(747, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Mareanie
        PokeList.add(new Pokemon(749, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudbray

        PokeList.add(new Pokemon(751, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.LC)); // Dewpider
        PokeList.add(new Pokemon(753, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fomantis
        PokeList.add(new Pokemon(755, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Morelull
        PokeList.add(new Pokemon(757, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Salandit
        PokeList.add(new Pokemon(759, 7, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Stufful

        PokeList.add(new Pokemon(761, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bounsweet
        PokeList.add(new Pokemon(762, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Steenee

        PokeList.add(new Pokemon(767, 7, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.LC)); // Wimpod
        PokeList.add(new Pokemon(769, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Sandygast

        PokeList.add(new Pokemon(782, 7, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Jangmo-o
        PokeList.add(new Pokemon(783, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Hakamo-o

        PokeList.add(new Pokemon(789, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cosmog
        PokeList.add(new Pokemon(790, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Cosmoem

        PokeList.add(new Pokemon(803, 7, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poipole
        PokeList.add(new Pokemon(808, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meltan
    }
    //SEGMENT GEN 8 nat Dex:
    private void initBabyGen8nat() {
        PokeList.add(new Pokemon(520002, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(580002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Growlithe
        PokeList.add(new Pokemon(770002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ponyta
        PokeList.add(new Pokemon(790002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slowpoke
        PokeList.add(new Pokemon(830002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Farfetch'd

        PokeList.add(new Pokemon(1000002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Voltorb
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Weezing
        PokeList.add(new Pokemon(1220002, 8, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Mr.Mime
        PokeList.add(new Pokemon(2110002, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.LC)); // Qwilfish
        PokeList.add(new Pokemon(2150002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.LC)); // Sneasel

        PokeList.add(new Pokemon(2220002, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Corsola
        PokeList.add(new Pokemon(2630002, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Zigzagoon
        PokeList.add(new Pokemon(2640002, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.NFE)); // Linoone

        PokeList.add(new Pokemon(5540002, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Darumaka
        PokeList.add(new Pokemon(5700002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(7050002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Sliggo

        PokeList.add(new Pokemon(810, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grookey
        PokeList.add(new Pokemon(811, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Thwackey

        PokeList.add(new Pokemon(813, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Scorbunny
        PokeList.add(new Pokemon(814, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Raboot

        PokeList.add(new Pokemon(816, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sobble
        PokeList.add(new Pokemon(817, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Drizzile

        PokeList.add(new Pokemon(819, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skwovet

        PokeList.add(new Pokemon(821, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rookidee
        PokeList.add(new Pokemon(822, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Corvisquire

        PokeList.add(new Pokemon(824, 8, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Blipbug
        PokeList.add(new Pokemon(825, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.NFE)); // Dottler

        PokeList.add(new Pokemon(827, 8, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nickit
        PokeList.add(new Pokemon(829, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gossifleur
        PokeList.add(new Pokemon(831, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wooloo
        PokeList.add(new Pokemon(833, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chewtle
        PokeList.add(new Pokemon(835, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamper

        PokeList.add(new Pokemon(837, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rolycoly
        PokeList.add(new Pokemon(838, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Carkol

        PokeList.add(new Pokemon(840, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Applin
        PokeList.add(new Pokemon(843, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Silicobra

        PokeList.add(new Pokemon(846, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Arrokuda
        PokeList.add(new Pokemon(848, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.LC)); // Toxel
        PokeList.add(new Pokemon(850, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.LC)); // Sizzlipede
        PokeList.add(new Pokemon(852, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clobbopus
        PokeList.add(new Pokemon(854, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sinistea

        PokeList.add(new Pokemon(856, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hatenna
        PokeList.add(new Pokemon(857, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Hattrem

        PokeList.add(new Pokemon(859, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Impidimp
        PokeList.add(new Pokemon(860, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NFE)); // Morgrem
        PokeList.add(new Pokemon(868, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Milcery
        PokeList.add(new Pokemon(872, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.LC)); // Snom
        PokeList.add(new Pokemon(878, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cufant

        PokeList.add(new Pokemon(885, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Dreepy
        PokeList.add(new Pokemon(886, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.NFE)); // Drakloak

        PokeList.add(new Pokemon(891, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Kubfu
    }
    //SEGMENT Baby gen 8:
    private void initBabyGen8() {

        PokeList.add(new Pokemon(1, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Bulbasaur
        PokeList.add(new Pokemon(2, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Ivysaur

        PokeList.add(new Pokemon(4, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Charmander
        PokeList.add(new Pokemon(5, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Charmeleon

        PokeList.add(new Pokemon(7, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Squirtle
        PokeList.add(new Pokemon(8, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Wartortle

        PokeList.add(new Pokemon(10, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Caterpie
        PokeList.add(new Pokemon(11, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Metapod

        PokeList.add(new Pokemon(270001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sandshrew

        PokeList.add(new Pokemon(29, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nidoran♀
        PokeList.add(new Pokemon(30, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Nidorina

        PokeList.add(new Pokemon(32, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nidoran♂
        PokeList.add(new Pokemon(33, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Nidorino

        PokeList.add(new Pokemon(35, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clefairy
        PokeList.add(new Pokemon(37, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Vulpix
        PokeList.add(new Pokemon(39, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Jigglypuff
        PokeList.add(new Pokemon(41, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Zubat

        PokeList.add(new Pokemon(43, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Oddish
        PokeList.add(new Pokemon(44, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Gloom

        PokeList.add(new Pokemon(500001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Diglett
        PokeList.add(new Pokemon(520001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(54, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Psyduck

        PokeList.add(new Pokemon(580001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Growlithe

        PokeList.add(new Pokemon(60, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poliwag
        PokeList.add(new Pokemon(61, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Poliwhirl

        PokeList.add(new Pokemon(63, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Abra
        PokeList.add(new Pokemon(64, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Kadabra

        PokeList.add(new Pokemon(66, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Machop
        PokeList.add(new Pokemon(67, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Machoke

        PokeList.add(new Pokemon(70, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Weepinbell

        PokeList.add(new Pokemon(72, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.LC)); // Tentacool

        PokeList.add(new Pokemon(770001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ponyta
        PokeList.add(new Pokemon(790001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Slowpoke
        PokeList.add(new Pokemon(81, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Magnemite
        PokeList.add(new Pokemon(830001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Farfetch'd

        PokeList.add(new Pokemon(90, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellder

        PokeList.add(new Pokemon(98, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Krabby
        PokeList.add(new Pokemon(102, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Exeggcute
        PokeList.add(new Pokemon(104, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cubone

        PokeList.add(new Pokemon(109, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Koffing
        PokeList.add(new Pokemon(111, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Rhyhorn
        PokeList.add(new Pokemon(116, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Horsea
        PokeList.add(new Pokemon(118, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Goldeen
        PokeList.add(new Pokemon(120, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Staryu

        PokeList.add(new Pokemon(129, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magikarp
        PokeList.add(new Pokemon(1330001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Eevee
        PokeList.add(new Pokemon(138, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Omanyte
        PokeList.add(new Pokemon(140, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Kabuto

        PokeList.add(new Pokemon(147, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Dratini
        PokeList.add(new Pokemon(148, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dragonair

        PokeList.add(new Pokemon(163, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Hoothoot
        PokeList.add(new Pokemon(170, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Chinchou

        PokeList.add(new Pokemon(172, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pichu
        PokeList.add(new Pokemon(173, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cleffa
        PokeList.add(new Pokemon(174, 2, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Igglybuff

        PokeList.add(new Pokemon(175, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Togepi
        PokeList.add(new Pokemon(176, 2, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Togetic

        PokeList.add(new Pokemon(177, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Natu
        PokeList.add(new Pokemon(183, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Marill

        PokeList.add(new Pokemon(194, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Wooper

        PokeList.add(new Pokemon(220, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Swinub
        PokeList.add(new Pokemon(223, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Remoraid

        PokeList.add(new Pokemon(236, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tyrogue
        PokeList.add(new Pokemon(238, 2, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Smoochum
        PokeList.add(new Pokemon(239, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Elekid

        PokeList.add(new Pokemon(240, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magby

        PokeList.add(new Pokemon(246, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Larvitar
        PokeList.add(new Pokemon(247, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Pupitar

        PokeList.add(new Pokemon(252, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Treecko
        PokeList.add(new Pokemon(253, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Grovyle

        PokeList.add(new Pokemon(255, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Torchic
        PokeList.add(new Pokemon(256, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Combusken

        PokeList.add(new Pokemon(258, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudkip
        PokeList.add(new Pokemon(259, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Marshtomp

        PokeList.add(new Pokemon(2630001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Zigzagoon

        PokeList.add(new Pokemon(270, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Lotad
        PokeList.add(new Pokemon(271, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.NFE)); // Lombre

        PokeList.add(new Pokemon(273, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Seedot
        PokeList.add(new Pokemon(274, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Nuzleaf

        PokeList.add(new Pokemon(278, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Wingull

        PokeList.add(new Pokemon(280, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ralts
        PokeList.add(new Pokemon(281, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Kirlia

        PokeList.add(new Pokemon(290, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nincada

        PokeList.add(new Pokemon(293, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Whismur
        PokeList.add(new Pokemon(294, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Loudred

        PokeList.add(new Pokemon(298, 3, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Azurill

        PokeList.add(new Pokemon(304, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Aron
        PokeList.add(new Pokemon(305, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.NFE)); // Lairon

        PokeList.add(new Pokemon(309, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Electrike
        PokeList.add(new Pokemon(318, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.LC)); // Carvanha
        PokeList.add(new Pokemon(320, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wailmer

        PokeList.add(new Pokemon(328, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Trapinch
        PokeList.add(new Pokemon(329, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Vibrava

        PokeList.add(new Pokemon(333, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Swablu
        PokeList.add(new Pokemon(339, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Barboach
        PokeList.add(new Pokemon(341, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Corphish
        PokeList.add(new Pokemon(343, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Baltoy

        PokeList.add(new Pokemon(345, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Lileep
        PokeList.add(new Pokemon(347, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.LC)); // Anorith
        PokeList.add(new Pokemon(349, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Feebas
        PokeList.add(new Pokemon(353, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shuppet
        PokeList.add(new Pokemon(355, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Duskull

        PokeList.add(new Pokemon(360, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wynaut
        PokeList.add(new Pokemon(361, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snorunt

        PokeList.add(new Pokemon(363, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.LC)); // Spheal
        PokeList.add(new Pokemon(364, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NFE)); // Sealeo

        PokeList.add(new Pokemon(371, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bagon
        PokeList.add(new Pokemon(372, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Shelgon

        PokeList.add(new Pokemon(374, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Beldum
        PokeList.add(new Pokemon(375, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.NFE)); // Metang

        PokeList.add(new Pokemon(403, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shinx
        PokeList.add(new Pokemon(404, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Luxio

        PokeList.add(new Pokemon(406, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Budew
        PokeList.add(new Pokemon(415, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Combee

        PokeList.add(new Pokemon(420, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cherubi
        PokeList.add(new Pokemon(422, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellos
        PokeList.add(new Pokemon(425, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Drifloon
        PokeList.add(new Pokemon(427, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Buneary

        PokeList.add(new Pokemon(434, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC)); // Stunky
        PokeList.add(new Pokemon(436, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Bronzor
        PokeList.add(new Pokemon(438, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bonsly

        PokeList.add(new Pokemon(439, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Mime Jr.
        PokeList.add(new Pokemon(440, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Happiny
        PokeList.add(new Pokemon(443, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Gible
        PokeList.add(new Pokemon(444, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Gabite
        PokeList.add(new Pokemon(446, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Munchlax

        PokeList.add(new Pokemon(447, 4, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Riolu
        PokeList.add(new Pokemon(449, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hippopotas
        PokeList.add(new Pokemon(451, 4, Pokemon.Type.POISON, Pokemon.Type.BUG, Pokemon.Format.LC)); // Skorupi

        PokeList.add(new Pokemon(458, 4, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Mantyke
        PokeList.add(new Pokemon(459, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Snover

        PokeList.add(new Pokemon(506, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Lillipup
        PokeList.add(new Pokemon(507, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Herdier

        PokeList.add(new Pokemon(509, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Purrloin

        PokeList.add(new Pokemon(517, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Munna

        PokeList.add(new Pokemon(519, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Pidove
        PokeList.add(new Pokemon(520, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Tranquill

        PokeList.add(new Pokemon(524, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Roggenrola
        PokeList.add(new Pokemon(525, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Boldore

        PokeList.add(new Pokemon(527, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Woobat

        PokeList.add(new Pokemon(529, 5, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Drilbur

        PokeList.add(new Pokemon(532, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Timburr
        PokeList.add(new Pokemon(533, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gurdurr

        PokeList.add(new Pokemon(535, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tympole
        PokeList.add(new Pokemon(536, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Palpitoad

        PokeList.add(new Pokemon(543, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Venipede
        PokeList.add(new Pokemon(544, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Whirlipede

        PokeList.add(new Pokemon(546, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cottonee
        PokeList.add(new Pokemon(548, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Petilil

        PokeList.add(new Pokemon(551, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.LC)); // Sandile
        PokeList.add(new Pokemon(552, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Krokorok

        PokeList.add(new Pokemon(5540001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Darumaka
        PokeList.add(new Pokemon(557, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Dwebble
        PokeList.add(new Pokemon(559, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Scraggy
        PokeList.add(new Pokemon(5620001, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamask
        PokeList.add(new Pokemon(564, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Tirtouga

        PokeList.add(new Pokemon(566, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Archen
        PokeList.add(new Pokemon(568, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Trubbish
        PokeList.add(new Pokemon(5700001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(572, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Minccino

        PokeList.add(new Pokemon(574, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gothita
        PokeList.add(new Pokemon(575, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gothorita

        PokeList.add(new Pokemon(577, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Solosis
        PokeList.add(new Pokemon(578, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Duosion

        PokeList.add(new Pokemon(582, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Vanillite
        PokeList.add(new Pokemon(583, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Vanillish

        PokeList.add(new Pokemon(588, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Karrablast
        PokeList.add(new Pokemon(590, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Foongus
        PokeList.add(new Pokemon(592, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Frillish
        PokeList.add(new Pokemon(595, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Joltik

        PokeList.add(new Pokemon(597, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Ferroseed

        PokeList.add(new Pokemon(599, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Klink
        PokeList.add(new Pokemon(600, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Klang

        PokeList.add(new Pokemon(605, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Elgyem

        PokeList.add(new Pokemon(607, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Litwick
        PokeList.add(new Pokemon(608, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Lampent

        PokeList.add(new Pokemon(610, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Axew
        PokeList.add(new Pokemon(611, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Fraxure

        PokeList.add(new Pokemon(613, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cubchoo
        PokeList.add(new Pokemon(616, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shelmet
        PokeList.add(new Pokemon(619, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mienfoo
        PokeList.add(new Pokemon(622, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Golett
        PokeList.add(new Pokemon(624, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Pawniard

        PokeList.add(new Pokemon(627, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Rufflet
        PokeList.add(new Pokemon(629, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Vullaby

        PokeList.add(new Pokemon(633, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Deino
        PokeList.add(new Pokemon(634, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Zweilous

        PokeList.add(new Pokemon(636, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Larvesta

        PokeList.add(new Pokemon(659, 6, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bunnelby

        PokeList.add(new Pokemon(661, 6, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Fletchling
        PokeList.add(new Pokemon(662, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Fletchinder

        PokeList.add(new Pokemon(674, 6, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pancham
        PokeList.add(new Pokemon(677, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Espurr

        PokeList.add(new Pokemon(679, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Honedge
        PokeList.add(new Pokemon(680, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.NFE)); // Doublade

        PokeList.add(new Pokemon(682, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Spritzee
        PokeList.add(new Pokemon(684, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Swirlix
        PokeList.add(new Pokemon(686, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Inkay
        PokeList.add(new Pokemon(688, 6, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.LC)); // Binacle
        PokeList.add(new Pokemon(690, 6, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Skrelp

        PokeList.add(new Pokemon(692, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clauncher
        PokeList.add(new Pokemon(694, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Helioptile
        PokeList.add(new Pokemon(696, 6, Pokemon.Type.ROCK, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Tyrunt
        PokeList.add(new Pokemon(698, 6, Pokemon.Type.ROCK, Pokemon.Type.ICE, Pokemon.Format.LC)); // Amaura

        PokeList.add(new Pokemon(704, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Goomy
        PokeList.add(new Pokemon(7050001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Sliggoo

        PokeList.add(new Pokemon(708, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Phantump
        PokeList.add(new Pokemon(710, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Pumpkaboo

        PokeList.add(new Pokemon(712, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bergmite
        PokeList.add(new Pokemon(714, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Noibat

        PokeList.add(new Pokemon(270002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(370002, 7, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC));
        PokeList.add(new Pokemon(500002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(520002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC));

        PokeList.add(new Pokemon(880002, 7, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC));

        PokeList.add(new Pokemon(725, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Litten
        PokeList.add(new Pokemon(726, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Torracat

        PokeList.add(new Pokemon(728, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Popplio
        PokeList.add(new Pokemon(729, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Brionne

        PokeList.add(new Pokemon(736, 7, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grubbin
        PokeList.add(new Pokemon(737, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NFE)); // Charjabug

        PokeList.add(new Pokemon(742, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cutiefly
        PokeList.add(new Pokemon(744, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rockruff
        PokeList.add(new Pokemon(747, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Mareanie
        PokeList.add(new Pokemon(749, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudbray

        PokeList.add(new Pokemon(751, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.LC)); // Dewpider
        PokeList.add(new Pokemon(753, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fomantis
        PokeList.add(new Pokemon(755, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Morelull
        PokeList.add(new Pokemon(757, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Salandit
        PokeList.add(new Pokemon(759, 7, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Stufful

        PokeList.add(new Pokemon(761, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bounsweet
        PokeList.add(new Pokemon(762, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Steenee

        PokeList.add(new Pokemon(767, 7, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.LC)); // Wimpod
        PokeList.add(new Pokemon(769, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Sandygast

        PokeList.add(new Pokemon(782, 7, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Jangmo-o
        PokeList.add(new Pokemon(783, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Hakamo-o

        PokeList.add(new Pokemon(789, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cosmog
        PokeList.add(new Pokemon(790, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Cosmoem

        PokeList.add(new Pokemon(803, 7, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poipole
        PokeList.add(new Pokemon(808, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meltan

        PokeList.add(new Pokemon(520002, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(580002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Growlithe
        PokeList.add(new Pokemon(770002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ponyta
        PokeList.add(new Pokemon(790002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slowpoke
        PokeList.add(new Pokemon(830002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Farfetch'd

        PokeList.add(new Pokemon(1000002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Voltorb
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Weezing
        PokeList.add(new Pokemon(1220002, 8, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Mr.Mime
        PokeList.add(new Pokemon(2110002, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.LC)); // Qwilfish
        PokeList.add(new Pokemon(2150002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.LC)); // Sneasel

        PokeList.add(new Pokemon(2220002, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Corsola
        PokeList.add(new Pokemon(2630002, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Zigzagoon
        PokeList.add(new Pokemon(2640002, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.NFE)); // Linoone

        PokeList.add(new Pokemon(5540002, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Darumaka
        PokeList.add(new Pokemon(5700002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(7050002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Sliggo

        PokeList.add(new Pokemon(810, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grookey
        PokeList.add(new Pokemon(811, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Thwackey

        PokeList.add(new Pokemon(813, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Scorbunny
        PokeList.add(new Pokemon(814, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Raboot

        PokeList.add(new Pokemon(816, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sobble
        PokeList.add(new Pokemon(817, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Drizzile

        PokeList.add(new Pokemon(819, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skwovet

        PokeList.add(new Pokemon(821, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rookidee
        PokeList.add(new Pokemon(822, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Corvisquire

        PokeList.add(new Pokemon(824, 8, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Blipbug
        PokeList.add(new Pokemon(825, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.NFE)); // Dottler

        PokeList.add(new Pokemon(827, 8, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nickit
        PokeList.add(new Pokemon(829, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gossifleur
        PokeList.add(new Pokemon(831, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wooloo
        PokeList.add(new Pokemon(833, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chewtle
        PokeList.add(new Pokemon(835, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamper

        PokeList.add(new Pokemon(837, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rolycoly
        PokeList.add(new Pokemon(838, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Carkol

        PokeList.add(new Pokemon(840, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Applin
        PokeList.add(new Pokemon(843, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Silicobra

        PokeList.add(new Pokemon(846, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Arrokuda
        PokeList.add(new Pokemon(848, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.LC)); // Toxel
        PokeList.add(new Pokemon(850, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.LC)); // Sizzlipede
        PokeList.add(new Pokemon(852, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clobbopus
        PokeList.add(new Pokemon(854, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sinistea

        PokeList.add(new Pokemon(856, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hatenna
        PokeList.add(new Pokemon(857, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Hattrem

        PokeList.add(new Pokemon(859, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Impidimp
        PokeList.add(new Pokemon(860, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NFE)); // Morgrem
        PokeList.add(new Pokemon(868, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Milcery
        PokeList.add(new Pokemon(872, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.LC)); // Snom
        PokeList.add(new Pokemon(878, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cufant

        PokeList.add(new Pokemon(885, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Dreepy
        PokeList.add(new Pokemon(886, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.NFE)); // Drakloak

        PokeList.add(new Pokemon(891, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Kubfu
    }
    //SEGMENT GEN 9 nat Dex:
    private void initBabyGen9nat() {
        PokeList.add(new Pokemon(906, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sprigatito
        PokeList.add(new Pokemon(907, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Floragato

        PokeList.add(new Pokemon(909, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fuecoco
        PokeList.add(new Pokemon(910, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Crocalor

        PokeList.add(new Pokemon(912, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Quaxly
        PokeList.add(new Pokemon(913, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quaxwell

        PokeList.add(new Pokemon(915, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Lechonk
        PokeList.add(new Pokemon(917, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tarountula
        PokeList.add(new Pokemon(919, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nymble

        PokeList.add(new Pokemon(921, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pawmi
        PokeList.add(new Pokemon(922, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Pawmo

        PokeList.add(new Pokemon(924, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tandemaus
        PokeList.add(new Pokemon(926, 9, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fidough

        PokeList.add(new Pokemon(928, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Smoliv
        PokeList.add(new Pokemon(929, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.NFE)); // Dolliv

        PokeList.add(new Pokemon(932, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nacli
        PokeList.add(new Pokemon(933, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Naclstack

        PokeList.add(new Pokemon(935, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Charcadet
        PokeList.add(new Pokemon(938, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tadbulb
        PokeList.add(new Pokemon(940, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Wattrel
        PokeList.add(new Pokemon(942, 9, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Maschiff
        PokeList.add(new Pokemon(944, 9, Pokemon.Type.POISON, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Shroodle

        PokeList.add(new Pokemon(946, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Bramblin
        PokeList.add(new Pokemon(948, 9, Pokemon.Type.GROUND, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Toedscool
        PokeList.add(new Pokemon(951, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Capsakid
        PokeList.add(new Pokemon(953, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rellor
        PokeList.add(new Pokemon(955, 9, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Flittle

        PokeList.add(new Pokemon(957, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Tinkatink
        PokeList.add(new Pokemon(958, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.NFE)); // Tinkatuff

        PokeList.add(new Pokemon(960, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wiglett
        PokeList.add(new Pokemon(963, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Finizen
        PokeList.add(new Pokemon(965, 9, Pokemon.Type.STEEL, Pokemon.Type.POISON, Pokemon.Format.LC)); // Varoom
        PokeList.add(new Pokemon(969, 9, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.LC)); // Glimmet
        PokeList.add(new Pokemon(971, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Greavard

        PokeList.add(new Pokemon(974, 9, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cetoddle

        PokeList.add(new Pokemon(996, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.LC)); // Frigibax
        PokeList.add(new Pokemon(997, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.NFE)); // Arctibax

        PokeList.add(new Pokemon(999, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gimmighoul
        PokeList.add(new Pokemon(1012, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Poltchageist
    }
    //SEGMENT Gen 9 Baby
    private void initBabyGen9() {

        PokeList.add(new Pokemon(1, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Bulbasaur
        PokeList.add(new Pokemon(2, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Ivysaur

        PokeList.add(new Pokemon(4, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Charmander
        PokeList.add(new Pokemon(5, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Charmeleon

        PokeList.add(new Pokemon(7, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Squirtle
        PokeList.add(new Pokemon(8, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Wartortle

        PokeList.add(new Pokemon(23, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ekans
        PokeList.add(new Pokemon(270001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sandshrew

        PokeList.add(new Pokemon(35, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clefairy
        PokeList.add(new Pokemon(37, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Vulpix
        PokeList.add(new Pokemon(39, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Jigglypuff

        PokeList.add(new Pokemon(43, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Oddish
        PokeList.add(new Pokemon(44, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Gloom

        PokeList.add(new Pokemon(48, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Venonat
        PokeList.add(new Pokemon(500001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Diglett
        PokeList.add(new Pokemon(520001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(54, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Psyduck

        PokeList.add(new Pokemon(56, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mankey
        PokeList.add(new Pokemon(580001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Growlithe

        PokeList.add(new Pokemon(60, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poliwag
        PokeList.add(new Pokemon(61, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Poliwhirl

        PokeList.add(new Pokemon(69, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Bellsprout
        PokeList.add(new Pokemon(70, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NFE)); // Weepinbell

        PokeList.add(new Pokemon(72, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.LC)); // Tentacool

        PokeList.add(new Pokemon(740001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Geodude
        PokeList.add(new Pokemon(750001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Graveler

        PokeList.add(new Pokemon(790001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Slowpoke
        PokeList.add(new Pokemon(81, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Magnemite
        PokeList.add(new Pokemon(84, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Doduo

        PokeList.add(new Pokemon(86, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Seel
        PokeList.add(new Pokemon(88, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grimer
        PokeList.add(new Pokemon(90, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellder

        PokeList.add(new Pokemon(96, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Drowzee
        PokeList.add(new Pokemon(100001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Voltorb
        PokeList.add(new Pokemon(102, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Exeggcute

        PokeList.add(new Pokemon(109, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Koffing
        PokeList.add(new Pokemon(111, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Rhyhorn
        PokeList.add(new Pokemon(116, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Horsea

        PokeList.add(new Pokemon(129, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magikarp
        PokeList.add(new Pokemon(1330001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Eevee

        PokeList.add(new Pokemon(147, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Dratini
        PokeList.add(new Pokemon(148, 1, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dragonair

        PokeList.add(new Pokemon(152, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chikorita
        PokeList.add(new Pokemon(153, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Bayleef

        PokeList.add(new Pokemon(155, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cyndaquil
        PokeList.add(new Pokemon(156, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quilava

        PokeList.add(new Pokemon(158, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Totodile
        PokeList.add(new Pokemon(159, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Croconaw

        PokeList.add(new Pokemon(161, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sentret
        PokeList.add(new Pokemon(163, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Hoothoot
        PokeList.add(new Pokemon(167, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.LC)); // Spinarak
        PokeList.add(new Pokemon(170, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Chinchou

        PokeList.add(new Pokemon(172, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pichu
        PokeList.add(new Pokemon(173, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cleffa
        PokeList.add(new Pokemon(174, 2, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Igglybuff

        PokeList.add(new Pokemon(176, 2, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Togetic

        PokeList.add(new Pokemon(179, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mareep
        PokeList.add(new Pokemon(180, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Flaaffy

        PokeList.add(new Pokemon(183, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Marill

        PokeList.add(new Pokemon(187, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Hoppip
        PokeList.add(new Pokemon(188, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Skiploom

        PokeList.add(new Pokemon(190, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Aipom
        PokeList.add(new Pokemon(191, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sunkern
        PokeList.add(new Pokemon(194, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Wooper
        PokeList.add(new Pokemon(198, 2, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Murkrow
        PokeList.add(new Pokemon(204, 2, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pineco

        PokeList.add(new Pokemon(209, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snubbull
        PokeList.add(new Pokemon(216, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Teddiursa
        PokeList.add(new Pokemon(218, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slugma
        PokeList.add(new Pokemon(220, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Swinub

        PokeList.add(new Pokemon(228, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Houndour
        PokeList.add(new Pokemon(231, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Phanpy
        PokeList.add(new Pokemon(236, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tyrogue
        PokeList.add(new Pokemon(239, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Elekid

        PokeList.add(new Pokemon(240, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Magby

        PokeList.add(new Pokemon(246, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Larvitar
        PokeList.add(new Pokemon(247, 2, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Pupitar

        PokeList.add(new Pokemon(252, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Treecko
        PokeList.add(new Pokemon(253, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Grovyle

        PokeList.add(new Pokemon(255, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Torchic
        PokeList.add(new Pokemon(256, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Combusken

        PokeList.add(new Pokemon(258, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudkip
        PokeList.add(new Pokemon(259, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Marshtomp

        PokeList.add(new Pokemon(261, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poochyena

        PokeList.add(new Pokemon(270, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Lotad
        PokeList.add(new Pokemon(271, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.NFE)); // Lombre

        PokeList.add(new Pokemon(273, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Seedot
        PokeList.add(new Pokemon(274, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Nuzleaf

        PokeList.add(new Pokemon(278, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Wingull

        PokeList.add(new Pokemon(280, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Ralts
        PokeList.add(new Pokemon(281, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Kirlia

        PokeList.add(new Pokemon(283, 3, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.LC)); // Surskit
        PokeList.add(new Pokemon(285, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shroomish
        PokeList.add(new Pokemon(287, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slakoth
        PokeList.add(new Pokemon(288, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Vigoroth

        PokeList.add(new Pokemon(296, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Makuhita
        PokeList.add(new Pokemon(298, 3, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Azurill

        PokeList.add(new Pokemon(307, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Meditite
        PokeList.add(new Pokemon(316, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gulpin
        PokeList.add(new Pokemon(320, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wailmer

        PokeList.add(new Pokemon(322, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Numel
        PokeList.add(new Pokemon(325, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Spoink

        PokeList.add(new Pokemon(328, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Trapinch
        PokeList.add(new Pokemon(329, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Vibrava

        PokeList.add(new Pokemon(331, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cacnea
        PokeList.add(new Pokemon(333, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Swablu
        PokeList.add(new Pokemon(339, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Barboach
        PokeList.add(new Pokemon(341, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Corphish

        PokeList.add(new Pokemon(349, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Feebas
        PokeList.add(new Pokemon(353, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shuppet
        PokeList.add(new Pokemon(355, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Duskull

        PokeList.add(new Pokemon(361, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snorunt

        PokeList.add(new Pokemon(371, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bagon
        PokeList.add(new Pokemon(372, 3, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Shelgon

        PokeList.add(new Pokemon(374, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Beldum
        PokeList.add(new Pokemon(375, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.NFE)); // Metang

        PokeList.add(new Pokemon(387, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Turtwig
        PokeList.add(new Pokemon(388, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Grotle

        PokeList.add(new Pokemon(390, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chimchar
        PokeList.add(new Pokemon(391, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Monferno

        PokeList.add(new Pokemon(393, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Piplup
        PokeList.add(new Pokemon(394, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Prinplup

        PokeList.add(new Pokemon(396, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Starly
        PokeList.add(new Pokemon(397, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Staravia

        PokeList.add(new Pokemon(401, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Kricketot

        PokeList.add(new Pokemon(403, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shinx
        PokeList.add(new Pokemon(404, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Luxio

        PokeList.add(new Pokemon(408, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cranidos
        PokeList.add(new Pokemon(410, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Shieldon
        PokeList.add(new Pokemon(415, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Combee

        PokeList.add(new Pokemon(418, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Buizel
        PokeList.add(new Pokemon(422, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Shellos
        PokeList.add(new Pokemon(425, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Drifloon

        PokeList.add(new Pokemon(433, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chingling
        PokeList.add(new Pokemon(434, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC)); // Stunky
        PokeList.add(new Pokemon(436, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Bronzor
        PokeList.add(new Pokemon(438, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bonsly

        PokeList.add(new Pokemon(440, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Happiny
        PokeList.add(new Pokemon(443, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Gible
        PokeList.add(new Pokemon(444, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.NFE)); // Gabite
        PokeList.add(new Pokemon(446, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Munchlax

        PokeList.add(new Pokemon(447, 4, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Riolu
        PokeList.add(new Pokemon(449, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hippopotas
        PokeList.add(new Pokemon(453, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Croagunk
        PokeList.add(new Pokemon(456, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Finneon

        PokeList.add(new Pokemon(459, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Snover

        PokeList.add(new Pokemon(495, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Snivy
        PokeList.add(new Pokemon(496, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Servine

        PokeList.add(new Pokemon(498, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tepig
        PokeList.add(new Pokemon(499, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Pignite

        PokeList.add(new Pokemon(501, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Oshawott
        PokeList.add(new Pokemon(502, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dewott

        PokeList.add(new Pokemon(522, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Blitzle

        PokeList.add(new Pokemon(529, 5, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Drilbur

        PokeList.add(new Pokemon(532, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Timburr
        PokeList.add(new Pokemon(533, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gurdurr

        PokeList.add(new Pokemon(540, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Sewaddle
        PokeList.add(new Pokemon(541, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.NFE)); // Swadloon

        PokeList.add(new Pokemon(546, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cottonee
        PokeList.add(new Pokemon(548, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Petilil

        PokeList.add(new Pokemon(551, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.LC)); // Sandile
        PokeList.add(new Pokemon(552, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.NFE)); // Krokorok

        PokeList.add(new Pokemon(559, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.LC)); // Scraggy
        PokeList.add(new Pokemon(5620001, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamask

        PokeList.add(new Pokemon(5700001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(572, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Minccino

        PokeList.add(new Pokemon(574, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gothita
        PokeList.add(new Pokemon(575, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Gothorita

        PokeList.add(new Pokemon(577, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Solosis
        PokeList.add(new Pokemon(578, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Duosion

        PokeList.add(new Pokemon(580, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Ducklett

        PokeList.add(new Pokemon(585, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Deerling
        PokeList.add(new Pokemon(590, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.LC)); // Foongus
        PokeList.add(new Pokemon(595, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.LC)); // Joltik

        PokeList.add(new Pokemon(602, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tynamo
        PokeList.add(new Pokemon(603, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Eelektrik

        PokeList.add(new Pokemon(607, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Litwick
        PokeList.add(new Pokemon(608, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Lampent

        PokeList.add(new Pokemon(610, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Axew
        PokeList.add(new Pokemon(611, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Fraxure

        PokeList.add(new Pokemon(613, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cubchoo
        PokeList.add(new Pokemon(619, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mienfoo
        PokeList.add(new Pokemon(622, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Golett
        PokeList.add(new Pokemon(624, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Pawniard

        PokeList.add(new Pokemon(627, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Rufflet
        PokeList.add(new Pokemon(629, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Vullaby

        PokeList.add(new Pokemon(633, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Deino
        PokeList.add(new Pokemon(634, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Zweilous

        PokeList.add(new Pokemon(636, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Larvesta

        PokeList.add(new Pokemon(650, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chespin
        PokeList.add(new Pokemon(651, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quilladin

        PokeList.add(new Pokemon(653, 6, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fennekin
        PokeList.add(new Pokemon(654, 6, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Braixen

        PokeList.add(new Pokemon(656, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Froakie
        PokeList.add(new Pokemon(657, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Frogadier

        PokeList.add(new Pokemon(661, 6, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Fletchling
        PokeList.add(new Pokemon(662, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Fletchinder

        PokeList.add(new Pokemon(664, 6, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Scatterbug
        PokeList.add(new Pokemon(665, 6, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Spewpa

        PokeList.add(new Pokemon(667, 6, Pokemon.Type.FIRE, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Litleo

        PokeList.add(new Pokemon(669, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Flabébé
        PokeList.add(new Pokemon(670, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Floette

        PokeList.add(new Pokemon(672, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skiddo
        PokeList.add(new Pokemon(677, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Espurr

        PokeList.add(new Pokemon(684, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Swirlix
        PokeList.add(new Pokemon(686, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Inkay
        PokeList.add(new Pokemon(690, 6, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Skrelp

        PokeList.add(new Pokemon(692, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Clauncher

        PokeList.add(new Pokemon(704, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Goomy
        PokeList.add(new Pokemon(7050001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Sliggoo

        PokeList.add(new Pokemon(708, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Phantump

        PokeList.add(new Pokemon(712, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bergmite
        PokeList.add(new Pokemon(714, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Noibat

        PokeList.add(new Pokemon(270002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(370002, 7, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC));
        PokeList.add(new Pokemon(500002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.LC));
        PokeList.add(new Pokemon(520002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC));

        PokeList.add(new Pokemon(740002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.LC));
        PokeList.add(new Pokemon(750002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.NFE));

        PokeList.add(new Pokemon(880002, 7, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.LC));

        PokeList.add(new Pokemon(722, 7, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Rowlet
        PokeList.add(new Pokemon(723, 7, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Dartrix

        PokeList.add(new Pokemon(725, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Litten
        PokeList.add(new Pokemon(726, 7, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Torracat

        PokeList.add(new Pokemon(728, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Popplio
        PokeList.add(new Pokemon(729, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Brionne

        PokeList.add(new Pokemon(731, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Pikipek
        PokeList.add(new Pokemon(732, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NFE)); // Trumbeak

        PokeList.add(new Pokemon(734, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yungoos

        PokeList.add(new Pokemon(736, 7, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grubbin
        PokeList.add(new Pokemon(737, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NFE)); // Charjabug

        PokeList.add(new Pokemon(739, 7, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Crabrawler
        PokeList.add(new Pokemon(742, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Cutiefly
        PokeList.add(new Pokemon(744, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rockruff
        PokeList.add(new Pokemon(747, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.LC)); // Mareanie
        PokeList.add(new Pokemon(749, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Mudbray

        PokeList.add(new Pokemon(751, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.LC)); // Dewpider
        PokeList.add(new Pokemon(753, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fomantis
        PokeList.add(new Pokemon(757, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.LC)); // Salandit

        PokeList.add(new Pokemon(761, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Bounsweet
        PokeList.add(new Pokemon(762, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Steenee

        PokeList.add(new Pokemon(769, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Sandygast

        PokeList.add(new Pokemon(782, 7, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Jangmo-o
        PokeList.add(new Pokemon(783, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Hakamo-o

        PokeList.add(new Pokemon(789, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cosmog
        PokeList.add(new Pokemon(790, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Cosmoem

        PokeList.add(new Pokemon(803, 7, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.LC)); // Poipole
        PokeList.add(new Pokemon(808, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meltan

        PokeList.add(new Pokemon(520002, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Meowth
        PokeList.add(new Pokemon(580002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.LC)); // Growlithe
        PokeList.add(new Pokemon(790002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Slowpoke

        PokeList.add(new Pokemon(1000002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Voltorb
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Weezing
        PokeList.add(new Pokemon(1220002, 8, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.LC)); // Mr.Mime
        PokeList.add(new Pokemon(2110002, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.LC)); // Qwilfish
        PokeList.add(new Pokemon(2150002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.LC)); // Sneasel

        PokeList.add(new Pokemon(5700002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Zorua
        PokeList.add(new Pokemon(7050002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NFE)); // Sliggo

        PokeList.add(new Pokemon(810, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Grookey
        PokeList.add(new Pokemon(811, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Thwackey

        PokeList.add(new Pokemon(813, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Scorbunny
        PokeList.add(new Pokemon(814, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Raboot

        PokeList.add(new Pokemon(816, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sobble
        PokeList.add(new Pokemon(817, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Drizzile

        PokeList.add(new Pokemon(819, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Skwovet

        PokeList.add(new Pokemon(821, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rookidee
        PokeList.add(new Pokemon(822, 8, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Corvisquire

        PokeList.add(new Pokemon(833, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Chewtle
        PokeList.add(new Pokemon(835, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Yamper

        PokeList.add(new Pokemon(837, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rolycoly
        PokeList.add(new Pokemon(838, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.NFE)); // Carkol

        PokeList.add(new Pokemon(840, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.LC)); // Applin
        PokeList.add(new Pokemon(843, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.LC)); // Silicobra

        PokeList.add(new Pokemon(846, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Arrokuda
        PokeList.add(new Pokemon(848, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.LC)); // Toxel
        PokeList.add(new Pokemon(854, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sinistea

        PokeList.add(new Pokemon(856, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Hatenna
        PokeList.add(new Pokemon(857, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Hattrem

        PokeList.add(new Pokemon(859, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.LC)); // Impidimp
        PokeList.add(new Pokemon(860, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NFE)); // Morgrem
        PokeList.add(new Pokemon(868, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Milcery
        PokeList.add(new Pokemon(872, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.LC)); // Snom
        PokeList.add(new Pokemon(878, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cufant

        PokeList.add(new Pokemon(885, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Dreepy
        PokeList.add(new Pokemon(886, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.NFE)); // Drakloak

        PokeList.add(new Pokemon(891, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.LC)); // Kubfu

        PokeList.add(new Pokemon(906, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Sprigatito
        PokeList.add(new Pokemon(907, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Floragato

        PokeList.add(new Pokemon(909, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fuecoco
        PokeList.add(new Pokemon(910, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Crocalor

        PokeList.add(new Pokemon(912, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Quaxly
        PokeList.add(new Pokemon(913, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Quaxwell

        PokeList.add(new Pokemon(915, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Lechonk
        PokeList.add(new Pokemon(917, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tarountula
        PokeList.add(new Pokemon(919, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nymble

        PokeList.add(new Pokemon(921, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pawmi
        PokeList.add(new Pokemon(922, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FIGHTING, Pokemon.Format.NFE)); // Pawmo

        PokeList.add(new Pokemon(924, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tandemaus
        PokeList.add(new Pokemon(926, 9, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.LC)); // Fidough

        PokeList.add(new Pokemon(928, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Smoliv
        PokeList.add(new Pokemon(929, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.NFE)); // Dolliv

        PokeList.add(new Pokemon(932, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Nacli
        PokeList.add(new Pokemon(933, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Naclstack

        PokeList.add(new Pokemon(935, 9, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Charcadet
        PokeList.add(new Pokemon(938, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Tadbulb
        PokeList.add(new Pokemon(940, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.LC)); // Wattrel
        PokeList.add(new Pokemon(942, 9, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.LC)); // Maschiff
        PokeList.add(new Pokemon(944, 9, Pokemon.Type.POISON, Pokemon.Type.NORMAL, Pokemon.Format.LC)); // Shroodle

        PokeList.add(new Pokemon(946, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Bramblin
        PokeList.add(new Pokemon(948, 9, Pokemon.Type.GROUND, Pokemon.Type.GRASS, Pokemon.Format.LC)); // Toedscool
        PokeList.add(new Pokemon(951, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.LC)); // Capsakid
        PokeList.add(new Pokemon(953, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.LC)); // Rellor
        PokeList.add(new Pokemon(955, 9, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Flittle

        PokeList.add(new Pokemon(957, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.LC)); // Tinkatink
        PokeList.add(new Pokemon(958, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.NFE)); // Tinkatuff

        PokeList.add(new Pokemon(960, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Wiglett
        PokeList.add(new Pokemon(963, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.LC)); // Finizen
        PokeList.add(new Pokemon(965, 9, Pokemon.Type.STEEL, Pokemon.Type.POISON, Pokemon.Format.LC)); // Varoom
        PokeList.add(new Pokemon(969, 9, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.LC)); // Glimmet
        PokeList.add(new Pokemon(971, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Greavard

        PokeList.add(new Pokemon(974, 9, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.LC)); // Cetoddle

        PokeList.add(new Pokemon(996, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.LC)); // Frigibax
        PokeList.add(new Pokemon(997, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.NFE)); // Arctibax

        PokeList.add(new Pokemon(999, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.LC)); // Gimmighoul
        PokeList.add(new Pokemon(1012, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.LC)); // Poltchageist
    }
    private void initBabyGen1to7() {
        initBabyGen1();
        initBabyGen2();
        initBabyGen3();
        initBabyGen4();
        initBabyGen5();
        initBabyGen6();
        initBabyGen7();
    }
    //SEGMENT: META POKEMONS
    //SEGMENT: GEN 1
    private void initGen1() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Blastoise
        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree
        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Beedrill

        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Pidgeot
        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.LC)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Clefable

        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Rapidash
        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Slowbro
        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.OU)); // Cloyster

        PokeList.add(new Pokemon(92, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Gastly
        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar

        PokeList.add(new Pokemon(95, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Onix
        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Weezing

        PokeList.add(new Pokemon(112, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.OU)); // Rhydon
        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Kangaskhan
        PokeList.add(new Pokemon(117, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Seadra

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jynx

        PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electabuzz
        PokeList.add(new Pokemon(126, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Magmar
        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.PU)); // Pinsir
        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tauros
        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.OU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Flareon

        PokeList.add(new Pokemon(137, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Porygon
        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.NU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Aerodactyl
        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Dragonite
        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mew
    }
    //SEGMENT: GEN 2
    private void initGen2() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blastoise
        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree
        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Beedrill

        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pidgeot
        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Clefable
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.NU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.OU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Rapidash
        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Slowbro
        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.OU)); // Cloyster

        PokeList.add(new Pokemon(92, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Gastly
        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar

        PokeList.add(new Pokemon(95, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Onix
        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonchan
        PokeList.add(new Pokemon(108, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lickitung
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(112, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.OU)); // Rhydon
        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Kangaskhan
        PokeList.add(new Pokemon(117, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seadra

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jynx

        PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electabuzz
        PokeList.add(new Pokemon(126, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmar
        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.UU)); // Pinsir
        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tauros
        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.OU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Flareon

        PokeList.add(new Pokemon(137, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Porygon
        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Aerodactyl
        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite
        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.UU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ampharos
        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sunflora
        PokeList.add(new Pokemon(193, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Yanma
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.OU)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Steelix
        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Qwilfish
        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor
        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Heracross
        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.PU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory
        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Houndoom

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UBER)); // Celebi
    }
    //SEGMENT: GEN 3
    private void initGen3() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blastoise
        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree
        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Beedrill

        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pidgeot
        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Clefable
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Rapidash
        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Slowbro
        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.OU)); // Cloyster

        PokeList.add(new Pokemon(92, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Gastly
        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.NU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar

        PokeList.add(new Pokemon(95, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.LC)); // Onix
        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonchan
        PokeList.add(new Pokemon(108, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lickitung
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.OU)); // Weezing

        PokeList.add(new Pokemon(112, 1, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.OU)); // Rhydon
        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Kangaskhan
        PokeList.add(new Pokemon(117, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seadra

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jynx

        PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Electabuzz
        PokeList.add(new Pokemon(126, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Magmar
        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.UU)); // Pinsir
        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tauros
        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Flareon

        PokeList.add(new Pokemon(137, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Porygon
        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.RU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Aerodactyl
        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite
        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.UU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ampharos
        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sunflora
        PokeList.add(new Pokemon(193, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Yanma
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UU)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Steelix
        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Qwilfish
        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor
        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Heracross
        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.RU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory
        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Houndoom

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.OU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Sceptile
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Blaziken
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Swampert

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mightyena
        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Linoone
        PokeList.add(new Pokemon(267, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Beautifly
        PokeList.add(new Pokemon(269, 3, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Dustox
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.OU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.RU)); // Shiftry
        PokeList.add(new Pokemon(277, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Swellow
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pelipper
        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Gardevoir
        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Slaking
        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Exploud

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Hariyama
        PokeList.add(new Pokemon(299, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Nosepass
        PokeList.add(new Pokemon(301, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Delcatty
        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Sableye
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Mawile

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Aggron
        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Medicham
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Manectric
        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Illumise
        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Roselia
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Swalot
        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.RU)); // Sharpedo

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Wailord
        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Camerupt
        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Grumpig
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NU)); // Cacturne
        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Altaria
        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seviper

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.NU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.OU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Milotic
        PokeList.add(new Pokemon(351, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Castform
        PokeList.add(new Pokemon(352, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kecleon

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Banette
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Chimecho
        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Glalie
        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UU)); // Walrein

        PokeList.add(new Pokemon(367, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Huntail
        PokeList.add(new Pokemon(368, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Gorebyss
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Relicanth
        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Metagross

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UBER)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UBER)); // Latios

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys
    }
    //SEGMENT: GEN 4
    private void initGen4() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blastoise
        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Butterfree
        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Beedrill

        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pidgeot
        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Clefable
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.OU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Rapidash
        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Slowbro
        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UU)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.NU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar

        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.NU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Kangaskhan

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Jynx

        PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Electabuzz
        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pinsir
        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros
        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Flareon

        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.UU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Aerodactyl
        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite
        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.UU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ampharos
        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sunflora
        PokeList.add(new Pokemon(193, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Yanma
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Steelix
        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Qwilfish
        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor
        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Heracross
        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.NU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory
        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Houndoom

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.OU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sceptile
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Blaziken
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Swampert

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mightyena
        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Linoone
        PokeList.add(new Pokemon(267, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Beautifly
        PokeList.add(new Pokemon(269, 3, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.NU)); // Dustox
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NU)); // Shiftry
        PokeList.add(new Pokemon(277, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Swellow
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pelipper
        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Gardevoir
        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Slaking
        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Exploud

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hariyama

        PokeList.add(new Pokemon(301, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Delcatty
        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Sableye
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Mawile

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Aggron
        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Medicham
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Manectric
        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Illumise
        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Roselia
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Swalot
        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.NU)); // Sharpedo

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Wailord
        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Camerupt
        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Grumpig
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NU)); // Cacturne
        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Altaria
        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Seviper

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.NU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.NU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Milotic
        PokeList.add(new Pokemon(351, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Castform
        PokeList.add(new Pokemon(352, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kecleon

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Banette
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Chimecho
        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Glalie
        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Walrein

        PokeList.add(new Pokemon(367, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Huntail
        PokeList.add(new Pokemon(368, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Gorebyss
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Relicanth
        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Salamence

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Metagross

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UBER)); // Latios

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys

        PokeList.add(new Pokemon(389, 4, Pokemon.Type.GRASS, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Torterra
        PokeList.add(new Pokemon(392, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Infernape
        PokeList.add(new Pokemon(395, 4, Pokemon.Type.WATER, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Empoleon

        PokeList.add(new Pokemon(398, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Staraptor
        PokeList.add(new Pokemon(400, 4, Pokemon.Type.NORMAL, Pokemon.Type.WATER, Pokemon.Format.NU)); // Bibarel
        PokeList.add(new Pokemon(402, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kricketune
        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Luxray
        PokeList.add(new Pokemon(407, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Roserade

        PokeList.add(new Pokemon(409, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Rampardos
        PokeList.add(new Pokemon(411, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Bastiodon

        PokeList.add(new Pokemon(4130001, 4, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Wormadam (Plant Cloak)
        PokeList.add(new Pokemon(4130002, 4, Pokemon.Type.BUG, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Wormadam (Sandy Cloak)
        PokeList.add(new Pokemon(4130003, 4, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Wormadam (Trash Cloak)
        PokeList.add(new Pokemon(414, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Mothim
        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Vespiquen

        PokeList.add(new Pokemon(417, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pachirisu
        PokeList.add(new Pokemon(419, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Floatzel
        PokeList.add(new Pokemon(421, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Cherrim
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Gastrodon
        PokeList.add(new Pokemon(424, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ambipom

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Drifblim
        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lopunny
        PokeList.add(new Pokemon(429, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mismagius
        PokeList.add(new Pokemon(430, 4, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Honchkrow
        PokeList.add(new Pokemon(432, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Purugly

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.NU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Bronzong
        PokeList.add(new Pokemon(441, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Chatot
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.UU)); // Spiritomb
        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.UBER)); // Garchomp

        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Lucario
        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Hippowdon
        PokeList.add(new Pokemon(452, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.UU)); // Drapion
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Toxicroak
        PokeList.add(new Pokemon(455, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Carnivine

        PokeList.add(new Pokemon(457, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lumineon
        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.OU)); // Abomasnow
        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.OU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(463, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lickilicky

        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Rhyperior
        PokeList.add(new Pokemon(465, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tangrowth
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmortar
        PokeList.add(new Pokemon(468, 4, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Togekiss

        PokeList.add(new Pokemon(469, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Yanmega
        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Glaceon
        PokeList.add(new Pokemon(472, 4, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gliscor
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon-Z
        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Gallade
        PokeList.add(new Pokemon(476, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Probopass
        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Cresselia
        PokeList.add(new Pokemon(489, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Phione

        PokeList.add(new Pokemon(490, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Manaphy
        PokeList.add(new Pokemon(491, 4, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Darkrai

        PokeList.add(new Pokemon(4920001, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Shaymin
        PokeList.add(new Pokemon(4920002, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Shaymin-Sky

        PokeList.add(new Pokemon(493, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Arceus
    }
    //SEGMENT: GEN 5
    private void initGen5() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blastoise
        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Butterfree
        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Beedrill

        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Pidgeot
        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Clefable
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.OU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.OU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Rapidash
        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Slowbro
        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.PU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.NU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar

        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kangaskhan

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Jynx

        PokeList.add(new Pokemon(125, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Electabuzz
        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pinsir
        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros
        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.NU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Flareon

        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.RU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.RU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Aerodactyl
        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite
        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ampharos
        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sunflora
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Steelix
        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.PU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.RU)); // Qwilfish
        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor
        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Heracross
        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.NFE)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory
        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Houndoom

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.OU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sceptile
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Mightyena
        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Linoone
        PokeList.add(new Pokemon(267, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Beautifly
        PokeList.add(new Pokemon(269, 3, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.PU)); // Dustox
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.PU)); // Shiftry
        PokeList.add(new Pokemon(277, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Swellow
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Pelipper
        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Gardevoir
        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Slaking
        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Exploud

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Hariyama

        PokeList.add(new Pokemon(301, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Delcatty
        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Sableye
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Mawile

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Aggron
        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Medicham
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Manectric
        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.PU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.PU)); // Illumise
        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Roselia
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Swalot
        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Wailord
        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Camerupt
        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Grumpig
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NU)); // Cacturne
        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Altaria
        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Seviper

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.RU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.NU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Milotic
        PokeList.add(new Pokemon(351, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Castform
        PokeList.add(new Pokemon(352, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kecleon

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.PU)); // Banette
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UU)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Chimecho
        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Glalie
        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.PU)); // Walrein

        PokeList.add(new Pokemon(367, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Huntail
        PokeList.add(new Pokemon(368, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Gorebyss
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Relicanth
        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Metagross

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys

        PokeList.add(new Pokemon(389, 4, Pokemon.Type.GRASS, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Torterra
        PokeList.add(new Pokemon(392, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Infernape
        PokeList.add(new Pokemon(395, 4, Pokemon.Type.WATER, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Empoleon

        PokeList.add(new Pokemon(398, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Staraptor
        PokeList.add(new Pokemon(400, 4, Pokemon.Type.NORMAL, Pokemon.Type.WATER, Pokemon.Format.PU)); // Bibarel
        PokeList.add(new Pokemon(402, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kricketune
        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Luxray
        PokeList.add(new Pokemon(407, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Roserade

        PokeList.add(new Pokemon(409, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Rampardos
        PokeList.add(new Pokemon(411, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Bastiodon

        PokeList.add(new Pokemon(4130001, 4, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Wormadam (Plant Cloak)
        PokeList.add(new Pokemon(4130002, 4, Pokemon.Type.BUG, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Wormadam (Sandy Cloak)
        PokeList.add(new Pokemon(4130003, 4, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Wormadam (Trash Cloak)
        PokeList.add(new Pokemon(414, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Mothim
        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Vespiquen

        PokeList.add(new Pokemon(417, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Pachirisu
        PokeList.add(new Pokemon(419, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Floatzel
        PokeList.add(new Pokemon(421, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Cherrim
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Gastrodon
        PokeList.add(new Pokemon(424, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ambipom

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Drifblim
        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lopunny
        PokeList.add(new Pokemon(429, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mismagius
        PokeList.add(new Pokemon(430, 4, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Honchkrow
        PokeList.add(new Pokemon(432, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Purugly

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.NU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Bronzong
        PokeList.add(new Pokemon(441, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Chatot
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.RU)); // Spiritomb
        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp

        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Lucario
        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Hippowdon
        PokeList.add(new Pokemon(452, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.RU)); // Drapion
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Toxicroak
        PokeList.add(new Pokemon(455, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Carnivine

        PokeList.add(new Pokemon(457, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lumineon
        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Abomasnow
        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.UU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(463, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lickilicky

        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Rhyperior
        PokeList.add(new Pokemon(465, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Tangrowth
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Magmortar
        PokeList.add(new Pokemon(468, 4, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Togekiss

        PokeList.add(new Pokemon(469, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Yanmega
        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Glaceon
        PokeList.add(new Pokemon(472, 4, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gliscor
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Porygon-Z
        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Gallade
        PokeList.add(new Pokemon(476, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Probopass
        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.NU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.RU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.WATER, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Cresselia
        PokeList.add(new Pokemon(489, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Phione

        PokeList.add(new Pokemon(490, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Manaphy
        PokeList.add(new Pokemon(491, 4, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Darkrai

        PokeList.add(new Pokemon(4920001, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Shaymin
        PokeList.add(new Pokemon(4920002, 4, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Shaymin-Sky

        PokeList.add(new Pokemon(493, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Arceus

        PokeList.add(new Pokemon(494, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Victini

        PokeList.add(new Pokemon(497, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Serperior
        PokeList.add(new Pokemon(500, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Emboar
        PokeList.add(new Pokemon(5030001, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Samurott

        PokeList.add(new Pokemon(505, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Watchog
        PokeList.add(new Pokemon(508, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Stoutland
        PokeList.add(new Pokemon(510, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Liepard

        PokeList.add(new Pokemon(512, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Simisage
        PokeList.add(new Pokemon(514, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Simisear
        PokeList.add(new Pokemon(516, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Simipour

        PokeList.add(new Pokemon(518, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Musharna
        PokeList.add(new Pokemon(521, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Unfezant
        PokeList.add(new Pokemon(523, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Zebstrika
        PokeList.add(new Pokemon(526, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Gigalith
        PokeList.add(new Pokemon(528, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Swoobat

        PokeList.add(new Pokemon(530, 5, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Excadrill
        PokeList.add(new Pokemon(5310001, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Audino
        PokeList.add(new Pokemon(534, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Conkeldurr
        PokeList.add(new Pokemon(537, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Seismitoad

        PokeList.add(new Pokemon(538, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Throh
        PokeList.add(new Pokemon(539, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sawk

        PokeList.add(new Pokemon(542, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Leavanny
        PokeList.add(new Pokemon(545, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.RU)); // Scolipede
        PokeList.add(new Pokemon(547, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Whimsicott
        PokeList.add(new Pokemon(549, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Lilligant
        PokeList.add(new Pokemon(550, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Basculin

        PokeList.add(new Pokemon(553, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.UU)); // Krookodile
        PokeList.add(new Pokemon(5550001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Darmanitan
        PokeList.add(new Pokemon(556, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Maractus
        PokeList.add(new Pokemon(558, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Crustle
        PokeList.add(new Pokemon(560, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Scrafty

        PokeList.add(new Pokemon(561, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Sigilyph
        PokeList.add(new Pokemon(563, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UU)); // Cofagrigus
        PokeList.add(new Pokemon(565, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Carracosta
        PokeList.add(new Pokemon(567, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Archeops
        PokeList.add(new Pokemon(5690001, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Garbodor

        PokeList.add(new Pokemon(5710001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zoroark
        PokeList.add(new Pokemon(573, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cinccino
        PokeList.add(new Pokemon(576, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Gothitelle
        PokeList.add(new Pokemon(579, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Reuniclus
        PokeList.add(new Pokemon(581, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Swanna

        PokeList.add(new Pokemon(584, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Vanilluxe
        PokeList.add(new Pokemon(586, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Sawsbuck
        PokeList.add(new Pokemon(587, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Emolga
        PokeList.add(new Pokemon(589, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Escavalier
        PokeList.add(new Pokemon(591, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Amoonguss

        PokeList.add(new Pokemon(593, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Jellicent
        PokeList.add(new Pokemon(594, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Alomomola
        PokeList.add(new Pokemon(596, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Galvantula
        PokeList.add(new Pokemon(598, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Ferrothorn
        PokeList.add(new Pokemon(601, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Klinklang

        PokeList.add(new Pokemon(604, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Eelektross
        PokeList.add(new Pokemon(606, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Beheeyem
        PokeList.add(new Pokemon(609, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Chandelure
        PokeList.add(new Pokemon(612, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.OU)); // Haxorus
        PokeList.add(new Pokemon(614, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Beartic

        PokeList.add(new Pokemon(615, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cryogonal
        PokeList.add(new Pokemon(617, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.RU)); // Accelgor
        PokeList.add(new Pokemon(6180001, 5, Pokemon.Type.GROUND, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Stunfisk
        PokeList.add(new Pokemon(620, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mienshao
        PokeList.add(new Pokemon(621, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Druddigon

        PokeList.add(new Pokemon(623, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Golurk
        PokeList.add(new Pokemon(625, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Bisharp
        PokeList.add(new Pokemon(626, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Bouffalant
        PokeList.add(new Pokemon(6280001, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Braviary
        PokeList.add(new Pokemon(630, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Mandibuzz

        PokeList.add(new Pokemon(631, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Heatmor
        PokeList.add(new Pokemon(632, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Durant
        PokeList.add(new Pokemon(635, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Hydreigon
        PokeList.add(new Pokemon(637, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Volcarona

        PokeList.add(new Pokemon(638, 5, Pokemon.Type.STEEL, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Cobalion
        PokeList.add(new Pokemon(639, 5, Pokemon.Type.ROCK, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Terrakion
        PokeList.add(new Pokemon(640, 5, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Virizion

        PokeList.add(new Pokemon(6410001, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tornadus
        PokeList.add(new Pokemon(6410002, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Tornadus-Therian
        PokeList.add(new Pokemon(6420001, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Thundurus
        PokeList.add(new Pokemon(6420002, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus-Therian

        PokeList.add(new Pokemon(643, 5, Pokemon.Type.DRAGON, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Reshiram
        PokeList.add(new Pokemon(644, 5, Pokemon.Type.DRAGON, Pokemon.Type.ELECTRIC, Pokemon.Format.UBER)); // Zekrom

        PokeList.add(new Pokemon(6450001, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Landorus
        PokeList.add(new Pokemon(6450002, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Landorus-Therian

        PokeList.add(new Pokemon(6460001, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem
        PokeList.add(new Pokemon(6460002, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Kyurem-White
        PokeList.add(new Pokemon(6460003, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem-Black

        PokeList.add(new Pokemon(647, 5, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Keldeo

        PokeList.add(new Pokemon(6480001, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta
        PokeList.add(new Pokemon(6480002, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta-Piroutte

        PokeList.add(new Pokemon(649, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Genesect
    }
    //SEGMENT: GEN 6
    private void initGen6() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Venusaur
        PokeList.add(new Pokemon(30002, 1, true,Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Venusaur-Mega

        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(60002, 1, true, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Charizard-X
        PokeList.add(new Pokemon(60003, 1, true, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Charizard-Y

        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Blastoise
        PokeList.add(new Pokemon(90002, 1, true, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blastoise-Mega

        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree

        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Beedrill
        PokeList.add(new Pokemon(150002, 1, true, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Beedrill-Mega
        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Pidgeot
        PokeList.add(new Pokemon(180002, 1, true, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Pidgeot-Mega

        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Raticate
        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sandslash
        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.OU)); // Clefable
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ninetales

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Persian
        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Poliwrath

        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(650002, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam-Mega

        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.NU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Golem
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Rapidash

        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Slowbro
        PokeList.add(new Pokemon(800002, 1, true, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Slowbro-Mega

        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.PU)); // Muk
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.UU)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.NU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.OU)); // Gengar
        PokeList.add(new Pokemon(940002, 1, true, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UBER)); // Gengar-Mega

        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Electrode
        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Exeggutor

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kangaskhan
        PokeList.add(new Pokemon(1150002, 1, true, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kangaskhan-Mega

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Jynx

        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Pinsir
        PokeList.add(new Pokemon(1270002, 1, true, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Pinsir-Mega

        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros

        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados
        PokeList.add(new Pokemon(1300002, 1, true, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); // Gyarados-mega

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.PU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Flareon

        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.NU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.NU)); // Kabutops

        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Aerodactyl
        PokeList.add(new Pokemon(1420002, 1, true, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Aerodactyl

        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite

        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(1500002, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Mewtwo-X
        PokeList.add(new Pokemon(1500003, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo-Y
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.NU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ampharos
        PokeList.add(new Pokemon(1810002, 2, true, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Ampharos-Mega

        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sunflora
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.PU)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Steelix
        PokeList.add(new Pokemon(2080002, 2, true, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Steelix-Mega

        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.RU)); // Qwilfish

        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor
        PokeList.add(new Pokemon(2120002, 2, true, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor-Mega

        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Heracross
        PokeList.add(new Pokemon(2140002, 2, true, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Heracross-Mega

        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.RU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory

        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Houndoom
        PokeList.add(new Pokemon(2290002, 2, true, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Houndoom-Mega

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar
        PokeList.add(new Pokemon(2480002, 2, true, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar-Mega

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sceptile
        PokeList.add(new Pokemon(2540002, 3, true, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Sceptile-Mega
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken
        PokeList.add(new Pokemon(2570002, 3, true, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken-Mega
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert
        PokeList.add(new Pokemon(2600002, 3, true, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert-Mega

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mightyena
        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Linoone
        PokeList.add(new Pokemon(267, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Beautifly
        PokeList.add(new Pokemon(269, 3, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Dustox
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.NU)); // Shiftry
        PokeList.add(new Pokemon(277, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Swellow
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Pelipper

        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Gardevoir
        PokeList.add(new Pokemon(2820002, 3, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Gardevoir-Mega

        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Slaking
        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.ZU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Exploud

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hariyama

        PokeList.add(new Pokemon(301, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Delcatty

        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Sableye
        PokeList.add(new Pokemon(3020002, 3, true, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Sableye-Mega
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.PU)); // Mawile
        PokeList.add(new Pokemon(3030002, 3, true, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.UBER)); // Mawile-Mega

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Aggron
        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Medicham
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Manectric

        PokeList.add(new Pokemon(3060002, 3, true, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Aggron-Mega
        PokeList.add(new Pokemon(3080002, 3, true, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Medicham-Mega
        PokeList.add(new Pokemon(3100002, 3, true, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Manectric-Mega

        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Illumise
        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Roselia
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Swalot

        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo
        PokeList.add(new Pokemon(3190002, 3, true, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo-Mega

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wailord
        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Camerupt
        PokeList.add(new Pokemon(3230002, 3, true, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Camerupt-Mega

        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Grumpig
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.PU)); // Cacturne

        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Altaria
        PokeList.add(new Pokemon(3340002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Altaria-Mega

        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seviper

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.PU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Milotic
        PokeList.add(new Pokemon(351, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Castform
        PokeList.add(new Pokemon(352, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kecleon

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Banette
        PokeList.add(new Pokemon(3540002, 3, true, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Banette-Mega
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Chimecho

        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glalie
        PokeList.add(new Pokemon(3590002, 3, true, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Absol-Mega
        PokeList.add(new Pokemon(3620002, 3, true, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Glalie-Mega

        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Walrein
        PokeList.add(new Pokemon(367, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Huntail
        PokeList.add(new Pokemon(368, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Gorebyss
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Relicanth
        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence
        PokeList.add(new Pokemon(3730002, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Salamence-Mega

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Metagross
        PokeList.add(new Pokemon(3760002, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Metagross-Mega

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios
        PokeList.add(new Pokemon(3800002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latias-Mega
        PokeList.add(new Pokemon(3810002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios-Mega

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(3820002, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre-Primal
        PokeList.add(new Pokemon(3830002, 3, Pokemon.Type.GROUND, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Groudon-Primal
        PokeList.add(new Pokemon(3840002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.AG)); // Rayquaza-Mega

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys

        PokeList.add(new Pokemon(389, 4, Pokemon.Type.GRASS, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Torterra
        PokeList.add(new Pokemon(392, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Infernape
        PokeList.add(new Pokemon(395, 4, Pokemon.Type.WATER, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Empoleon

        PokeList.add(new Pokemon(398, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Staraptor
        PokeList.add(new Pokemon(400, 4, Pokemon.Type.NORMAL, Pokemon.Type.WATER, Pokemon.Format.ZU)); // Bibarel
        PokeList.add(new Pokemon(402, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Kricketune
        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luxray
        PokeList.add(new Pokemon(407, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Roserade

        PokeList.add(new Pokemon(409, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Rampardos
        PokeList.add(new Pokemon(411, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Bastiodon

        PokeList.add(new Pokemon(4130001, 4, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Wormadam (Plant Cloak)
        PokeList.add(new Pokemon(4130002, 4, Pokemon.Type.BUG, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Wormadam (Sandy Cloak)
        PokeList.add(new Pokemon(4130003, 4, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Wormadam (Trash Cloak)
        PokeList.add(new Pokemon(414, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Mothim
        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Vespiquen

        PokeList.add(new Pokemon(417, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pachirisu
        PokeList.add(new Pokemon(419, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Floatzel
        PokeList.add(new Pokemon(421, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Cherrim
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Gastrodon
        PokeList.add(new Pokemon(424, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ambipom

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Drifblim

        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lopunny
        PokeList.add(new Pokemon(4280002, 4, true, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Lopunny-Mega

        PokeList.add(new Pokemon(429, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mismagius
        PokeList.add(new Pokemon(430, 4, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Honchkrow
        PokeList.add(new Pokemon(432, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Purugly

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.NU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bronzong
        PokeList.add(new Pokemon(441, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Chatot
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.RU)); // Spiritomb

        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp
        PokeList.add(new Pokemon(4450002, 4, true, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp-Mega
        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Lucario
        PokeList.add(new Pokemon(4480002, 4, true, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Lucario-Mega

        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.OU)); // Hippowdon
        PokeList.add(new Pokemon(452, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.RU)); // Drapion
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Toxicroak
        PokeList.add(new Pokemon(455, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Carnivine

        PokeList.add(new Pokemon(457, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lumineon

        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Abomasnow
        PokeList.add(new Pokemon(4600002, 4, true, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Abomasnow-Mega

        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.OU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(463, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lickilicky

        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Rhyperior
        PokeList.add(new Pokemon(465, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tangrowth
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmortar
        PokeList.add(new Pokemon(468, 4, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Togekiss

        PokeList.add(new Pokemon(469, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Yanmega
        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glaceon
        PokeList.add(new Pokemon(472, 4, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gliscor
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Porygon-Z

        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Gallade
        PokeList.add(new Pokemon(4750002, 4, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Gallade

        PokeList.add(new Pokemon(476, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Probopass
        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.PU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.PU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.RU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.WATER, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Cresselia
        PokeList.add(new Pokemon(489, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Phione

        PokeList.add(new Pokemon(490, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Manaphy
        PokeList.add(new Pokemon(491, 4, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Darkrai

        PokeList.add(new Pokemon(4920001, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Shaymin
        PokeList.add(new Pokemon(4920002, 4, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Shaymin-Sky

        PokeList.add(new Pokemon(493, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Arceus

        PokeList.add(new Pokemon(494, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Victini

        PokeList.add(new Pokemon(497, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Serperior
        PokeList.add(new Pokemon(500, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Emboar
        PokeList.add(new Pokemon(5030001, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Samurott

        PokeList.add(new Pokemon(505, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Watchog
        PokeList.add(new Pokemon(508, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Stoutland
        PokeList.add(new Pokemon(510, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.NU)); // Liepard

        PokeList.add(new Pokemon(512, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Simisage
        PokeList.add(new Pokemon(514, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Simisear
        PokeList.add(new Pokemon(516, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Simipour

        PokeList.add(new Pokemon(518, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Musharna
        PokeList.add(new Pokemon(521, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Unfezant
        PokeList.add(new Pokemon(523, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Zebstrika
        PokeList.add(new Pokemon(526, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gigalith
        PokeList.add(new Pokemon(528, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Swoobat

        PokeList.add(new Pokemon(530, 5, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Excadrill

        PokeList.add(new Pokemon(5310001, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Audino
        PokeList.add(new Pokemon(5310001, 5, true, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Audino-Mega

        PokeList.add(new Pokemon(534, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Conkeldurr
        PokeList.add(new Pokemon(537, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Seismitoad

        PokeList.add(new Pokemon(538, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Throh
        PokeList.add(new Pokemon(539, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sawk

        PokeList.add(new Pokemon(542, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Leavanny
        PokeList.add(new Pokemon(545, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.OU)); // Scolipede
        PokeList.add(new Pokemon(547, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Whimsicott
        PokeList.add(new Pokemon(549, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lilligant
        PokeList.add(new Pokemon(550, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Basculin

        PokeList.add(new Pokemon(553, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.UU)); // Krookodile
        PokeList.add(new Pokemon(5550001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Darmanitan
        PokeList.add(new Pokemon(556, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Maractus
        PokeList.add(new Pokemon(558, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Crustle
        PokeList.add(new Pokemon(560, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Scrafty

        PokeList.add(new Pokemon(561, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Sigilyph
        PokeList.add(new Pokemon(563, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cofagrigus
        PokeList.add(new Pokemon(565, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.NU)); // Carracosta
        PokeList.add(new Pokemon(567, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Archeops
        PokeList.add(new Pokemon(5690001, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Garbodor

        PokeList.add(new Pokemon(5710001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zoroark
        PokeList.add(new Pokemon(573, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cinccino
        PokeList.add(new Pokemon(576, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gothitelle
        PokeList.add(new Pokemon(579, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Reuniclus
        PokeList.add(new Pokemon(581, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Swanna

        PokeList.add(new Pokemon(584, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Vanilluxe
        PokeList.add(new Pokemon(586, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Sawsbuck
        PokeList.add(new Pokemon(587, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Emolga
        PokeList.add(new Pokemon(589, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Escavalier
        PokeList.add(new Pokemon(591, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Amoonguss

        PokeList.add(new Pokemon(593, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Jellicent
        PokeList.add(new Pokemon(594, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Alomomola
        PokeList.add(new Pokemon(596, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.UU)); // Galvantula
        PokeList.add(new Pokemon(598, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Ferrothorn
        PokeList.add(new Pokemon(601, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Klinklang

        PokeList.add(new Pokemon(604, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Eelektross
        PokeList.add(new Pokemon(606, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Beheeyem
        PokeList.add(new Pokemon(609, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Chandelure
        PokeList.add(new Pokemon(612, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Haxorus
        PokeList.add(new Pokemon(614, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beartic

        PokeList.add(new Pokemon(615, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Cryogonal
        PokeList.add(new Pokemon(617, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.RU)); // Accelgor
        PokeList.add(new Pokemon(6180001, 5, Pokemon.Type.GROUND, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Stunfisk
        PokeList.add(new Pokemon(620, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mienshao
        PokeList.add(new Pokemon(621, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Druddigon

        PokeList.add(new Pokemon(623, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Golurk
        PokeList.add(new Pokemon(625, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Bisharp
        PokeList.add(new Pokemon(626, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Bouffalant
        PokeList.add(new Pokemon(6280001, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Braviary
        PokeList.add(new Pokemon(630, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Mandibuzz

        PokeList.add(new Pokemon(631, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Heatmor
        PokeList.add(new Pokemon(632, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Durant
        PokeList.add(new Pokemon(635, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydreigon
        PokeList.add(new Pokemon(637, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Volcarona

        PokeList.add(new Pokemon(638, 5, Pokemon.Type.STEEL, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Cobalion
        PokeList.add(new Pokemon(639, 5, Pokemon.Type.ROCK, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Terrakion
        PokeList.add(new Pokemon(640, 5, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Virizion

        PokeList.add(new Pokemon(6410001, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tornadus
        PokeList.add(new Pokemon(6410002, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tornadus-Therian
        PokeList.add(new Pokemon(6420001, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus
        PokeList.add(new Pokemon(6420002, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus-Therian

        PokeList.add(new Pokemon(643, 5, Pokemon.Type.DRAGON, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Reshiram
        PokeList.add(new Pokemon(644, 5, Pokemon.Type.DRAGON, Pokemon.Type.ELECTRIC, Pokemon.Format.UBER)); // Zekrom

        PokeList.add(new Pokemon(6450001, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Landorus
        PokeList.add(new Pokemon(6450002, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Landorus-Therian

        PokeList.add(new Pokemon(6460001, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem
        PokeList.add(new Pokemon(6460002, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Kyurem-White
        PokeList.add(new Pokemon(6460003, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem-Black

        PokeList.add(new Pokemon(647, 5, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Keldeo

        PokeList.add(new Pokemon(6480001, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta
        PokeList.add(new Pokemon(6480002, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta-Piroutte

        PokeList.add(new Pokemon(649, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Genesect

        PokeList.add(new Pokemon(652, 6, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Chesnaught
        PokeList.add(new Pokemon(655, 6, Pokemon.Type.FIRE, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Delphox
        PokeList.add(new Pokemon(658, 6, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UBER)); // Greninja

        PokeList.add(new Pokemon(660, 6, Pokemon.Type.NORMAL, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Diggersby
        PokeList.add(new Pokemon(663, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Talonflame
        PokeList.add(new Pokemon(666, 6, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Vivillon
        PokeList.add(new Pokemon(668, 6, Pokemon.Type.FIRE, Pokemon.Type.NORMAL, Pokemon.Format.NU)); // Pyroar
        PokeList.add(new Pokemon(671, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Florges

        PokeList.add(new Pokemon(673, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gogoat
        PokeList.add(new Pokemon(675, 6, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.UU)); // Pangoro
        PokeList.add(new Pokemon(676, 6, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Furfrou
        PokeList.add(new Pokemon(678, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meowstic
        PokeList.add(new Pokemon(681, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Aegislash

        PokeList.add(new Pokemon(683, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Aromatisse
        PokeList.add(new Pokemon(685, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.OU)); // Slurpuff
        PokeList.add(new Pokemon(687, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Malamar
        PokeList.add(new Pokemon(689, 6, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.NU)); // Barbaracle
        PokeList.add(new Pokemon(691, 6, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Dragalge

        PokeList.add(new Pokemon(693, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Clawitzer
        PokeList.add(new Pokemon(695, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.NORMAL, Pokemon.Format.UU)); // Heliolisk
        PokeList.add(new Pokemon(697, 6, Pokemon.Type.ROCK, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Tyrantrum
        PokeList.add(new Pokemon(699, 6, Pokemon.Type.ROCK, Pokemon.Type.ICE, Pokemon.Format.NU)); // Aurorus
        PokeList.add(new Pokemon(700, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sylveon

        PokeList.add(new Pokemon(701, 6, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Hawlucha
        PokeList.add(new Pokemon(702, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Dedenne
        PokeList.add(new Pokemon(703, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Carbink
        PokeList.add(new Pokemon(7060001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Goodra
        PokeList.add(new Pokemon(707, 6, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Klefki

        PokeList.add(new Pokemon(709, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Trevenant
        PokeList.add(new Pokemon(711, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Gourgeist
        PokeList.add(new Pokemon(7130001, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Avalugg
        PokeList.add(new Pokemon(715, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Noivern

        PokeList.add(new Pokemon(716, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Xerneas
        PokeList.add(new Pokemon(717, 6, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Yveltal
        PokeList.add(new Pokemon(7180001, 6, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Zygarde

        PokeList.add(new Pokemon(7190001, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Diancie
        PokeList.add(new Pokemon(7190002, 6, true, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Diancie-Mega

        PokeList.add(new Pokemon(7200001, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Hoopa
        PokeList.add(new Pokemon(7200002, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Hoopa-Unbound
        PokeList.add(new Pokemon(721, 6, Pokemon.Type.FIRE, Pokemon.Type.WATER, Pokemon.Format.OU)); // Volcanion
    }
    //SEGMENT: GEN 7
    private void initGen7() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Venusaur
        PokeList.add(new Pokemon(30002, 1, true,Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.OU)); // Venusaur-Mega

        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(60002, 1, true, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Charizard-X
        PokeList.add(new Pokemon(60003, 1, true, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Charizard-Y

        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Blastoise
        PokeList.add(new Pokemon(90002, 1, true, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Blastoise-Mega

        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree

        PokeList.add(new Pokemon(150001, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Beedrill
        PokeList.add(new Pokemon(150002, 1, true, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Beedrill-Mega
        PokeList.add(new Pokemon(180001, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Pidgeot
        PokeList.add(new Pokemon(180002, 1, true, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Pidgeot-Mega

        PokeList.add(new Pokemon(200001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Raticate
        PokeList.add(new Pokemon(200002, 7, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.ZU)); // Raticate-Alola

        PokeList.add(new Pokemon(22, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Fearow
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Raichu
        PokeList.add(new Pokemon(260002, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Raichu-Alola

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sandslash
        PokeList.add(new Pokemon(280002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Sandslash-Alola

        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.OU)); // Clefable
        
        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ninetales
        PokeList.add(new Pokemon(380002, 7, Pokemon.Type.ICE, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Ninetales-Alola

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Vileplume
        PokeList.add(new Pokemon(47, 1, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Parasect
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Persian
        PokeList.add(new Pokemon(510002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Dugtrio-Alola
        PokeList.add(new Pokemon(530002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Persian-Alola

        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); // Poliwrath

        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(650002, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam-Mega

        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Machamp
        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Golem
        PokeList.add(new Pokemon(760002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Golem-Alola

        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Rapidash

        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Slowbro
        PokeList.add(new Pokemon(800002, 1, true, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Slowbro-Mega

        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Muk
        PokeList.add(new Pokemon(890002, 7, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.UU)); // Muk-Alola
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.RU)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UU)); // Gengar
        PokeList.add(new Pokemon(940002, 1, true, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UBER)); // Gengar-Mega

        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Hypno
        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kingler
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Electrode

        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Exeggutor
        PokeList.add(new Pokemon(1030002, 7, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Exeggutor-Alola

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kangaskhan
        PokeList.add(new Pokemon(1150002, 1, true, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kangaskhan-Mega

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Jynx

        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pinsir
        PokeList.add(new Pokemon(1270002, 1, true, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Pinsir-Mega

        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros

        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados
        PokeList.add(new Pokemon(1300002, 1, true, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); // Gyarados-mega

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Flareon

        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.PU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.PU)); // Kabutops

        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Aerodactyl
        PokeList.add(new Pokemon(1420002, 1, true, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Aerodactyl-Mega

        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite

        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(1500002, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Mewtwo-X
        PokeList.add(new Pokemon(1500003, 1, true, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo-Y
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Noctowl

        PokeList.add(new Pokemon(166, 2, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Ledian
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Ariados
        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Xatu

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ampharos
        PokeList.add(new Pokemon(1810002, 2, true, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Ampharos-Mega

        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sunflora
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Misdreavus
        PokeList.add(new Pokemon(201, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Unown

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wobbuffet
        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Steelix
        PokeList.add(new Pokemon(2080002, 2, true, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Steelix-Mega

        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.PU)); // Qwilfish

        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Scizor
        PokeList.add(new Pokemon(2120002, 2, true, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Scizor-Mega

        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Heracross
        PokeList.add(new Pokemon(2140002, 2, true, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Heracross-Mega

        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.NU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory

        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Houndoom
        PokeList.add(new Pokemon(2290002, 2, true, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Houndoom-Mega

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.RU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar
        PokeList.add(new Pokemon(2480002, 2, true, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar-Mega

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sceptile
        PokeList.add(new Pokemon(2540002, 3, true, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Sceptile-Mega
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken
        PokeList.add(new Pokemon(2570002, 3, true, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken-Mega
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert
        PokeList.add(new Pokemon(2600002, 3, true, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Swampert-Mega

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mightyena
        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Linoone
        PokeList.add(new Pokemon(267, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Beautifly
        PokeList.add(new Pokemon(269, 3, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Dustox
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.PU)); // Shiftry
        PokeList.add(new Pokemon(277, 3, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Swellow
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Pelipper

        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Gardevoir
        PokeList.add(new Pokemon(2820002, 3, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Gardevoir-Mega

        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Slaking
        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.ZU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Exploud

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hariyama

        PokeList.add(new Pokemon(301, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Delcatty

        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Sableye
        PokeList.add(new Pokemon(3020002, 3, true, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Sableye-Mega
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Mawile
        PokeList.add(new Pokemon(3030002, 3, true, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Mawile-Mega

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Aggron
        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Medicham
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Manectric

        PokeList.add(new Pokemon(3060002, 3, true, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.UU)); // Aggron-Mega
        PokeList.add(new Pokemon(3080002, 3, true, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Medicham-Mega
        PokeList.add(new Pokemon(3100002, 3, true, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Manectric-Mega

        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Illumise
        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Roselia
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Swalot

        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo
        PokeList.add(new Pokemon(3190002, 3, true, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo-Mega

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wailord
        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Camerupt
        PokeList.add(new Pokemon(3230002, 3, true, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Camerupt-Mega

        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Grumpig
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Cacturne

        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Altaria
        PokeList.add(new Pokemon(3340002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Altaria-Mega

        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seviper

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.ZU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Milotic
        PokeList.add(new Pokemon(351, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Castform
        PokeList.add(new Pokemon(352, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Kecleon

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Banette
        PokeList.add(new Pokemon(3540002, 3, true, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Banette-Mega
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Chimecho

        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glalie
        PokeList.add(new Pokemon(3590002, 3, true, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Absol-Mega
        PokeList.add(new Pokemon(3620002, 3, true, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Glalie-Mega

        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Walrein
        PokeList.add(new Pokemon(367, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Huntail
        PokeList.add(new Pokemon(368, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.PU)); // Gorebyss
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Relicanth
        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence
        PokeList.add(new Pokemon(3730002, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Salamence-Mega

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Metagross
        PokeList.add(new Pokemon(3760002, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.UBER)); // Metagross-Mega

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios
        PokeList.add(new Pokemon(3800002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latias-Mega
        PokeList.add(new Pokemon(3810002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios-Mega

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(3820002, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre-Primal
        PokeList.add(new Pokemon(3830002, 3, Pokemon.Type.GROUND, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Groudon-Primal
        PokeList.add(new Pokemon(3840002, 3, true, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.AG)); // Rayquaza-Mega

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys

        PokeList.add(new Pokemon(389, 4, Pokemon.Type.GRASS, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Torterra
        PokeList.add(new Pokemon(392, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Infernape
        PokeList.add(new Pokemon(395, 4, Pokemon.Type.WATER, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Empoleon

        PokeList.add(new Pokemon(398, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Staraptor
        PokeList.add(new Pokemon(400, 4, Pokemon.Type.NORMAL, Pokemon.Type.WATER, Pokemon.Format.ZU)); // Bibarel
        PokeList.add(new Pokemon(402, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Kricketune
        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luxray
        PokeList.add(new Pokemon(407, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Roserade

        PokeList.add(new Pokemon(409, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Rampardos
        PokeList.add(new Pokemon(411, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Bastiodon

        PokeList.add(new Pokemon(4130001, 4, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Wormadam (Plant Cloak)
        PokeList.add(new Pokemon(4130002, 4, Pokemon.Type.BUG, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Wormadam (Sandy Cloak)
        PokeList.add(new Pokemon(4130003, 4, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Wormadam (Trash Cloak)
        PokeList.add(new Pokemon(414, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Mothim
        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Vespiquen

        PokeList.add(new Pokemon(417, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pachirisu
        PokeList.add(new Pokemon(419, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Floatzel
        PokeList.add(new Pokemon(421, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Cherrim
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Gastrodon
        PokeList.add(new Pokemon(424, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ambipom

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Drifblim

        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lopunny
        PokeList.add(new Pokemon(4280002, 4, true, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Lopunny-Mega

        PokeList.add(new Pokemon(429, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mismagius
        PokeList.add(new Pokemon(430, 4, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Honchkrow
        PokeList.add(new Pokemon(432, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Purugly

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.PU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bronzong
        PokeList.add(new Pokemon(441, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Chatot
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.PU)); // Spiritomb

        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp
        PokeList.add(new Pokemon(4450002, 4, true, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp-Mega
        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Lucario
        PokeList.add(new Pokemon(4480002, 4, true, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Lucario-Mega

        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hippowdon
        PokeList.add(new Pokemon(452, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.RU)); // Drapion
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Toxicroak
        PokeList.add(new Pokemon(455, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Carnivine

        PokeList.add(new Pokemon(457, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lumineon

        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Abomasnow
        PokeList.add(new Pokemon(4600002, 4, true, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Abomasnow-Mega

        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.OU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(463, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lickilicky

        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Rhyperior
        PokeList.add(new Pokemon(465, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tangrowth
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmortar
        PokeList.add(new Pokemon(468, 4, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Togekiss

        PokeList.add(new Pokemon(469, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Yanmega
        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glaceon
        PokeList.add(new Pokemon(472, 4, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gliscor
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon-Z

        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Gallade
        PokeList.add(new Pokemon(4750002, 4, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Gallade

        PokeList.add(new Pokemon(476, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Probopass
        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.PU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.RU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.WATER, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cresselia
        PokeList.add(new Pokemon(489, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Phione

        PokeList.add(new Pokemon(490, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Manaphy
        PokeList.add(new Pokemon(491, 4, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Darkrai

        PokeList.add(new Pokemon(4920001, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Shaymin
        PokeList.add(new Pokemon(4920002, 4, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Shaymin-Sky

        PokeList.add(new Pokemon(493, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Arceus

        PokeList.add(new Pokemon(494, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Victini

        PokeList.add(new Pokemon(497, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Serperior
        PokeList.add(new Pokemon(500, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Emboar
        PokeList.add(new Pokemon(5030001, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Samurott

        PokeList.add(new Pokemon(505, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Watchog
        PokeList.add(new Pokemon(508, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Stoutland
        PokeList.add(new Pokemon(510, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Liepard

        PokeList.add(new Pokemon(512, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Simisage
        PokeList.add(new Pokemon(514, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Simisear
        PokeList.add(new Pokemon(516, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Simipour

        PokeList.add(new Pokemon(518, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Musharna
        PokeList.add(new Pokemon(521, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Unfezant
        PokeList.add(new Pokemon(523, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Zebstrika
        PokeList.add(new Pokemon(526, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Gigalith
        PokeList.add(new Pokemon(528, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Swoobat

        PokeList.add(new Pokemon(530, 5, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Excadrill

        PokeList.add(new Pokemon(5310001, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Audino
        PokeList.add(new Pokemon(5310001, 5, true, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Audino-Mega

        PokeList.add(new Pokemon(534, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Conkeldurr
        PokeList.add(new Pokemon(537, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Seismitoad

        PokeList.add(new Pokemon(538, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Throh
        PokeList.add(new Pokemon(539, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sawk

        PokeList.add(new Pokemon(542, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Leavanny
        PokeList.add(new Pokemon(545, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.OU)); // Scolipede
        PokeList.add(new Pokemon(547, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Whimsicott
        PokeList.add(new Pokemon(549, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lilligant
        PokeList.add(new Pokemon(550, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Basculin

        PokeList.add(new Pokemon(553, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.UU)); // Krookodile
        PokeList.add(new Pokemon(5550001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Darmanitan
        PokeList.add(new Pokemon(556, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Maractus
        PokeList.add(new Pokemon(558, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Crustle
        PokeList.add(new Pokemon(560, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Scrafty

        PokeList.add(new Pokemon(561, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Sigilyph
        PokeList.add(new Pokemon(563, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cofagrigus
        PokeList.add(new Pokemon(565, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Carracosta
        PokeList.add(new Pokemon(567, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Archeops
        PokeList.add(new Pokemon(5690001, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Garbodor

        PokeList.add(new Pokemon(5710001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zoroark
        PokeList.add(new Pokemon(573, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cinccino
        PokeList.add(new Pokemon(576, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gothitelle
        PokeList.add(new Pokemon(579, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Reuniclus
        PokeList.add(new Pokemon(581, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Swanna

        PokeList.add(new Pokemon(584, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Vanilluxe
        PokeList.add(new Pokemon(586, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Sawsbuck
        PokeList.add(new Pokemon(587, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Emolga
        PokeList.add(new Pokemon(589, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Escavalier
        PokeList.add(new Pokemon(591, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Amoonguss

        PokeList.add(new Pokemon(593, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Jellicent
        PokeList.add(new Pokemon(594, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Alomomola
        PokeList.add(new Pokemon(596, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Galvantula
        PokeList.add(new Pokemon(598, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Ferrothorn
        PokeList.add(new Pokemon(601, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Klinklang

        PokeList.add(new Pokemon(604, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Eelektross
        PokeList.add(new Pokemon(606, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beheeyem
        PokeList.add(new Pokemon(609, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Chandelure
        PokeList.add(new Pokemon(612, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Haxorus
        PokeList.add(new Pokemon(614, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beartic

        PokeList.add(new Pokemon(615, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Cryogonal
        PokeList.add(new Pokemon(617, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Accelgor
        PokeList.add(new Pokemon(6180001, 5, Pokemon.Type.GROUND, Pokemon.Type.ELECTRIC, Pokemon.Format.ZU)); // Stunfisk
        PokeList.add(new Pokemon(620, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mienshao
        PokeList.add(new Pokemon(621, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Druddigon

        PokeList.add(new Pokemon(623, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Golurk
        PokeList.add(new Pokemon(625, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Bisharp
        PokeList.add(new Pokemon(626, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bouffalant
        PokeList.add(new Pokemon(6280001, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Braviary
        PokeList.add(new Pokemon(630, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mandibuzz

        PokeList.add(new Pokemon(631, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Heatmor
        PokeList.add(new Pokemon(632, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Durant
        PokeList.add(new Pokemon(635, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydreigon
        PokeList.add(new Pokemon(637, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Volcarona

        PokeList.add(new Pokemon(638, 5, Pokemon.Type.STEEL, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Cobalion
        PokeList.add(new Pokemon(639, 5, Pokemon.Type.ROCK, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Terrakion
        PokeList.add(new Pokemon(640, 5, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Virizion

        PokeList.add(new Pokemon(6410001, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tornadus
        PokeList.add(new Pokemon(6410002, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tornadus-Therian
        PokeList.add(new Pokemon(6420001, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus
        PokeList.add(new Pokemon(6420002, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus-Therian

        PokeList.add(new Pokemon(643, 5, Pokemon.Type.DRAGON, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Reshiram
        PokeList.add(new Pokemon(644, 5, Pokemon.Type.DRAGON, Pokemon.Type.ELECTRIC, Pokemon.Format.UBER)); // Zekrom

        PokeList.add(new Pokemon(6450001, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Landorus
        PokeList.add(new Pokemon(6450002, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Landorus-Therian

        PokeList.add(new Pokemon(6460001, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UU)); // Kyurem
        PokeList.add(new Pokemon(6460002, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Kyurem-White
        PokeList.add(new Pokemon(6460003, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem-Black

        PokeList.add(new Pokemon(647, 5, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Keldeo

        PokeList.add(new Pokemon(6480001, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta
        PokeList.add(new Pokemon(6480002, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta-Piroutte

        PokeList.add(new Pokemon(649, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Genesect

        PokeList.add(new Pokemon(652, 6, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Chesnaught
        PokeList.add(new Pokemon(655, 6, Pokemon.Type.FIRE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Delphox
        PokeList.add(new Pokemon(658, 6, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); // Greninja

        PokeList.add(new Pokemon(660, 6, Pokemon.Type.NORMAL, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Diggersby
        PokeList.add(new Pokemon(663, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Talonflame
        PokeList.add(new Pokemon(666, 6, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Vivillon
        PokeList.add(new Pokemon(668, 6, Pokemon.Type.FIRE, Pokemon.Type.NORMAL, Pokemon.Format.NU)); // Pyroar
        PokeList.add(new Pokemon(671, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Florges

        PokeList.add(new Pokemon(673, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gogoat
        PokeList.add(new Pokemon(675, 6, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.NU)); // Pangoro
        PokeList.add(new Pokemon(676, 6, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Furfrou
        PokeList.add(new Pokemon(678, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meowstic
        PokeList.add(new Pokemon(681, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Aegislash

        PokeList.add(new Pokemon(683, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Aromatisse
        PokeList.add(new Pokemon(685, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Slurpuff
        PokeList.add(new Pokemon(687, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Malamar
        PokeList.add(new Pokemon(689, 6, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.RU)); // Barbaracle
        PokeList.add(new Pokemon(691, 6, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Dragalge

        PokeList.add(new Pokemon(693, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Clawitzer
        PokeList.add(new Pokemon(695, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.NORMAL, Pokemon.Format.NU)); // Heliolisk
        PokeList.add(new Pokemon(697, 6, Pokemon.Type.ROCK, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Tyrantrum
        PokeList.add(new Pokemon(699, 6, Pokemon.Type.ROCK, Pokemon.Type.ICE, Pokemon.Format.PU)); // Aurorus
        PokeList.add(new Pokemon(700, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sylveon

        PokeList.add(new Pokemon(701, 6, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Hawlucha
        PokeList.add(new Pokemon(702, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Dedenne
        PokeList.add(new Pokemon(703, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Carbink
        PokeList.add(new Pokemon(7060001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Goodra
        PokeList.add(new Pokemon(707, 6, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Klefki

        PokeList.add(new Pokemon(709, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Trevenant
        PokeList.add(new Pokemon(711, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Gourgeist
        PokeList.add(new Pokemon(7130001, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Avalugg
        PokeList.add(new Pokemon(715, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Noivern

        PokeList.add(new Pokemon(716, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Xerneas
        PokeList.add(new Pokemon(717, 6, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Yveltal
        PokeList.add(new Pokemon(7180001, 6, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.UBER)); // Zygarde
        PokeList.add(new Pokemon(7180002, 6, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Zygarde-10%

        PokeList.add(new Pokemon(7190001, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Diancie
        PokeList.add(new Pokemon(7190002, 6, true, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Diancie-Mega

        PokeList.add(new Pokemon(7200001, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Hoopa
        PokeList.add(new Pokemon(7200002, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Hoopa-Unbound
        PokeList.add(new Pokemon(721, 6, Pokemon.Type.FIRE, Pokemon.Type.WATER, Pokemon.Format.UU)); // Volcanion

        PokeList.add(new Pokemon(7240001, 7, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Decidueye
        PokeList.add(new Pokemon(727, 7, Pokemon.Type.FIRE, Pokemon.Type.DARK, Pokemon.Format.NU)); // Incineroar
        PokeList.add(new Pokemon(730, 7, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Primarina

        PokeList.add(new Pokemon(733, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Toucannon
        PokeList.add(new Pokemon(735, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gumshoos
        PokeList.add(new Pokemon(738, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NU)); // Vikavolt
        PokeList.add(new Pokemon(740, 7, Pokemon.Type.FIGHTING, Pokemon.Type.ICE, Pokemon.Format.PU)); // Crabominable
        PokeList.add(new Pokemon(741, 7, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Oricorio

        PokeList.add(new Pokemon(743, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Ribombee

        PokeList.add(new Pokemon(7450001, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lycanroc
        PokeList.add(new Pokemon(7450002, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Lycanroc-Dusk
        PokeList.add(new Pokemon(7450003, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lycanroc-Midnight

        PokeList.add(new Pokemon(746, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wishiwashi
        PokeList.add(new Pokemon(748, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.OU)); // Toxapex
        PokeList.add(new Pokemon(750, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Mudsdale

        PokeList.add(new Pokemon(752, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.RU)); // Araquanid
        PokeList.add(new Pokemon(754, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lurantis
        PokeList.add(new Pokemon(756, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Shiinotic
        PokeList.add(new Pokemon(758, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Salazzle
        PokeList.add(new Pokemon(760, 7, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Bewear

        PokeList.add(new Pokemon(763, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Tsareena
        PokeList.add(new Pokemon(764, 7, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NU)); // Comfey
        PokeList.add(new Pokemon(765, 7, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Oranguru
        PokeList.add(new Pokemon(766, 7, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Passimian
        PokeList.add(new Pokemon(768, 7, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.RU)); // Golisopod

        PokeList.add(new Pokemon(770, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Palossand
        PokeList.add(new Pokemon(771, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pyukumuku

        PokeList.add(new Pokemon(772, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Type: Null
        PokeList.add(new Pokemon(773, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Silvally

        PokeList.add(new Pokemon(774, 7, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Minior
        PokeList.add(new Pokemon(775, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Komala
        PokeList.add(new Pokemon(776, 7, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.PU)); // Turtonator
        PokeList.add(new Pokemon(777, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Togedemaru
        PokeList.add(new Pokemon(778, 7, Pokemon.Type.GHOST, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Mimikyu

        PokeList.add(new Pokemon(779, 7, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bruxish
        PokeList.add(new Pokemon(780, 7, Pokemon.Type.NORMAL, Pokemon.Type.DRAGON, Pokemon.Format.PU)); // Drampa
        PokeList.add(new Pokemon(781, 7, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Dhelmise
        PokeList.add(new Pokemon(784, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Kommo-o

        PokeList.add(new Pokemon(785, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Koko
        PokeList.add(new Pokemon(786, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Lele
        PokeList.add(new Pokemon(787, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Bulu
        PokeList.add(new Pokemon(788, 7, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Fini

        PokeList.add(new Pokemon(791, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Solgaleo
        PokeList.add(new Pokemon(792, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Lunala

        PokeList.add(new Pokemon(793, 7, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.UU)); // Nihilego
        PokeList.add(new Pokemon(794, 7, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Buzzwole
        PokeList.add(new Pokemon(795, 7, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Pheromosa
        PokeList.add(new Pokemon(796, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Xurkitree
        PokeList.add(new Pokemon(797, 7, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Celesteela

        PokeList.add(new Pokemon(798, 7, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Kartana
        PokeList.add(new Pokemon(799, 7, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Guzzlord

        PokeList.add(new Pokemon(8000001, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Necrozma
        PokeList.add(new Pokemon(8000002, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Necrozma-Dusk
        PokeList.add(new Pokemon(8000003, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Necrozma-Dawn

        PokeList.add(new Pokemon(801, 7, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Magearna
        PokeList.add(new Pokemon(802, 7, Pokemon.Type.FIGHTING, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Marshadow

        PokeList.add(new Pokemon(804, 7, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Naganadel

        PokeList.add(new Pokemon(805, 7, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Stakataka
        PokeList.add(new Pokemon(806, 7, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Blacephalon
        PokeList.add(new Pokemon(807, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zeraora

        PokeList.add(new Pokemon(8090001, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Melmetal
    }
    //SEGMENT: gen 8 nat Dex
    private void initGen8nat() {
        initGen7();
        PokeList.add(new Pokemon(30004, 1,Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.GMAX)); // Venusaur-GMAX
        PokeList.add(new Pokemon(60004, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.GMAX)); // Charizard-GMAX
        PokeList.add(new Pokemon(90004, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Blastoise-GMAX

        PokeList.add(new Pokemon(120004, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.GMAX)); // Butterfree-GMAX
        PokeList.add(new Pokemon(250004, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Pikachu-GMAX
        PokeList.add(new Pokemon(520004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Mewoth-GMAX

        PokeList.add(new Pokemon(680004, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Machamp-GMAX
        PokeList.add(new Pokemon(940004, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.GMAX)); // Gengar-GMAX
        PokeList.add(new Pokemon(990004, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Kingler-GMAX

        PokeList.add(new Pokemon(1310004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Eevee-GMAX
        PokeList.add(new Pokemon(1430004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Snorlax-GMAX

        PokeList.add(new Pokemon(5690004, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Garbodor-GMAX
        PokeList.add(new Pokemon(8090004, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Melmetal-GMAX

        PokeList.add(new Pokemon(8120004, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Rillaboom-GMAX
        PokeList.add(new Pokemon(8150004, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Cinderace-GMAX
        PokeList.add(new Pokemon(8180004, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Inteleon-GMAX

        PokeList.add(new Pokemon(8230004, 8, Pokemon.Type.FLYING, Pokemon.Type.STEEL, Pokemon.Format.GMAX)); // Corviknight-GMAX
        PokeList.add(new Pokemon(8260004, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.GMAX)); // Orbeetle-GMAX
        PokeList.add(new Pokemon(8340004, 8, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.GMAX)); // Drednaw-GMAX

        PokeList.add(new Pokemon(8390004, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.GMAX)); // Coalossal-GMAX
        PokeList.add(new Pokemon(8410004, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); // Flapple-GMAX
        PokeList.add(new Pokemon(8420004, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); // Appletun-GMAX

        PokeList.add(new Pokemon(8440004, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Sandaconda-GMAX
        PokeList.add(new Pokemon(8490004, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); //Toxtricity-GMAX
        PokeList.add(new Pokemon(8510004, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.GMAX)); //Centiskorch-GMAX

        PokeList.add(new Pokemon(8580004, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.GMAX)); //Hatterene-GMAX
        PokeList.add(new Pokemon(8610004, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.GMAX)); //Grimmsnarl-GMAX
        PokeList.add(new Pokemon(8690004, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Alcremie-GMAX

        PokeList.add(new Pokemon(8790004, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Copperajah-GMAX
        PokeList.add(new Pokemon(8840004, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); //Duraludon-GMAX

        PokeList.add(new Pokemon(8920003, 8, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.GMAX)); //Urshifu-GMAX
        PokeList.add(new Pokemon(8920004, 8, Pokemon.Type.FIGHTING, Pokemon.Type.WATER, Pokemon.Format.GMAX)); //Urshifu-Rapid-Strike-GMAX

        PokeList.add(new Pokemon(590002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.UU)); //Arcanine
        PokeList.add(new Pokemon(770002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); //Rapidash
        PokeList.add(new Pokemon(800002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); //Slowbro
        PokeList.add(new Pokemon(1010002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.PU)); //Electrode
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.RU)); //Weezing

        PokeList.add(new Pokemon(1440002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Articuno
        PokeList.add(new Pokemon(1450002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.RU)); //Zapdos
        PokeList.add(new Pokemon(1460002, 8, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.OU)); //Moltres

        PokeList.add(new Pokemon(1570002, 8, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.NU)); //Typhlosion
        PokeList.add(new Pokemon(1990002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); //Slowking
        PokeList.add(new Pokemon(5030002, 8, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); //Samurott
        PokeList.add(new Pokemon(5490002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); //Lilligant

        PokeList.add(new Pokemon(5550002, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.UBER)); //Darmanitan
        PokeList.add(new Pokemon(5710002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.RU)); //Zoroark
        PokeList.add(new Pokemon(6180002, 8, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.ZU)); //Stunfisk
        PokeList.add(new Pokemon(6280002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Braviary
        PokeList.add(new Pokemon(7060002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.RU)); //Goodra

        PokeList.add(new Pokemon(7130002, 8, Pokemon.Type.ICE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); //Avalugg
        PokeList.add(new Pokemon(7240002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); //Rapidash

        PokeList.add(new Pokemon(8120001, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Rillaboom
        PokeList.add(new Pokemon(8150001, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Cinderace
        PokeList.add(new Pokemon(8180001, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Inteleon

        PokeList.add(new Pokemon(820, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Greedent
        PokeList.add(new Pokemon(8230001, 8, Pokemon.Type.FLYING, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Corviknight
        PokeList.add(new Pokemon(8260001, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Orbeetle
        PokeList.add(new Pokemon(828, 8, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Thievul
        PokeList.add(new Pokemon(830, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Eldegoss

        PokeList.add(new Pokemon(832, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dubwool
        PokeList.add(new Pokemon(8340001, 8, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Drednaw
        PokeList.add(new Pokemon(836, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Boltund
        PokeList.add(new Pokemon(8390001, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.ZU)); // Coalossal

        PokeList.add(new Pokemon(8410001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Flapple
        PokeList.add(new Pokemon(8420001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Appletun

        PokeList.add(new Pokemon(8440001, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sandaconda
        PokeList.add(new Pokemon(845, 8, Pokemon.Type.FLYING, Pokemon.Type.WATER, Pokemon.Format.ZU)); // Cramorant
        PokeList.add(new Pokemon(847, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Barraskewda
        PokeList.add(new Pokemon(8490001, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.RU)); // Toxtricity
        PokeList.add(new Pokemon(8510001, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.PU)); // Centiskorch

        PokeList.add(new Pokemon(853, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Grapploct
        PokeList.add(new Pokemon(855, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Polteageist
        PokeList.add(new Pokemon(8580001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Hatterene
        PokeList.add(new Pokemon(861, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Grimmsnarl
        PokeList.add(new Pokemon(862, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.UU)); // Obstagoon

        PokeList.add(new Pokemon(863, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Perrserker
        PokeList.add(new Pokemon(864, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Cursola
        PokeList.add(new Pokemon(865, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sirfetch'd
        PokeList.add(new Pokemon(866, 8, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Mr. Rime
        PokeList.add(new Pokemon(867, 8, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.ZU)); // Runerigus

        PokeList.add(new Pokemon(8690001, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Alcremie
        PokeList.add(new Pokemon(870, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Falinks
        PokeList.add(new Pokemon(871, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pincurchin
        PokeList.add(new Pokemon(873, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.PU)); // Frosmoth
        PokeList.add(new Pokemon(874, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stonjourner

        PokeList.add(new Pokemon(875, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Eiscue
        PokeList.add(new Pokemon(8760001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-F
        PokeList.add(new Pokemon(8760002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-M
        PokeList.add(new Pokemon(877, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Morpeko
        PokeList.add(new Pokemon(8790001, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Copperajah

        PokeList.add(new Pokemon(880, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Dracozolt
        PokeList.add(new Pokemon(881, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.OU)); // Arctozolt
        PokeList.add(new Pokemon(882, 8, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dracovish
        PokeList.add(new Pokemon(883, 8, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.PU)); // Arctovish

        PokeList.add(new Pokemon(8840001, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Duraludon
        PokeList.add(new Pokemon(887, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Dragapult

        PokeList.add(new Pokemon(888, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.AG)); // Zacian
        PokeList.add(new Pokemon(889, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Zamazenta

        PokeList.add(new Pokemon(890, 8, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Eternatus
        PokeList.add(new Pokemon(8920001, 8, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.UBER)); // Urshifu
        PokeList.add(new Pokemon(8920002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.WATER, Pokemon.Format.UBER)); // Urshifu-Rapid-Strike
        PokeList.add(new Pokemon(893, 8, Pokemon.Type.DARK, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Zarude

        PokeList.add(new Pokemon(894, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Regieleki
        PokeList.add(new Pokemon(895, 8, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Regidrago

        PokeList.add(new Pokemon(896, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Glastrier
        PokeList.add(new Pokemon(897, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Spectrier

        PokeList.add(new Pokemon(8980001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Calyrex
        PokeList.add(new Pokemon(8980002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UBER)); // Calyrex-Ice
        PokeList.add(new Pokemon(8980003, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.AG)); // Calyrex-Shadow

        PokeList.add(new Pokemon(899, 8, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Wyrdeer
        PokeList.add(new Pokemon(900, 8, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Kleavor
        PokeList.add(new Pokemon(9010001, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.OU)); // Ursaluna
        PokeList.add(new Pokemon(9010002, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.UBER)); // Ursaluna

        PokeList.add(new Pokemon(9020001, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Basculegion
        PokeList.add(new Pokemon(9020002, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Basculegionf
        PokeList.add(new Pokemon(903, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.UBER)); // Sneasler

        PokeList.add(new Pokemon(904, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.NU)); // Overqwil
        PokeList.add(new Pokemon(9050001, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Enamorus
        PokeList.add(new Pokemon(9050002, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Enamorus-Therian
    }
    //SEGMENT: gen 8
    private void initGen8() {
        //TODO Change the format
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Blastoise

        PokeList.add(new Pokemon(12, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Butterfree


        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Raichu

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sandslash
        PokeList.add(new Pokemon(280002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Sandslash-Alola

        PokeList.add(new Pokemon(31, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Nidoqueen
        PokeList.add(new Pokemon(34, 1, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Nidoking
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.OU)); // Clefable

        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ninetales
        PokeList.add(new Pokemon(380002, 7, Pokemon.Type.ICE, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Ninetales-Alola

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Wigglytuff
        PokeList.add(new Pokemon(42, 1, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Golbat
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Vileplume

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Persian
        PokeList.add(new Pokemon(510002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Dugtrio-Alola
        PokeList.add(new Pokemon(530002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Persian-Alola

        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Golduck
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); // Poliwrath
        PokeList.add(new Pokemon(650001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Alakazam
        PokeList.add(new Pokemon(680001, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Machamp
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Tentacruel
        PokeList.add(new Pokemon(780001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Rapidash

        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Slowbro

        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Magneton
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.RU)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UU)); // Gengar

        PokeList.add(new Pokemon(990001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Kingler

        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Exeggutor
        PokeList.add(new Pokemon(1030002, 7, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Exeggutor-Alola

        PokeList.add(new Pokemon(105, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Marowak
        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey
        PokeList.add(new Pokemon(114, 1, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Tangela
        PokeList.add(new Pokemon(1150001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Kangaskhan

        PokeList.add(new Pokemon(119, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seaking
        PokeList.add(new Pokemon(121, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Starmie
        PokeList.add(new Pokemon(122, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Mr. Mime
        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Scyther
        PokeList.add(new Pokemon(124, 1, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Jynx

        PokeList.add(new Pokemon(1270001, 1, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pinsir

        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros

        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Flareon

        PokeList.add(new Pokemon(139, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.PU)); // Omastar
        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.PU)); // Kabutops

        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Aerodactyl

        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite

        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mew
        
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Noctowl

        PokeList.add(new Pokemon(169, 2, Pokemon.Type.POISON, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Crobat
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Lanturn
        PokeList.add(new Pokemon(178, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Xatu

        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Politoed

        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Slowking

        PokeList.add(new Pokemon(202, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wobbuffet
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dunsparce

        PokeList.add(new Pokemon(2080001, 2, Pokemon.Type.STEEL, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Steelix

        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.PU)); // Qwilfish

        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Scizor

        PokeList.add(new Pokemon(213, 2, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Shuckle

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Heracross

        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.NU)); // Sneasel
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(2220001, 2, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Corsola
        PokeList.add(new Pokemon(224, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Octillery
        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Delibird
        PokeList.add(new Pokemon(226, 2, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mantine
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Kingdra
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Porygon2

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmontop
        PokeList.add(new Pokemon(241, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Miltank
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar
        PokeList.add(new Pokemon(2480002, 2, true, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar-Mega

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh
        PokeList.add(new Pokemon(251, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Celebi

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sceptile
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert

        PokeList.add(new Pokemon(2640001, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Linoone
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Ludicolo
        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.PU)); // Shiftry
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Pelipper
        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Gardevoir

        PokeList.add(new Pokemon(291, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Ninjask
        PokeList.add(new Pokemon(292, 3, Pokemon.Type.BUG, Pokemon.Type.GHOST, Pokemon.Format.ZU)); // Shedinja
        PokeList.add(new Pokemon(295, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Exploud


        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Sableye
        PokeList.add(new Pokemon(3030001, 3, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Mawile

        PokeList.add(new Pokemon(3060001, 3, Pokemon.Type.STEEL, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Aggron
        PokeList.add(new Pokemon(3100001, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Manectric


        PokeList.add(new Pokemon(315, 3, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Roselia
        PokeList.add(new Pokemon(3190001, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Sharpedo

        PokeList.add(new Pokemon(321, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wailord

        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Torkoal
        PokeList.add(new Pokemon(327, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spinda

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Flygon
        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Altaria

        PokeList.add(new Pokemon(337, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU));  // Lunatone
        PokeList.add(new Pokemon(338, 3, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Solrock
        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Crawdaunt
        PokeList.add(new Pokemon(344, 3, Pokemon.Type.GROUND, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Claydol

        PokeList.add(new Pokemon(346, 3, Pokemon.Type.ROCK, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Cradily
        PokeList.add(new Pokemon(348, 3, Pokemon.Type.ROCK, Pokemon.Type.BUG, Pokemon.Format.ZU)); // Armaldo
        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Milotic

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Banette
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusclops


        PokeList.add(new Pokemon(3590001, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Absol
        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glalie

        PokeList.add(new Pokemon(365, 3, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Walrein
        PokeList.add(new Pokemon(369, 3, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Relicanth
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence

        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Metagross

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza


        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi

        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luxray
        PokeList.add(new Pokemon(407, 4, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Roserade

        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Vespiquen
        
        PokeList.add(new Pokemon(421, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Cherrim
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Gastrodon

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Drifblim

        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lopunny

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.PU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bronzong
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.PU)); // Spiritomb

        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp
        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Lucario

        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hippowdon
        PokeList.add(new Pokemon(452, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.RU)); // Drapion
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Toxicroak

        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Abomasnow

        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.OU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(463, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lickilicky

        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Rhyperior
        PokeList.add(new Pokemon(465, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tangrowth
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmortar
        PokeList.add(new Pokemon(468, 4, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Togekiss

        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glaceon
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon-Z

        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Gallade

        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.PU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.RU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.WATER, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cresselia
        PokeList.add(new Pokemon(494, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Victini


        PokeList.add(new Pokemon(508, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Stoutland
        PokeList.add(new Pokemon(510, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Liepard

        PokeList.add(new Pokemon(518, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Musharna
        PokeList.add(new Pokemon(521, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Unfezant
        PokeList.add(new Pokemon(526, 5, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Gigalith
        PokeList.add(new Pokemon(528, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Swoobat

        PokeList.add(new Pokemon(530, 5, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Excadrill

        PokeList.add(new Pokemon(5310001, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Audino

        PokeList.add(new Pokemon(534, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Conkeldurr
        PokeList.add(new Pokemon(537, 5, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Seismitoad

        PokeList.add(new Pokemon(538, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Throh
        PokeList.add(new Pokemon(539, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sawk

        PokeList.add(new Pokemon(545, 5, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.OU)); // Scolipede
        PokeList.add(new Pokemon(547, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Whimsicott
        PokeList.add(new Pokemon(549, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lilligant
        PokeList.add(new Pokemon(550, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Basculin

        PokeList.add(new Pokemon(553, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.UU)); // Krookodile
        PokeList.add(new Pokemon(5550001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Darmanitan
        PokeList.add(new Pokemon(556, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Maractus
        PokeList.add(new Pokemon(558, 5, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Crustle
        PokeList.add(new Pokemon(560, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Scrafty

        PokeList.add(new Pokemon(561, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Sigilyph
        PokeList.add(new Pokemon(563, 5, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cofagrigus
        PokeList.add(new Pokemon(565, 5, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.PU)); // Carracosta
        PokeList.add(new Pokemon(567, 5, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Archeops
        PokeList.add(new Pokemon(5690001, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Garbodor

        PokeList.add(new Pokemon(5710001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zoroark
        PokeList.add(new Pokemon(573, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cinccino
        PokeList.add(new Pokemon(576, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gothitelle
        PokeList.add(new Pokemon(579, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Reuniclus

        PokeList.add(new Pokemon(584, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Vanilluxe
        PokeList.add(new Pokemon(587, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Emolga
        PokeList.add(new Pokemon(589, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Escavalier
        PokeList.add(new Pokemon(591, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Amoonguss

        PokeList.add(new Pokemon(593, 5, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Jellicent
        PokeList.add(new Pokemon(596, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Galvantula
        PokeList.add(new Pokemon(598, 5, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Ferrothorn
        PokeList.add(new Pokemon(601, 5, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Klinklang

        PokeList.add(new Pokemon(606, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beheeyem
        PokeList.add(new Pokemon(609, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Chandelure
        PokeList.add(new Pokemon(612, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Haxorus
        PokeList.add(new Pokemon(614, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beartic

        PokeList.add(new Pokemon(615, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Cryogonal
        PokeList.add(new Pokemon(617, 5, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.NU)); // Accelgor
        PokeList.add(new Pokemon(6180001, 5, Pokemon.Type.GROUND, Pokemon.Type.ELECTRIC, Pokemon.Format.ZU)); // Stunfisk
        PokeList.add(new Pokemon(620, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mienshao
        PokeList.add(new Pokemon(621, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Druddigon

        PokeList.add(new Pokemon(623, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Golurk
        PokeList.add(new Pokemon(625, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Bisharp
        PokeList.add(new Pokemon(626, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bouffalant
        PokeList.add(new Pokemon(6280001, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Braviary
        PokeList.add(new Pokemon(630, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mandibuzz

        PokeList.add(new Pokemon(631, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Heatmor
        PokeList.add(new Pokemon(632, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Durant
        PokeList.add(new Pokemon(635, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydreigon
        PokeList.add(new Pokemon(637, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Volcarona

        PokeList.add(new Pokemon(638, 5, Pokemon.Type.STEEL, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Cobalion
        PokeList.add(new Pokemon(639, 5, Pokemon.Type.ROCK, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Terrakion
        PokeList.add(new Pokemon(640, 5, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Virizion

        PokeList.add(new Pokemon(6410001, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tornadus
        PokeList.add(new Pokemon(6410002, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tornadus-Therian
        PokeList.add(new Pokemon(6420001, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus
        PokeList.add(new Pokemon(6420002, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus-Therian

        PokeList.add(new Pokemon(643, 5, Pokemon.Type.DRAGON, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Reshiram
        PokeList.add(new Pokemon(644, 5, Pokemon.Type.DRAGON, Pokemon.Type.ELECTRIC, Pokemon.Format.UBER)); // Zekrom

        PokeList.add(new Pokemon(6450001, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Landorus
        PokeList.add(new Pokemon(6450002, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Landorus-Therian

        PokeList.add(new Pokemon(6460001, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UU)); // Kyurem
        PokeList.add(new Pokemon(6460002, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Kyurem-White
        PokeList.add(new Pokemon(6460003, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem-Black

        PokeList.add(new Pokemon(647, 5, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Keldeo
        PokeList.add(new Pokemon(649, 5, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Genesect

        PokeList.add(new Pokemon(660, 6, Pokemon.Type.NORMAL, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Diggersby
        PokeList.add(new Pokemon(663, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Talonflame

        PokeList.add(new Pokemon(675, 6, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.NU)); // Pangoro
        PokeList.add(new Pokemon(678, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meowstic
        PokeList.add(new Pokemon(681, 6, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Aegislash

        PokeList.add(new Pokemon(683, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Aromatisse
        PokeList.add(new Pokemon(685, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Slurpuff
        PokeList.add(new Pokemon(687, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Malamar
        PokeList.add(new Pokemon(689, 6, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.RU)); // Barbaracle
        PokeList.add(new Pokemon(691, 6, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Dragalge

        PokeList.add(new Pokemon(693, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Clawitzer
        PokeList.add(new Pokemon(695, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.NORMAL, Pokemon.Format.NU)); // Heliolisk
        PokeList.add(new Pokemon(697, 6, Pokemon.Type.ROCK, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Tyrantrum
        PokeList.add(new Pokemon(699, 6, Pokemon.Type.ROCK, Pokemon.Type.ICE, Pokemon.Format.PU)); // Aurorus
        PokeList.add(new Pokemon(700, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sylveon

        PokeList.add(new Pokemon(701, 6, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Hawlucha
        PokeList.add(new Pokemon(702, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Dedenne
        PokeList.add(new Pokemon(703, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Carbink
        PokeList.add(new Pokemon(7060001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Goodra
        PokeList.add(new Pokemon(707, 6, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Klefki

        PokeList.add(new Pokemon(709, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Trevenant
        PokeList.add(new Pokemon(711, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Gourgeist
        PokeList.add(new Pokemon(7130001, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Avalugg
        PokeList.add(new Pokemon(715, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Noivern

        PokeList.add(new Pokemon(716, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Xerneas
        PokeList.add(new Pokemon(717, 6, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Yveltal
        PokeList.add(new Pokemon(7180001, 6, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.UBER)); // Zygarde
        PokeList.add(new Pokemon(7180002, 6, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.RU)); // Zygarde-10%

        PokeList.add(new Pokemon(7190001, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Diancie
        PokeList.add(new Pokemon(721, 6, Pokemon.Type.FIRE, Pokemon.Type.WATER, Pokemon.Format.UU)); // Volcanion

        PokeList.add(new Pokemon(7240001, 7, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Decidueye
        PokeList.add(new Pokemon(727, 7, Pokemon.Type.FIRE, Pokemon.Type.DARK, Pokemon.Format.NU)); // Incineroar
        PokeList.add(new Pokemon(730, 7, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Primarina

        PokeList.add(new Pokemon(738, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NU)); // Vikavolt

        PokeList.add(new Pokemon(743, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Ribombee

        PokeList.add(new Pokemon(7450001, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lycanroc
        PokeList.add(new Pokemon(7450002, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Lycanroc-Dusk
        PokeList.add(new Pokemon(7450003, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lycanroc-Midnight

        PokeList.add(new Pokemon(746, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wishiwashi
        PokeList.add(new Pokemon(748, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.OU)); // Toxapex
        PokeList.add(new Pokemon(750, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Mudsdale

        PokeList.add(new Pokemon(752, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.RU)); // Araquanid
        PokeList.add(new Pokemon(754, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lurantis
        PokeList.add(new Pokemon(756, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Shiinotic
        PokeList.add(new Pokemon(758, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Salazzle
        PokeList.add(new Pokemon(760, 7, Pokemon.Type.NORMAL, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Bewear

        PokeList.add(new Pokemon(763, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Tsareena
        PokeList.add(new Pokemon(764, 7, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NU)); // Comfey
        PokeList.add(new Pokemon(765, 7, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Oranguru
        PokeList.add(new Pokemon(766, 7, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Passimian
        PokeList.add(new Pokemon(768, 7, Pokemon.Type.BUG, Pokemon.Type.WATER, Pokemon.Format.RU)); // Golisopod

        PokeList.add(new Pokemon(770, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Palossand
        PokeList.add(new Pokemon(771, 7, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pyukumuku

        PokeList.add(new Pokemon(772, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Type: Null
        PokeList.add(new Pokemon(773, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Silvally

        PokeList.add(new Pokemon(776, 7, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.PU)); // Turtonator
        PokeList.add(new Pokemon(777, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.NU)); // Togedemaru
        PokeList.add(new Pokemon(778, 7, Pokemon.Type.GHOST, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Mimikyu

        PokeList.add(new Pokemon(780, 7, Pokemon.Type.NORMAL, Pokemon.Type.DRAGON, Pokemon.Format.PU)); // Drampa
        PokeList.add(new Pokemon(781, 7, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.NU)); // Dhelmise
        PokeList.add(new Pokemon(784, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Kommo-o

        PokeList.add(new Pokemon(785, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Koko
        PokeList.add(new Pokemon(786, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Lele
        PokeList.add(new Pokemon(787, 7, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Bulu
        PokeList.add(new Pokemon(788, 7, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Tapu Fini

        PokeList.add(new Pokemon(791, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Solgaleo
        PokeList.add(new Pokemon(792, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Lunala

        PokeList.add(new Pokemon(793, 7, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.UU)); // Nihilego
        PokeList.add(new Pokemon(794, 7, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Buzzwole
        PokeList.add(new Pokemon(795, 7, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Pheromosa
        PokeList.add(new Pokemon(796, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.OU)); // Xurkitree
        PokeList.add(new Pokemon(797, 7, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Celesteela

        PokeList.add(new Pokemon(798, 7, Pokemon.Type.GRASS, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Kartana
        PokeList.add(new Pokemon(799, 7, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Guzzlord

        PokeList.add(new Pokemon(8000001, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Necrozma
        PokeList.add(new Pokemon(8000002, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Necrozma-Dusk
        PokeList.add(new Pokemon(8000003, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Necrozma-Dawn

        PokeList.add(new Pokemon(801, 7, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Magearna
        PokeList.add(new Pokemon(802, 7, Pokemon.Type.FIGHTING, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Marshadow

        PokeList.add(new Pokemon(804, 7, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Naganadel

        PokeList.add(new Pokemon(805, 7, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Stakataka
        PokeList.add(new Pokemon(806, 7, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Blacephalon
        PokeList.add(new Pokemon(807, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zeraora
        PokeList.add(new Pokemon(8090001, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Melmetal

        PokeList.add(new Pokemon(30004, 1,Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.GMAX)); // Venusaur-GMAX
        PokeList.add(new Pokemon(60004, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.GMAX)); // Charizard-GMAX
        PokeList.add(new Pokemon(90004, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Blastoise-GMAX

        PokeList.add(new Pokemon(120004, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.GMAX)); // Butterfree-GMAX
        PokeList.add(new Pokemon(250004, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Pikachu-GMAX
        PokeList.add(new Pokemon(520004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Mewoth-GMAX

        PokeList.add(new Pokemon(680004, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Machamp-GMAX
        PokeList.add(new Pokemon(940004, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.GMAX)); // Gengar-GMAX
        PokeList.add(new Pokemon(990004, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Kingler-GMAX

        PokeList.add(new Pokemon(1310004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Eevee-GMAX
        PokeList.add(new Pokemon(1430004, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Snorlax-GMAX

        PokeList.add(new Pokemon(5690004, 5, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Garbodor-GMAX
        PokeList.add(new Pokemon(8090004, 7, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Melmetal-GMAX

        PokeList.add(new Pokemon(8120004, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Rillaboom-GMAX
        PokeList.add(new Pokemon(8150004, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Cinderace-GMAX
        PokeList.add(new Pokemon(8180004, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.GMAX)); // Inteleon-GMAX

        PokeList.add(new Pokemon(8230004, 8, Pokemon.Type.FLYING, Pokemon.Type.STEEL, Pokemon.Format.GMAX)); // Corviknight-GMAX
        PokeList.add(new Pokemon(8260004, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.GMAX)); // Orbeetle-GMAX
        PokeList.add(new Pokemon(8340004, 8, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.GMAX)); // Drednaw-GMAX

        PokeList.add(new Pokemon(8390004, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.GMAX)); // Coalossal-GMAX
        PokeList.add(new Pokemon(8410004, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); // Flapple-GMAX
        PokeList.add(new Pokemon(8420004, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); // Appletun-GMAX

        PokeList.add(new Pokemon(8440004, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Sandaconda-GMAX
        PokeList.add(new Pokemon(8490004, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); //Toxtricity-GMAX
        PokeList.add(new Pokemon(8510004, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.GMAX)); //Centiskorch-GMAX

        PokeList.add(new Pokemon(8580004, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.GMAX)); //Hatterene-GMAX
        PokeList.add(new Pokemon(8610004, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.GMAX)); //Grimmsnarl-GMAX
        PokeList.add(new Pokemon(8690004, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Alcremie-GMAX

        PokeList.add(new Pokemon(8790004, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.GMAX)); //Copperajah-GMAX
        PokeList.add(new Pokemon(8840004, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.GMAX)); //Duraludon-GMAX

        PokeList.add(new Pokemon(8920003, 8, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.GMAX)); //Urshifu-GMAX
        PokeList.add(new Pokemon(8920004, 8, Pokemon.Type.FIGHTING, Pokemon.Type.WATER, Pokemon.Format.GMAX)); //Urshifu-Rapid-Strike-GMAX

        PokeList.add(new Pokemon(590002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.UU)); //Arcanine
        PokeList.add(new Pokemon(770002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); //Rapidash
        PokeList.add(new Pokemon(800002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); //Slowbro
        PokeList.add(new Pokemon(1010002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.PU)); //Electrode
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.RU)); //Weezing

        PokeList.add(new Pokemon(1440002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Articuno
        PokeList.add(new Pokemon(1450002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.RU)); //Zapdos
        PokeList.add(new Pokemon(1460002, 8, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.OU)); //Moltres

        PokeList.add(new Pokemon(1570002, 8, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.NU)); //Typhlosion
        PokeList.add(new Pokemon(1990002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); //Slowking
        PokeList.add(new Pokemon(5030002, 8, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); //Samurott
        PokeList.add(new Pokemon(5490002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); //Lilligant

        PokeList.add(new Pokemon(5550002, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.UBER)); //Darmanitan
        PokeList.add(new Pokemon(5710002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.RU)); //Zoroark
        PokeList.add(new Pokemon(6180002, 8, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.ZU)); //Stunfisk
        PokeList.add(new Pokemon(6280002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Braviary
        PokeList.add(new Pokemon(7060002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.RU)); //Goodra

        PokeList.add(new Pokemon(7130002, 8, Pokemon.Type.ICE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); //Avalugg
        PokeList.add(new Pokemon(7240002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); //Rapidash

        PokeList.add(new Pokemon(8120001, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Rillaboom
        PokeList.add(new Pokemon(8150001, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Cinderace
        PokeList.add(new Pokemon(8180001, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Inteleon

        PokeList.add(new Pokemon(820, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Greedent
        PokeList.add(new Pokemon(8230001, 8, Pokemon.Type.FLYING, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Corviknight
        PokeList.add(new Pokemon(8260001, 8, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Orbeetle
        PokeList.add(new Pokemon(828, 8, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Thievul
        PokeList.add(new Pokemon(830, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Eldegoss

        PokeList.add(new Pokemon(832, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dubwool
        PokeList.add(new Pokemon(8340001, 8, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Drednaw
        PokeList.add(new Pokemon(836, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Boltund
        PokeList.add(new Pokemon(8390001, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.ZU)); // Coalossal

        PokeList.add(new Pokemon(8410001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Flapple
        PokeList.add(new Pokemon(8420001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Appletun

        PokeList.add(new Pokemon(8440001, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sandaconda
        PokeList.add(new Pokemon(845, 8, Pokemon.Type.FLYING, Pokemon.Type.WATER, Pokemon.Format.ZU)); // Cramorant
        PokeList.add(new Pokemon(847, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Barraskewda
        PokeList.add(new Pokemon(8490001, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.RU)); // Toxtricity
        PokeList.add(new Pokemon(8510001, 8, Pokemon.Type.FIRE, Pokemon.Type.BUG, Pokemon.Format.PU)); // Centiskorch

        PokeList.add(new Pokemon(853, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Grapploct
        PokeList.add(new Pokemon(855, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Polteageist
        PokeList.add(new Pokemon(8580001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Hatterene
        PokeList.add(new Pokemon(861, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Grimmsnarl
        PokeList.add(new Pokemon(862, 8, Pokemon.Type.DARK, Pokemon.Type.NORMAL, Pokemon.Format.UU)); // Obstagoon

        PokeList.add(new Pokemon(863, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Perrserker
        PokeList.add(new Pokemon(864, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Cursola
        PokeList.add(new Pokemon(865, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.RU)); // Sirfetch'd
        PokeList.add(new Pokemon(866, 8, Pokemon.Type.ICE, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Mr. Rime
        PokeList.add(new Pokemon(867, 8, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.ZU)); // Runerigus

        PokeList.add(new Pokemon(8690001, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Alcremie
        PokeList.add(new Pokemon(870, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Falinks
        PokeList.add(new Pokemon(871, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pincurchin
        PokeList.add(new Pokemon(873, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.PU)); // Frosmoth
        PokeList.add(new Pokemon(874, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stonjourner

        PokeList.add(new Pokemon(875, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Eiscue
        PokeList.add(new Pokemon(8760001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-F
        PokeList.add(new Pokemon(8760002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-M
        PokeList.add(new Pokemon(877, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Morpeko
        PokeList.add(new Pokemon(8790001, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Copperajah

        PokeList.add(new Pokemon(880, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Dracozolt
        PokeList.add(new Pokemon(881, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.OU)); // Arctozolt
        PokeList.add(new Pokemon(882, 8, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dracovish
        PokeList.add(new Pokemon(883, 8, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.PU)); // Arctovish

        PokeList.add(new Pokemon(8840001, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Duraludon
        PokeList.add(new Pokemon(887, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Dragapult

        PokeList.add(new Pokemon(888, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.AG)); // Zacian
        PokeList.add(new Pokemon(889, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Zamazenta

        PokeList.add(new Pokemon(890, 8, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Eternatus
        PokeList.add(new Pokemon(8920001, 8, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.UBER)); // Urshifu
        PokeList.add(new Pokemon(8920002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.WATER, Pokemon.Format.UBER)); // Urshifu-Rapid-Strike
        PokeList.add(new Pokemon(893, 8, Pokemon.Type.DARK, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Zarude

        PokeList.add(new Pokemon(894, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Regieleki
        PokeList.add(new Pokemon(895, 8, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Regidrago

        PokeList.add(new Pokemon(896, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Glastrier
        PokeList.add(new Pokemon(897, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Spectrier

        PokeList.add(new Pokemon(8980001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Calyrex
        PokeList.add(new Pokemon(8980002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UBER)); // Calyrex-Ice
        PokeList.add(new Pokemon(8980003, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.AG)); // Calyrex-Shadow

        PokeList.add(new Pokemon(899, 8, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Wyrdeer
        PokeList.add(new Pokemon(900, 8, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Kleavor
        PokeList.add(new Pokemon(9010001, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.OU)); // Ursaluna
        PokeList.add(new Pokemon(9010002, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.UBER)); // Ursaluna

        PokeList.add(new Pokemon(9020001, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Basculegion
        PokeList.add(new Pokemon(9020002, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Basculegionf
        PokeList.add(new Pokemon(903, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.UBER)); // Sneasler

        PokeList.add(new Pokemon(904, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.NU)); // Overqwil
        PokeList.add(new Pokemon(9050001, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Enamorus
        PokeList.add(new Pokemon(9050002, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Enamorus-Therian
    }
    //SEGMENT: gen 9 nat Dex
    private void initGen9nat() {
        initGen8nat();
        PokeList.add(new Pokemon(908, 9, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.OU)); // Meowscarada
        PokeList.add(new Pokemon(911, 9, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Skeledirge
        PokeList.add(new Pokemon(914, 9, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Quaquaval

        PokeList.add(new Pokemon(9160001, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Oinkologne
        PokeList.add(new Pokemon(9160002, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Oinkologne-F

        PokeList.add(new Pokemon(918, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spidops
        PokeList.add(new Pokemon(920, 9, Pokemon.Type.BUG, Pokemon.Type.DARK, Pokemon.Format.UU)); // Lokix
        PokeList.add(new Pokemon(923, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FIGHTING, Pokemon.Format.PU)); // Pawmot
        PokeList.add(new Pokemon(925, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Maushold

        PokeList.add(new Pokemon(927, 9, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dachsbun
        PokeList.add(new Pokemon(930, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.ZU)); // Arboliva
        PokeList.add(new Pokemon(931, 9, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Squawkabilly
        PokeList.add(new Pokemon(934, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Garganacl

        PokeList.add(new Pokemon(936, 9, Pokemon.Type.FIRE, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Armarouge
        PokeList.add(new Pokemon(937, 9, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Ceruledge

        PokeList.add(new Pokemon(939, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Bellibolt
        PokeList.add(new Pokemon(941, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Kilowattrel
        PokeList.add(new Pokemon(943, 9, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mabosstiff
        PokeList.add(new Pokemon(945, 9, Pokemon.Type.POISON, Pokemon.Type.NORMAL, Pokemon.Format.ZU)); // Grafaiai
        PokeList.add(new Pokemon(947, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Brambleghast

        PokeList.add(new Pokemon(949, 9, Pokemon.Type.GROUND, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Toedscruel
        PokeList.add(new Pokemon(950, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Klawf
        PokeList.add(new Pokemon(952, 9, Pokemon.Type.GRASS, Pokemon.Type.FIRE, Pokemon.Format.ZU)); // Scovillain
        PokeList.add(new Pokemon(954, 9, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Rabsca
        PokeList.add(new Pokemon(956, 9, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Espathra

        PokeList.add(new Pokemon(959, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Tinkaton
        PokeList.add(new Pokemon(961, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wugtrio
        PokeList.add(new Pokemon(962, 9, Pokemon.Type.FLYING, Pokemon.Type.DARK, Pokemon.Format.PU)); // Bombirdier
        PokeList.add(new Pokemon(964, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Palafin
        PokeList.add(new Pokemon(966, 9, Pokemon.Type.STEEL, Pokemon.Type.POISON, Pokemon.Format.RU)); // Revavroom

        PokeList.add(new Pokemon(967, 9, Pokemon.Type.DRAGON, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Cyclizar
        PokeList.add(new Pokemon(968, 9, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Orthworm
        PokeList.add(new Pokemon(970, 9, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.OU)); // Glimmora
        PokeList.add(new Pokemon(972, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.PU)); // Houndstone
        PokeList.add(new Pokemon(973, 9, Pokemon.Type.FLYING, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Flamigo

        PokeList.add(new Pokemon(975, 9, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Cetitan
        PokeList.add(new Pokemon(976, 9, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Veluza
        PokeList.add(new Pokemon(977, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dondozo
        PokeList.add(new Pokemon(978, 9, Pokemon.Type.DRAGON, Pokemon.Type.WATER, Pokemon.Format.PU)); // Tatsugiri
        PokeList.add(new Pokemon(979, 9, Pokemon.Type.FIGHTING, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Annihilape

        PokeList.add(new Pokemon(980, 9, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Clodsire
        PokeList.add(new Pokemon(981, 9, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Farigiraf
        PokeList.add(new Pokemon(982, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Dudunsparce
        PokeList.add(new Pokemon(983, 9, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Kingambit

        PokeList.add(new Pokemon(984, 9, Pokemon.Type.GROUND, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Great Tusk
        PokeList.add(new Pokemon(985, 9, Pokemon.Type.FAIRY, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Scream Tail
        PokeList.add(new Pokemon(986, 9, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Brute Bonnet
        PokeList.add(new Pokemon(987, 9, Pokemon.Type.GHOST, Pokemon.Type.FAIRY, Pokemon.Format.UBER)); // Flutter Mane
        PokeList.add(new Pokemon(988, 9, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Slither Wing
        PokeList.add(new Pokemon(989, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Sandy Shocks

        PokeList.add(new Pokemon(990, 9, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Iron Treads
        PokeList.add(new Pokemon(991, 9, Pokemon.Type.ICE, Pokemon.Type.WATER, Pokemon.Format.UBER)); // Iron Bundle
        PokeList.add(new Pokemon(992, 9, Pokemon.Type.FIGHTING, Pokemon.Type.ELECTRIC, Pokemon.Format.OU)); // Iron Hands
        PokeList.add(new Pokemon(993, 9, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Iron Jugulis
        PokeList.add(new Pokemon(994, 9, Pokemon.Type.FIRE, Pokemon.Type.POISON, Pokemon.Format.OU)); // Iron Moth
        PokeList.add(new Pokemon(995, 9, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Iron Thorns

        PokeList.add(new Pokemon(998, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Baxcalibur
        PokeList.add(new Pokemon(1000, 9, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Gholdengo

        PokeList.add(new Pokemon(1001, 9, Pokemon.Type.DARK, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Wo-Chien
        PokeList.add(new Pokemon(1002, 9, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Chien-Pao
        PokeList.add(new Pokemon(1003, 9, Pokemon.Type.DARK, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Ting-Lu
        PokeList.add(new Pokemon(1004, 9, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Chi-Yu

        PokeList.add(new Pokemon(1005, 9, Pokemon.Type.DRAGON, Pokemon.Type.DARK, Pokemon.Format.OU)); // Roaring Moon
        PokeList.add(new Pokemon(1006, 9, Pokemon.Type.FAIRY, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Iron Valiant

        PokeList.add(new Pokemon(1007, 9, Pokemon.Type.FIGHTING, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Koraidon
        PokeList.add(new Pokemon(1008, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.AG)); // Miraidon

        PokeList.add(new Pokemon(1009, 9, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Walking Wake
        PokeList.add(new Pokemon(1010, 9, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Iron Leaves

        PokeList.add(new Pokemon(1011, 9, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Dipplin
        PokeList.add(new Pokemon(1013, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Sinistcha

        PokeList.add(new Pokemon(1014, 9, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Okidogi
        PokeList.add(new Pokemon(1015, 9, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Munkidori
        PokeList.add(new Pokemon(1016, 9, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Fezandipiti
        PokeList.add(new Pokemon(1017, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ogerpon

        PokeList.add(new Pokemon(1018, 9, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Archaludon

        PokeList.add(new Pokemon(1019, 9, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydrapple

        PokeList.add(new Pokemon(1020, 9, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Gouging Fire
        PokeList.add(new Pokemon(1021, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Raging Bolt
        PokeList.add(new Pokemon(1022, 9, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Iron Boulder
        PokeList.add(new Pokemon(1023, 9, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Iron Crown

        PokeList.add(new Pokemon(1024, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Terapagos
        PokeList.add(new Pokemon(1025, 9, Pokemon.Type.POISON, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Pecharunt
    }
    //TODO gen 9
    private void initGen9() {
        PokeList.add(new Pokemon(30001, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Venusaur
        PokeList.add(new Pokemon(60001, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Charizard
        PokeList.add(new Pokemon(90001, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Blastoise
        PokeList.add(new Pokemon(24, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Arbok

        PokeList.add(new Pokemon(250001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pikachu
        PokeList.add(new Pokemon(260001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Raichu
        PokeList.add(new Pokemon(260002, 7, Pokemon.Type.ELECTRIC, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Raichu-Alola

        PokeList.add(new Pokemon(280001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sandslash
        PokeList.add(new Pokemon(280002, 7, Pokemon.Type.ICE, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Sandslash-Alola
        PokeList.add(new Pokemon(36, 1, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.OU)); // Clefable

        PokeList.add(new Pokemon(380001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Ninetales
        PokeList.add(new Pokemon(380002, 7, Pokemon.Type.ICE, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Ninetales-Alola

        PokeList.add(new Pokemon(40, 1, Pokemon.Type.NORMAL, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Wigglytuff
        PokeList.add(new Pokemon(45, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.RU)); // Vileplume
        PokeList.add(new Pokemon(49, 1, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.UU)); // Venomoth

        PokeList.add(new Pokemon(510001, 1, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dugtrio
        PokeList.add(new Pokemon(530001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Persian
        PokeList.add(new Pokemon(510002, 7, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.PU)); // Dugtrio-Alola
        PokeList.add(new Pokemon(530002, 7, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Persian-Alola

        PokeList.add(new Pokemon(55, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Golduck
        PokeList.add(new Pokemon(57, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Primeape
        PokeList.add(new Pokemon(590001, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.RU)); // Arcanine

        PokeList.add(new Pokemon(62, 1, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); // Poliwrath

        PokeList.add(new Pokemon(71, 1, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.PU)); // Victreebel
        PokeList.add(new Pokemon(73, 1, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.UU)); // Tentacruel

        PokeList.add(new Pokemon(760001, 1, Pokemon.Type.ROCK, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Golem
        PokeList.add(new Pokemon(760002, 7, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Golem-Alola

        PokeList.add(new Pokemon(800001, 1, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Slowbro

        PokeList.add(new Pokemon(82, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Magneton
        PokeList.add(new Pokemon(85, 1, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Dodrio

        PokeList.add(new Pokemon(87, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Dewgong
        PokeList.add(new Pokemon(890001, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Muk
        PokeList.add(new Pokemon(890002, 7, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.UU)); // Muk-Alola
        PokeList.add(new Pokemon(91, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.RU)); // Cloyster

        PokeList.add(new Pokemon(93, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.PU)); // Haunter
        PokeList.add(new Pokemon(940001, 1, Pokemon.Type.GHOST, Pokemon.Type.POISON, Pokemon.Format.UU)); // Gengar

        PokeList.add(new Pokemon(97, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Hypno
        PokeList.add(new Pokemon(101001, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Electrode

        PokeList.add(new Pokemon(1030001, 1, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.PU)); // Exeggutor
        PokeList.add(new Pokemon(1030002, 7, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Exeggutor-Alola

        PokeList.add(new Pokemon(106, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmonlee
        PokeList.add(new Pokemon(107, 1, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.PU)); // Hitmonchan
        PokeList.add(new Pokemon(110, 1, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.NU)); // Weezing

        PokeList.add(new Pokemon(113, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Chansey

        PokeList.add(new Pokemon(123, 1, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Scyther

        PokeList.add(new Pokemon(128, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Tauros

        PokeList.add(new Pokemon(1300001, 1, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gyarados

        PokeList.add(new Pokemon(1310001, 1, Pokemon.Type.WATER, Pokemon.Type.ICE, Pokemon.Format.ZU)); // Lapras
        PokeList.add(new Pokemon(132, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ditto

        PokeList.add(new Pokemon(134, 1, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Vaporeon
        PokeList.add(new Pokemon(135, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Jolteon
        PokeList.add(new Pokemon(136, 1, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Flareon

        PokeList.add(new Pokemon(141, 1, Pokemon.Type.ROCK, Pokemon.Type.WATER, Pokemon.Format.PU)); // Kabutops
        PokeList.add(new Pokemon(1420001, 1, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Aerodactyl

        PokeList.add(new Pokemon(1430001, 1, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Snorlax

        PokeList.add(new Pokemon(144, 1, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.PU)); // Articuno
        PokeList.add(new Pokemon(145, 1, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Zapdos
        PokeList.add(new Pokemon(146, 1, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Moltres

        PokeList.add(new Pokemon(149, 1, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Dragonite

        PokeList.add(new Pokemon(1500001, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Mewtwo
        PokeList.add(new Pokemon(151, 1, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mew

        PokeList.add(new Pokemon(154, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meganium
        PokeList.add(new Pokemon(1570001, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Typhlosion
        PokeList.add(new Pokemon(160, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Feraligatr
        PokeList.add(new Pokemon(162, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Furret
        PokeList.add(new Pokemon(164, 2, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Noctowl
        
        PokeList.add(new Pokemon(168, 2, Pokemon.Type.BUG, Pokemon.Type.POISON, Pokemon.Format.ZU)); // Ariado
        PokeList.add(new Pokemon(171, 2, Pokemon.Type.WATER, Pokemon.Type.ELECTRIC, Pokemon.Format.PU)); // Lanturn

        PokeList.add(new Pokemon(1810001, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Ampharos

        PokeList.add(new Pokemon(182, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Bellossom
        PokeList.add(new Pokemon(184, 2, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Azumarill
        PokeList.add(new Pokemon(185, 2, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sudowoodo
        PokeList.add(new Pokemon(186, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Politoed

        PokeList.add(new Pokemon(189, 2, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Jumpluff
        PokeList.add(new Pokemon(192, 2, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Sunflora
        PokeList.add(new Pokemon(195, 2, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Quagsire

        PokeList.add(new Pokemon(196, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Espeon
        PokeList.add(new Pokemon(197, 2, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Umbreon
        PokeList.add(new Pokemon(1990001, 2, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Slowking
        PokeList.add(new Pokemon(200, 2, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NFE)); // Misdreavus

        PokeList.add(new Pokemon(203, 2, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Girafarig
        PokeList.add(new Pokemon(205, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.RU)); // Forretress
        PokeList.add(new Pokemon(206, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dunsparce
        PokeList.add(new Pokemon(207, 2, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Gligar

        PokeList.add(new Pokemon(210, 2, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Granbull
        PokeList.add(new Pokemon(2110001, 2, Pokemon.Type.WATER, Pokemon.Type.POISON, Pokemon.Format.PU)); // Qwilfish

        PokeList.add(new Pokemon(2120001, 2, Pokemon.Type.BUG, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Scizor

        PokeList.add(new Pokemon(2140001, 2, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Heracross

        PokeList.add(new Pokemon(2150001, 2, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.NU)); // Sneasel
        PokeList.add(new Pokemon(217, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Ursaring
        PokeList.add(new Pokemon(219, 2, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Magcargo
        PokeList.add(new Pokemon(221, 2, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Piloswine

        PokeList.add(new Pokemon(225, 2, Pokemon.Type.ICE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Delibird
        PokeList.add(new Pokemon(227, 2, Pokemon.Type.STEEL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Skarmory

        PokeList.add(new Pokemon(2290001, 2, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Houndoom

        PokeList.add(new Pokemon(230, 2, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Kingdra
        PokeList.add(new Pokemon(232, 2, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.RU)); // Donphan
        PokeList.add(new Pokemon(233, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Porygon2
        PokeList.add(new Pokemon(234, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stantler
        PokeList.add(new Pokemon(235, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Smeargle

        PokeList.add(new Pokemon(237, 2, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hitmontop
        PokeList.add(new Pokemon(242, 2, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UU)); // Blissey

        PokeList.add(new Pokemon(243, 2, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Raikou
        PokeList.add(new Pokemon(244, 2, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Entei
        PokeList.add(new Pokemon(245, 2, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Suicune

        PokeList.add(new Pokemon(2480001, 2, Pokemon.Type.ROCK, Pokemon.Type.DARK, Pokemon.Format.OU)); // Tyranitar

        PokeList.add(new Pokemon(249, 2, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Lugia
        PokeList.add(new Pokemon(250, 2, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Ho-Oh

        PokeList.add(new Pokemon(2540001, 3, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Sceptile
        PokeList.add(new Pokemon(2570001, 3, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UBER)); // Blaziken
        PokeList.add(new Pokemon(2600001, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Swampert

        PokeList.add(new Pokemon(262, 3, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mightyena
        PokeList.add(new Pokemon(272, 3, Pokemon.Type.WATER, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Ludicolo

        PokeList.add(new Pokemon(275, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.PU)); // Shiftry
        PokeList.add(new Pokemon(279, 3, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Pelipper

        PokeList.add(new Pokemon(2820001, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Gardevoir

        PokeList.add(new Pokemon(284, 3, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Masquerain

        PokeList.add(new Pokemon(286, 3, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Breloom
        PokeList.add(new Pokemon(289, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Slaking

        PokeList.add(new Pokemon(297, 3, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Hariyama

        PokeList.add(new Pokemon(3020001, 3, Pokemon.Type.DARK, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Sableye

        PokeList.add(new Pokemon(3080001, 3, Pokemon.Type.FIGHTING, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Medicham

        PokeList.add(new Pokemon(311, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Plusle
        PokeList.add(new Pokemon(312, 3, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Minun

        PokeList.add(new Pokemon(313, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Volbeat
        PokeList.add(new Pokemon(314, 3, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Illumise
        PokeList.add(new Pokemon(317, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Swalot

        PokeList.add(new Pokemon(3230001, 3, Pokemon.Type.FIRE, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Camerupt

        PokeList.add(new Pokemon(324, 3, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Torkoal
        PokeList.add(new Pokemon(326, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Grumpig

        PokeList.add(new Pokemon(330, 3, Pokemon.Type.GROUND, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Flygon
        PokeList.add(new Pokemon(332, 3, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Cacturne

        PokeList.add(new Pokemon(3340001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Altaria

        PokeList.add(new Pokemon(335, 3, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Zangoose
        PokeList.add(new Pokemon(336, 3, Pokemon.Type.POISON, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Seviper

        PokeList.add(new Pokemon(340, 3, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Whiscash
        PokeList.add(new Pokemon(342, 3, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.UU)); // Crawdaunt

        PokeList.add(new Pokemon(350, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.RU)); // Milotic

        PokeList.add(new Pokemon(3540001, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Banette
        PokeList.add(new Pokemon(356, 3, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusclops

        PokeList.add(new Pokemon(357, 3, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Tropius
        PokeList.add(new Pokemon(358, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Chimecho

        PokeList.add(new Pokemon(3620001, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glalie

        PokeList.add(new Pokemon(370, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luvdisc
        PokeList.add(new Pokemon(3730001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Salamence
        PokeList.add(new Pokemon(3760001, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Metagross

        PokeList.add(new Pokemon(377, 3, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regirock
        PokeList.add(new Pokemon(378, 3, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Regice
        PokeList.add(new Pokemon(379, 3, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Registeel

        PokeList.add(new Pokemon(3800001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Latias
        PokeList.add(new Pokemon(3810001, 3, Pokemon.Type.DRAGON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Latios

        PokeList.add(new Pokemon(3820001, 3, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Kyogre
        PokeList.add(new Pokemon(3830001, 3, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Groudon
        PokeList.add(new Pokemon(3840001, 3, Pokemon.Type.DRAGON, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Rayquaza

        PokeList.add(new Pokemon(385, 3, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Jirachi
        PokeList.add(new Pokemon(386, 3, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Deoxys

        PokeList.add(new Pokemon(389, 4, Pokemon.Type.GRASS, Pokemon.Type.GROUND, Pokemon.Format.ZU)); // Torterra
        PokeList.add(new Pokemon(392, 4, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Infernape
        PokeList.add(new Pokemon(395, 4, Pokemon.Type.WATER, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Empoleon

        PokeList.add(new Pokemon(398, 4, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Staraptor
        PokeList.add(new Pokemon(402, 4, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Kricketune
        PokeList.add(new Pokemon(405, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Luxray

        PokeList.add(new Pokemon(409, 4, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Rampardos
        PokeList.add(new Pokemon(411, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Bastiodon

        PokeList.add(new Pokemon(416, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Vespiquen

        PokeList.add(new Pokemon(417, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pachirisu
        PokeList.add(new Pokemon(419, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Floatzel
        PokeList.add(new Pokemon(423, 4, Pokemon.Type.WATER, Pokemon.Type.GROUND, Pokemon.Format.PU)); // Gastrodon
        PokeList.add(new Pokemon(424, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Ambipom

        PokeList.add(new Pokemon(426, 4, Pokemon.Type.GHOST, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Drifblim

        PokeList.add(new Pokemon(4280001, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lopunny

        PokeList.add(new Pokemon(429, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mismagius
        PokeList.add(new Pokemon(430, 4, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Honchkrow

        PokeList.add(new Pokemon(435, 4, Pokemon.Type.POISON, Pokemon.Type.DARK, Pokemon.Format.PU)); // Skuntank
        PokeList.add(new Pokemon(437, 4, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bronzong
        PokeList.add(new Pokemon(442, 4, Pokemon.Type.GHOST, Pokemon.Type.DARK, Pokemon.Format.PU)); // Spiritomb

        PokeList.add(new Pokemon(4450001, 4, Pokemon.Type.DRAGON, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Garchomp
        PokeList.add(new Pokemon(4480001, 4, Pokemon.Type.FIGHTING, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Lucario

        PokeList.add(new Pokemon(450, 4, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.UU)); // Hippowdon
        PokeList.add(new Pokemon(454, 4, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Toxicroak

        PokeList.add(new Pokemon(457, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lumineon

        PokeList.add(new Pokemon(4600001, 4, Pokemon.Type.ICE, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Abomasnow

        PokeList.add(new Pokemon(461, 4, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.OU)); // Weavile
        PokeList.add(new Pokemon(462, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Magnezone
        PokeList.add(new Pokemon(464, 4, Pokemon.Type.GROUND, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Rhyperior
        PokeList.add(new Pokemon(466, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Electivire
        PokeList.add(new Pokemon(467, 4, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Magmortar

        PokeList.add(new Pokemon(469, 4, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Yanmega
        PokeList.add(new Pokemon(470, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Leafeon
        PokeList.add(new Pokemon(471, 4, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Glaceon
        PokeList.add(new Pokemon(472, 4, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Gliscor
        PokeList.add(new Pokemon(473, 4, Pokemon.Type.ICE, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Mamoswine

        PokeList.add(new Pokemon(474, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.OU)); // Porygon-Z

        PokeList.add(new Pokemon(4750001, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Gallade
        PokeList.add(new Pokemon(4750002, 4, true, Pokemon.Type.PSYCHIC, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Gallade

        PokeList.add(new Pokemon(476, 4, Pokemon.Type.ROCK, Pokemon.Type.STEEL, Pokemon.Format.ZU)); // Probopass
        PokeList.add(new Pokemon(477, 4, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dusknoir
        PokeList.add(new Pokemon(478, 4, Pokemon.Type.ICE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Froslass

        PokeList.add(new Pokemon(4790001, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Rotom
        PokeList.add(new Pokemon(4790002, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Rotom-Fan
        PokeList.add(new Pokemon(4790003, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.ICE, Pokemon.Format.PU)); // Rotom-Frost
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Rotom-Heat
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.RU)); // Rotom-Mow
        PokeList.add(new Pokemon(4790004, 4, Pokemon.Type.ELECTRIC, Pokemon.Type.WATER, Pokemon.Format.OU)); // Rotom-Wash

        PokeList.add(new Pokemon(480, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Uxie
        PokeList.add(new Pokemon(481, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.NU)); // Mesprit
        PokeList.add(new Pokemon(482, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Azelf
        PokeList.add(new Pokemon(483, 4, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Dialga
        PokeList.add(new Pokemon(484, 4, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Palkia

        PokeList.add(new Pokemon(485, 4, Pokemon.Type.FIRE, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Heatran
        PokeList.add(new Pokemon(486, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Regigigas
        PokeList.add(new Pokemon(4870001, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina
        PokeList.add(new Pokemon(4870002, 4, Pokemon.Type.GHOST, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Giratina-Origin

        PokeList.add(new Pokemon(488, 4, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cresselia
        PokeList.add(new Pokemon(489, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Phione

        PokeList.add(new Pokemon(490, 4, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Manaphy
        PokeList.add(new Pokemon(491, 4, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Darkrai

        PokeList.add(new Pokemon(4920001, 4, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Shaymin
        PokeList.add(new Pokemon(4920002, 4, Pokemon.Type.GRASS, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Shaymin-Sky

        PokeList.add(new Pokemon(493, 4, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Arceus

        PokeList.add(new Pokemon(497, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Serperior
        PokeList.add(new Pokemon(500, 5, Pokemon.Type.FIRE, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Emboar
        PokeList.add(new Pokemon(5030001, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Samurott

        PokeList.add(new Pokemon(523, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Zebstrika

        PokeList.add(new Pokemon(530, 5, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Excadrill

        PokeList.add(new Pokemon(534, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Conkeldurr

        PokeList.add(new Pokemon(542, 5, Pokemon.Type.BUG, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Leavanny
        PokeList.add(new Pokemon(547, 5, Pokemon.Type.GRASS, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Whimsicott
        PokeList.add(new Pokemon(549, 5, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.NU)); // Lilligant
        PokeList.add(new Pokemon(550, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Basculin

        PokeList.add(new Pokemon(553, 5, Pokemon.Type.GROUND, Pokemon.Type.DARK, Pokemon.Format.UU)); // Krookodile
        PokeList.add(new Pokemon(5550001, 5, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UU)); // Darmanitan
        PokeList.add(new Pokemon(560, 5, Pokemon.Type.DARK, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Scrafty




        //TODO HERE
        PokeList.add(new Pokemon(561, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Sigilyph

        PokeList.add(new Pokemon(5710001, 5, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.UU)); // Zoroark
        PokeList.add(new Pokemon(573, 5, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Cinccino
        PokeList.add(new Pokemon(576, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gothitelle
        PokeList.add(new Pokemon(579, 5, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Reuniclus
        PokeList.add(new Pokemon(581, 5, Pokemon.Type.WATER, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Swanna

        PokeList.add(new Pokemon(586, 5, Pokemon.Type.NORMAL, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Sawsbuck
        PokeList.add(new Pokemon(591, 5, Pokemon.Type.GRASS, Pokemon.Type.POISON, Pokemon.Format.UU)); // Amoonguss

        PokeList.add(new Pokemon(594, 5, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UU)); // Alomomola
        PokeList.add(new Pokemon(596, 5, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Galvantula

        PokeList.add(new Pokemon(604, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Eelektross
        PokeList.add(new Pokemon(609, 5, Pokemon.Type.GHOST, Pokemon.Type.FIRE, Pokemon.Format.UU)); // Chandelure
        PokeList.add(new Pokemon(612, 5, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.UU)); // Haxorus
        PokeList.add(new Pokemon(614, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Beartic

        PokeList.add(new Pokemon(615, 5, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Cryogonal
        PokeList.add(new Pokemon(620, 5, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Mienshao

        PokeList.add(new Pokemon(623, 5, Pokemon.Type.GROUND, Pokemon.Type.GHOST, Pokemon.Format.PU)); // Golurk
        PokeList.add(new Pokemon(625, 5, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Bisharp
        PokeList.add(new Pokemon(6280001, 5, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Braviary
        PokeList.add(new Pokemon(630, 5, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.RU)); // Mandibuzz

        PokeList.add(new Pokemon(635, 5, Pokemon.Type.DARK, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydreigon
        PokeList.add(new Pokemon(637, 5, Pokemon.Type.BUG, Pokemon.Type.FIRE, Pokemon.Format.OU)); // Volcarona

        PokeList.add(new Pokemon(638, 5, Pokemon.Type.STEEL, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Cobalion
        PokeList.add(new Pokemon(639, 5, Pokemon.Type.ROCK, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Terrakion
        PokeList.add(new Pokemon(640, 5, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Virizion

        PokeList.add(new Pokemon(6410001, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.UU)); // Tornadus
        PokeList.add(new Pokemon(6410002, 5, Pokemon.Type.FLYING, Pokemon.Type.NONE, Pokemon.Format.OU)); // Tornadus-Therian
        PokeList.add(new Pokemon(6420001, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus
        PokeList.add(new Pokemon(6420002, 5, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Thundurus-Therian

        PokeList.add(new Pokemon(643, 5, Pokemon.Type.DRAGON, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Reshiram
        PokeList.add(new Pokemon(644, 5, Pokemon.Type.DRAGON, Pokemon.Type.ELECTRIC, Pokemon.Format.UBER)); // Zekrom

        PokeList.add(new Pokemon(6450001, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.UBER)); // Landorus
        PokeList.add(new Pokemon(6450002, 5, Pokemon.Type.GROUND, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Landorus-Therian

        PokeList.add(new Pokemon(6460001, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UU)); // Kyurem
        PokeList.add(new Pokemon(6460002, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Kyurem-White
        PokeList.add(new Pokemon(6460003, 5, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.OU)); // Kyurem-Black

        PokeList.add(new Pokemon(647, 5, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Keldeo

        PokeList.add(new Pokemon(6480001, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta
        PokeList.add(new Pokemon(6480002, 5, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Meloetta-Piroutte

        PokeList.add(new Pokemon(652, 6, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Chesnaught
        PokeList.add(new Pokemon(655, 6, Pokemon.Type.FIRE, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Delphox
        PokeList.add(new Pokemon(658, 6, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); // Greninja

        PokeList.add(new Pokemon(663, 6, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Talonflame
        PokeList.add(new Pokemon(666, 6, Pokemon.Type.BUG, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Vivillon
        PokeList.add(new Pokemon(668, 6, Pokemon.Type.FIRE, Pokemon.Type.NORMAL, Pokemon.Format.NU)); // Pyroar
        PokeList.add(new Pokemon(671, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.RU)); // Florges

        PokeList.add(new Pokemon(673, 6, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gogoat
        PokeList.add(new Pokemon(678, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Meowstic

        PokeList.add(new Pokemon(687, 6, Pokemon.Type.DARK, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Malamar
        PokeList.add(new Pokemon(691, 6, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Dragalge

        PokeList.add(new Pokemon(693, 6, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Clawitzer
        PokeList.add(new Pokemon(700, 6, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.UU)); // Sylveon

        PokeList.add(new Pokemon(701, 6, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Hawlucha
        PokeList.add(new Pokemon(702, 6, Pokemon.Type.ELECTRIC, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Dedenne
        PokeList.add(new Pokemon(703, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.ZU)); // Carbink
        PokeList.add(new Pokemon(7060001, 6, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Goodra
        PokeList.add(new Pokemon(707, 6, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Klefki

        PokeList.add(new Pokemon(709, 6, Pokemon.Type.GHOST, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Trevenant
        PokeList.add(new Pokemon(7130001, 6, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Avalugg
        PokeList.add(new Pokemon(715, 6, Pokemon.Type.FLYING, Pokemon.Type.DRAGON, Pokemon.Format.RU)); // Noivern

        PokeList.add(new Pokemon(7190001, 6, Pokemon.Type.ROCK, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Diancie

        PokeList.add(new Pokemon(7200001, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Hoopa
        PokeList.add(new Pokemon(7200002, 6, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Hoopa-Unbound
        PokeList.add(new Pokemon(721, 6, Pokemon.Type.FIRE, Pokemon.Type.WATER, Pokemon.Format.UU)); // Volcanion

        PokeList.add(new Pokemon(7240001, 7, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Decidueye
        PokeList.add(new Pokemon(727, 7, Pokemon.Type.FIRE, Pokemon.Type.DARK, Pokemon.Format.NU)); // Incineroar
        PokeList.add(new Pokemon(730, 7, Pokemon.Type.WATER, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Primarina

        PokeList.add(new Pokemon(733, 7, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Toucannon
        PokeList.add(new Pokemon(735, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Gumshoos
        PokeList.add(new Pokemon(738, 7, Pokemon.Type.BUG, Pokemon.Type.ELECTRIC, Pokemon.Format.NU)); // Vikavolt
        PokeList.add(new Pokemon(740, 7, Pokemon.Type.FIGHTING, Pokemon.Type.ICE, Pokemon.Format.PU)); // Crabominable
        PokeList.add(new Pokemon(741, 7, Pokemon.Type.FIRE, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Oricorio

        PokeList.add(new Pokemon(743, 7, Pokemon.Type.BUG, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Ribombee

        PokeList.add(new Pokemon(7450001, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lycanroc
        PokeList.add(new Pokemon(7450002, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.RU)); // Lycanroc-Dusk
        PokeList.add(new Pokemon(7450003, 7, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Lycanroc-Midnight

        PokeList.add(new Pokemon(748, 7, Pokemon.Type.POISON, Pokemon.Type.WATER, Pokemon.Format.OU)); // Toxapex
        PokeList.add(new Pokemon(750, 7, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Mudsdale

        PokeList.add(new Pokemon(752, 7, Pokemon.Type.WATER, Pokemon.Type.BUG, Pokemon.Format.RU)); // Araquanid
        PokeList.add(new Pokemon(754, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.PU)); // Lurantis
        PokeList.add(new Pokemon(758, 7, Pokemon.Type.POISON, Pokemon.Type.FIRE, Pokemon.Format.RU)); // Salazzle

        PokeList.add(new Pokemon(763, 7, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.RU)); // Tsareena
        PokeList.add(new Pokemon(764, 7, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.NU)); // Comfey
        PokeList.add(new Pokemon(765, 7, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Oranguru
        PokeList.add(new Pokemon(766, 7, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.NU)); // Passimian

        PokeList.add(new Pokemon(770, 7, Pokemon.Type.GHOST, Pokemon.Type.GROUND, Pokemon.Format.NU)); // Palossand

        PokeList.add(new Pokemon(774, 7, Pokemon.Type.ROCK, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Minior
        PokeList.add(new Pokemon(775, 7, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Komala
        PokeList.add(new Pokemon(778, 7, Pokemon.Type.GHOST, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Mimikyu

        PokeList.add(new Pokemon(779, 7, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Bruxish
        PokeList.add(new Pokemon(784, 7, Pokemon.Type.DRAGON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Kommo-o

        PokeList.add(new Pokemon(791, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Solgaleo
        PokeList.add(new Pokemon(792, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Lunala

        PokeList.add(new Pokemon(8000001, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.RU)); // Necrozma
        PokeList.add(new Pokemon(8000002, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Necrozma-Dusk
        PokeList.add(new Pokemon(8000003, 7, Pokemon.Type.PSYCHIC, Pokemon.Type.STEEL, Pokemon.Format.UBER)); // Necrozma-Dawn

        PokeList.add(new Pokemon(801, 7, Pokemon.Type.STEEL, Pokemon.Type.FAIRY, Pokemon.Format.OU)); // Magearna

        PokeList.add(new Pokemon(590002, 8, Pokemon.Type.FIRE, Pokemon.Type.ROCK, Pokemon.Format.UU)); //Arcanine
        PokeList.add(new Pokemon(770002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); //Rapidash
        PokeList.add(new Pokemon(800002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); //Slowbro
        PokeList.add(new Pokemon(1010002, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.GRASS, Pokemon.Format.PU)); //Electrode
        PokeList.add(new Pokemon(1100002, 8, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.RU)); //Weezing

        PokeList.add(new Pokemon(1440002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Articuno
        PokeList.add(new Pokemon(1450002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.FLYING, Pokemon.Format.RU)); //Zapdos
        PokeList.add(new Pokemon(1460002, 8, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.OU)); //Moltres

        PokeList.add(new Pokemon(1570002, 8, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.NU)); //Typhlosion
        PokeList.add(new Pokemon(1990002, 8, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); //Slowking
        PokeList.add(new Pokemon(5030002, 8, Pokemon.Type.WATER, Pokemon.Type.DARK, Pokemon.Format.OU)); //Samurott
        PokeList.add(new Pokemon(5490002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); //Lilligant

        PokeList.add(new Pokemon(5710002, 8, Pokemon.Type.NORMAL, Pokemon.Type.GHOST, Pokemon.Format.RU)); //Zoroark
        PokeList.add(new Pokemon(6280002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FLYING, Pokemon.Format.PU)); //Braviary
        PokeList.add(new Pokemon(7060002, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.RU)); //Goodra

        PokeList.add(new Pokemon(7130002, 8, Pokemon.Type.ICE, Pokemon.Type.ROCK, Pokemon.Format.ZU)); //Avalugg
        PokeList.add(new Pokemon(7240002, 8, Pokemon.Type.GRASS, Pokemon.Type.FIGHTING, Pokemon.Format.ZU)); //Rapidash

        PokeList.add(new Pokemon(8120001, 8, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.OU)); // Rillaboom
        PokeList.add(new Pokemon(8150001, 8, Pokemon.Type.FIRE, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Cinderace
        PokeList.add(new Pokemon(8180001, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.NU)); // Inteleon

        PokeList.add(new Pokemon(820, 8, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Greedent
        PokeList.add(new Pokemon(8230001, 8, Pokemon.Type.FLYING, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Corviknight

        PokeList.add(new Pokemon(8340001, 8, Pokemon.Type.WATER, Pokemon.Type.ROCK, Pokemon.Format.ZU)); // Drednaw
        PokeList.add(new Pokemon(8390001, 8, Pokemon.Type.ROCK, Pokemon.Type.FIRE, Pokemon.Format.ZU)); // Coalossal

        PokeList.add(new Pokemon(8410001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Flapple
        PokeList.add(new Pokemon(8420001, 8, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Appletun

        PokeList.add(new Pokemon(8440001, 8, Pokemon.Type.GROUND, Pokemon.Type.NONE, Pokemon.Format.PU)); // Sandaconda
        PokeList.add(new Pokemon(845, 8, Pokemon.Type.FLYING, Pokemon.Type.WATER, Pokemon.Format.ZU)); // Cramorant
        PokeList.add(new Pokemon(847, 8, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Barraskewda
        PokeList.add(new Pokemon(8490001, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.POISON, Pokemon.Format.RU)); // Toxtricity

        PokeList.add(new Pokemon(855, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.RU)); // Polteageist
        PokeList.add(new Pokemon(8580001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.FAIRY, Pokemon.Format.UU)); // Hatterene
        PokeList.add(new Pokemon(861, 8, Pokemon.Type.DARK, Pokemon.Type.FAIRY, Pokemon.Format.NU)); // Grimmsnarl

        PokeList.add(new Pokemon(863, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Perrserker

        PokeList.add(new Pokemon(8690001, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Alcremie
        PokeList.add(new Pokemon(870, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Falinks
        PokeList.add(new Pokemon(871, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Pincurchin
        PokeList.add(new Pokemon(873, 8, Pokemon.Type.ICE, Pokemon.Type.BUG, Pokemon.Format.PU)); // Frosmoth
        PokeList.add(new Pokemon(874, 8, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Stonjourner

        PokeList.add(new Pokemon(875, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Eiscue
        PokeList.add(new Pokemon(8760001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-F
        PokeList.add(new Pokemon(8760002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Indeedee-M
        PokeList.add(new Pokemon(877, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Morpeko
        PokeList.add(new Pokemon(8790001, 8, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.NU)); // Copperajah

        PokeList.add(new Pokemon(8840001, 8, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.NU)); // Duraludon
        PokeList.add(new Pokemon(887, 8, Pokemon.Type.DRAGON, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Dragapult

        PokeList.add(new Pokemon(888, 8, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.AG)); // Zacian
        PokeList.add(new Pokemon(889, 8, Pokemon.Type.FIGHTING, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Zamazenta

        PokeList.add(new Pokemon(890, 8, Pokemon.Type.POISON, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Eternatus
        PokeList.add(new Pokemon(8920001, 8, Pokemon.Type.FIGHTING, Pokemon.Type.DARK, Pokemon.Format.UBER)); // Urshifu
        PokeList.add(new Pokemon(8920002, 8, Pokemon.Type.FIGHTING, Pokemon.Type.WATER, Pokemon.Format.UBER)); // Urshifu-Rapid-Strike
        PokeList.add(new Pokemon(893, 8, Pokemon.Type.DARK, Pokemon.Type.GRASS, Pokemon.Format.UU)); // Zarude

        PokeList.add(new Pokemon(894, 8, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.UU)); // Regieleki
        PokeList.add(new Pokemon(895, 8, Pokemon.Type.DRAGON, Pokemon.Type.NONE, Pokemon.Format.RU)); // Regidrago

        PokeList.add(new Pokemon(896, 8, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.PU)); // Glastrier
        PokeList.add(new Pokemon(897, 8, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Spectrier

        PokeList.add(new Pokemon(8980001, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Calyrex
        PokeList.add(new Pokemon(8980002, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.UBER)); // Calyrex-Ice
        PokeList.add(new Pokemon(8980003, 8, Pokemon.Type.PSYCHIC, Pokemon.Type.GRASS, Pokemon.Format.AG)); // Calyrex-Shadow

        PokeList.add(new Pokemon(899, 8, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Wyrdeer
        PokeList.add(new Pokemon(900, 8, Pokemon.Type.BUG, Pokemon.Type.ROCK, Pokemon.Format.RU)); // Kleavor
        PokeList.add(new Pokemon(9010001, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.OU)); // Ursaluna
        PokeList.add(new Pokemon(9010002, 8, Pokemon.Type.GROUND, Pokemon.Type.NORMAL, Pokemon.Format.UBER)); // Ursaluna

        PokeList.add(new Pokemon(9020001, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Basculegion
        PokeList.add(new Pokemon(9020002, 8, Pokemon.Type.WATER, Pokemon.Type.GHOST, Pokemon.Format.RU)); // Basculegionf
        PokeList.add(new Pokemon(903, 8, Pokemon.Type.FIGHTING, Pokemon.Type.POISON, Pokemon.Format.UBER)); // Sneasler

        PokeList.add(new Pokemon(904, 8, Pokemon.Type.DARK, Pokemon.Type.POISON, Pokemon.Format.NU)); // Overqwil
        PokeList.add(new Pokemon(9050001, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.OU)); // Enamorus
        PokeList.add(new Pokemon(9050002, 8, Pokemon.Type.FAIRY, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Enamorus-Therian


        PokeList.add(new Pokemon(908, 9, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.OU)); // Meowscarada
        PokeList.add(new Pokemon(911, 9, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Skeledirge
        PokeList.add(new Pokemon(914, 9, Pokemon.Type.WATER, Pokemon.Type.FIGHTING, Pokemon.Format.UU)); // Quaquaval

        PokeList.add(new Pokemon(9160001, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Oinkologne
        PokeList.add(new Pokemon(9160002, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Oinkologne-F

        PokeList.add(new Pokemon(918, 9, Pokemon.Type.BUG, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Spidops
        PokeList.add(new Pokemon(920, 9, Pokemon.Type.BUG, Pokemon.Type.DARK, Pokemon.Format.UU)); // Lokix
        PokeList.add(new Pokemon(923, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FIGHTING, Pokemon.Format.PU)); // Pawmot
        PokeList.add(new Pokemon(925, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.RU)); // Maushold

        PokeList.add(new Pokemon(927, 9, Pokemon.Type.FAIRY, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Dachsbun
        PokeList.add(new Pokemon(930, 9, Pokemon.Type.GRASS, Pokemon.Type.NORMAL, Pokemon.Format.ZU)); // Arboliva
        PokeList.add(new Pokemon(931, 9, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.Format.ZU)); // Squawkabilly
        PokeList.add(new Pokemon(934, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.OU)); // Garganacl

        PokeList.add(new Pokemon(936, 9, Pokemon.Type.FIRE, Pokemon.Type.PSYCHIC, Pokemon.Format.RU)); // Armarouge
        PokeList.add(new Pokemon(937, 9, Pokemon.Type.FIRE, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Ceruledge

        PokeList.add(new Pokemon(939, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.NONE, Pokemon.Format.PU)); // Bellibolt
        PokeList.add(new Pokemon(941, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.FLYING, Pokemon.Format.NU)); // Kilowattrel
        PokeList.add(new Pokemon(943, 9, Pokemon.Type.DARK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Mabosstiff
        PokeList.add(new Pokemon(945, 9, Pokemon.Type.POISON, Pokemon.Type.NORMAL, Pokemon.Format.ZU)); // Grafaiai
        PokeList.add(new Pokemon(947, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.NU)); // Brambleghast

        PokeList.add(new Pokemon(949, 9, Pokemon.Type.GROUND, Pokemon.Type.GRASS, Pokemon.Format.ZU)); // Toedscruel
        PokeList.add(new Pokemon(950, 9, Pokemon.Type.ROCK, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Klawf
        PokeList.add(new Pokemon(952, 9, Pokemon.Type.GRASS, Pokemon.Type.FIRE, Pokemon.Format.ZU)); // Scovillain
        PokeList.add(new Pokemon(954, 9, Pokemon.Type.BUG, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Rabsca
        PokeList.add(new Pokemon(956, 9, Pokemon.Type.PSYCHIC, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Espathra

        PokeList.add(new Pokemon(959, 9, Pokemon.Type.FAIRY, Pokemon.Type.STEEL, Pokemon.Format.UU)); // Tinkaton
        PokeList.add(new Pokemon(961, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Wugtrio
        PokeList.add(new Pokemon(962, 9, Pokemon.Type.FLYING, Pokemon.Type.DARK, Pokemon.Format.PU)); // Bombirdier
        PokeList.add(new Pokemon(964, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Palafin
        PokeList.add(new Pokemon(966, 9, Pokemon.Type.STEEL, Pokemon.Type.POISON, Pokemon.Format.RU)); // Revavroom

        PokeList.add(new Pokemon(967, 9, Pokemon.Type.DRAGON, Pokemon.Type.NORMAL, Pokemon.Format.RU)); // Cyclizar
        PokeList.add(new Pokemon(968, 9, Pokemon.Type.STEEL, Pokemon.Type.NONE, Pokemon.Format.ZU)); // Orthworm
        PokeList.add(new Pokemon(970, 9, Pokemon.Type.ROCK, Pokemon.Type.POISON, Pokemon.Format.OU)); // Glimmora
        PokeList.add(new Pokemon(972, 9, Pokemon.Type.GHOST, Pokemon.Type.NONE, Pokemon.Format.PU)); // Houndstone
        PokeList.add(new Pokemon(973, 9, Pokemon.Type.FLYING, Pokemon.Type.FIGHTING, Pokemon.Format.NU)); // Flamigo

        PokeList.add(new Pokemon(975, 9, Pokemon.Type.ICE, Pokemon.Type.NONE, Pokemon.Format.NU)); // Cetitan
        PokeList.add(new Pokemon(976, 9, Pokemon.Type.WATER, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Veluza
        PokeList.add(new Pokemon(977, 9, Pokemon.Type.WATER, Pokemon.Type.NONE, Pokemon.Format.OU)); // Dondozo
        PokeList.add(new Pokemon(978, 9, Pokemon.Type.DRAGON, Pokemon.Type.WATER, Pokemon.Format.PU)); // Tatsugiri
        PokeList.add(new Pokemon(979, 9, Pokemon.Type.FIGHTING, Pokemon.Type.GHOST, Pokemon.Format.UBER)); // Annihilape

        PokeList.add(new Pokemon(980, 9, Pokemon.Type.POISON, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Clodsire
        PokeList.add(new Pokemon(981, 9, Pokemon.Type.NORMAL, Pokemon.Type.PSYCHIC, Pokemon.Format.ZU)); // Farigiraf
        PokeList.add(new Pokemon(982, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.PU)); // Dudunsparce
        PokeList.add(new Pokemon(983, 9, Pokemon.Type.DARK, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Kingambit

        PokeList.add(new Pokemon(984, 9, Pokemon.Type.GROUND, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Great Tusk
        PokeList.add(new Pokemon(985, 9, Pokemon.Type.FAIRY, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Scream Tail
        PokeList.add(new Pokemon(986, 9, Pokemon.Type.GRASS, Pokemon.Type.DARK, Pokemon.Format.ZU)); // Brute Bonnet
        PokeList.add(new Pokemon(987, 9, Pokemon.Type.GHOST, Pokemon.Type.FAIRY, Pokemon.Format.UBER)); // Flutter Mane
        PokeList.add(new Pokemon(988, 9, Pokemon.Type.BUG, Pokemon.Type.FIGHTING, Pokemon.Format.RU)); // Slither Wing
        PokeList.add(new Pokemon(989, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.GROUND, Pokemon.Format.UU)); // Sandy Shocks

        PokeList.add(new Pokemon(990, 9, Pokemon.Type.GROUND, Pokemon.Type.STEEL, Pokemon.Format.OU)); // Iron Treads
        PokeList.add(new Pokemon(991, 9, Pokemon.Type.ICE, Pokemon.Type.WATER, Pokemon.Format.UBER)); // Iron Bundle
        PokeList.add(new Pokemon(992, 9, Pokemon.Type.FIGHTING, Pokemon.Type.ELECTRIC, Pokemon.Format.OU)); // Iron Hands
        PokeList.add(new Pokemon(993, 9, Pokemon.Type.DARK, Pokemon.Type.FLYING, Pokemon.Format.UU)); // Iron Jugulis
        PokeList.add(new Pokemon(994, 9, Pokemon.Type.FIRE, Pokemon.Type.POISON, Pokemon.Format.OU)); // Iron Moth
        PokeList.add(new Pokemon(995, 9, Pokemon.Type.ROCK, Pokemon.Type.ELECTRIC, Pokemon.Format.RU)); // Iron Thorns

        PokeList.add(new Pokemon(998, 9, Pokemon.Type.DRAGON, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Baxcalibur
        PokeList.add(new Pokemon(1000, 9, Pokemon.Type.STEEL, Pokemon.Type.GHOST, Pokemon.Format.OU)); // Gholdengo

        PokeList.add(new Pokemon(1001, 9, Pokemon.Type.DARK, Pokemon.Type.GRASS, Pokemon.Format.PU)); // Wo-Chien
        PokeList.add(new Pokemon(1002, 9, Pokemon.Type.DARK, Pokemon.Type.ICE, Pokemon.Format.UBER)); // Chien-Pao
        PokeList.add(new Pokemon(1003, 9, Pokemon.Type.DARK, Pokemon.Type.GROUND, Pokemon.Format.OU)); // Ting-Lu
        PokeList.add(new Pokemon(1004, 9, Pokemon.Type.DARK, Pokemon.Type.FIRE, Pokemon.Format.UBER)); // Chi-Yu

        PokeList.add(new Pokemon(1005, 9, Pokemon.Type.DRAGON, Pokemon.Type.DARK, Pokemon.Format.OU)); // Roaring Moon
        PokeList.add(new Pokemon(1006, 9, Pokemon.Type.FAIRY, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Iron Valiant

        PokeList.add(new Pokemon(1007, 9, Pokemon.Type.FIGHTING, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Koraidon
        PokeList.add(new Pokemon(1008, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.AG)); // Miraidon

        PokeList.add(new Pokemon(1009, 9, Pokemon.Type.WATER, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Walking Wake
        PokeList.add(new Pokemon(1010, 9, Pokemon.Type.GRASS, Pokemon.Type.PSYCHIC, Pokemon.Format.UU)); // Iron Leaves

        PokeList.add(new Pokemon(1011, 9, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.ZU)); // Dipplin
        PokeList.add(new Pokemon(1013, 9, Pokemon.Type.GRASS, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Sinistcha

        PokeList.add(new Pokemon(1014, 9, Pokemon.Type.POISON, Pokemon.Type.FIGHTING, Pokemon.Format.OU)); // Okidogi
        PokeList.add(new Pokemon(1015, 9, Pokemon.Type.POISON, Pokemon.Type.PSYCHIC, Pokemon.Format.NU)); // Munkidori
        PokeList.add(new Pokemon(1016, 9, Pokemon.Type.POISON, Pokemon.Type.FAIRY, Pokemon.Format.RU)); // Fezandipiti
        PokeList.add(new Pokemon(1017, 9, Pokemon.Type.GRASS, Pokemon.Type.NONE, Pokemon.Format.UU)); // Ogerpon

        PokeList.add(new Pokemon(1018, 9, Pokemon.Type.STEEL, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Archaludon

        PokeList.add(new Pokemon(1019, 9, Pokemon.Type.GRASS, Pokemon.Type.DRAGON, Pokemon.Format.UU)); // Hydrapple

        PokeList.add(new Pokemon(1020, 9, Pokemon.Type.FIRE, Pokemon.Type.DRAGON, Pokemon.Format.UBER)); // Gouging Fire
        PokeList.add(new Pokemon(1021, 9, Pokemon.Type.ELECTRIC, Pokemon.Type.DRAGON, Pokemon.Format.OU)); // Raging Bolt
        PokeList.add(new Pokemon(1022, 9, Pokemon.Type.ROCK, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Iron Boulder
        PokeList.add(new Pokemon(1023, 9, Pokemon.Type.STEEL, Pokemon.Type.PSYCHIC, Pokemon.Format.OU)); // Iron Crown

        PokeList.add(new Pokemon(1024, 9, Pokemon.Type.NORMAL, Pokemon.Type.NONE, Pokemon.Format.UBER)); // Terapagos
        PokeList.add(new Pokemon(1025, 9, Pokemon.Type.POISON, Pokemon.Type.GHOST, Pokemon.Format.UU)); // Pecharunt

    }
}
