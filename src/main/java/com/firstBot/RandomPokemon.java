package com.firstBot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomPokemon {
    private final ArrayList<Integer> team;
    private PokemonList pokemonList;
    private int genNum;

    private VIPList vipList;

    public RandomPokemon(String gen, String format) {
        team = new ArrayList<>();

        getGenNum(gen);
        generateRandomTeam(format);

        Collections.shuffle(team);
    }

    public RandomPokemon(String gen, String format, String UID) {
        team = new ArrayList<>();

        getGenNum(gen);
        generateRandomTeam(format);

        vipList = new VIPList();
        vipList.initialize();
        getSpecialDex(UID, format, genNum);

        Collections.shuffle(team);
    }

    public void getGenNum(String gen) {
        switch(gen) {
            case "gen1" -> genNum = 1;
            case "gen2" -> genNum = 2;
            case "gen3" -> genNum = 3;
            case "gen4" -> genNum = 4;
            case "gen5" -> genNum = 5;
            case "gen6" -> genNum = 6;
            case "gen7" -> genNum = 7;
            case "gen8" -> genNum = 8;
            case "gen9" -> genNum = 9;
            case "gen8nat" -> genNum = 8001;
            case "gen9nat" -> genNum = 9001;
        }
    }

    public void generateRandomTeam(String format) {

        pokemonList = new PokemonList(genNum);

        List<Pokemon> GMAXList = new ArrayList<>();

        List<Pokemon> AGList = new ArrayList<>();
        List<Pokemon> UberList = new ArrayList<>();
        List<Pokemon> OUList = new ArrayList<>();
        List<Pokemon> UUList = new ArrayList<>();

        List<Pokemon> RUList = new ArrayList<>();
        List<Pokemon> NUList = new ArrayList<>();
        List<Pokemon> PUList = new ArrayList<>();
        List<Pokemon> ZUList = new ArrayList<>();

        List<Pokemon> NFEList = new ArrayList<>();
        List<Pokemon> LCList = new ArrayList<>();

        for(Pokemon pokemon : pokemonList) {
            if(pokemon.getFormat() == Pokemon.Format.GMAX)
                GMAXList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.AG)
                AGList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.UBER)
                UberList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.OU)
                OUList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.UU)
                UUList.add(pokemon);

            else if(pokemon.getFormat() == Pokemon.Format.RU)
                RUList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.NU)
                NUList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.PU)
                PUList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.ZU)
                ZUList.add(pokemon);

            else if(pokemon.getFormat() == Pokemon.Format.NFE)
                NFEList.add(pokemon);
            else if(pokemon.getFormat() == Pokemon.Format.LC)
                LCList.add(pokemon);
        }
        ArrayList<Pokemon> filteredList = new ArrayList<>();

        switch(format) {
            case "AG" -> {
                if(genNum == 8001 || genNum == 9001)
                    filteredList = GMAXNatfilterList(GMAXList, AGList, UberList, OUList);
                else if(genNum == 8)
                    filteredList = GMAXfilterList(GMAXList, AGList, UberList, OUList);
                else
                    filteredList = AGfilterList(AGList, UberList, OUList, genNum);
            }
            case "UBER" -> filteredList = filterList(UberList, OUList, genNum);
            case "OU" -> filteredList = filterList(OUList, UUList, genNum);
            case "UU" -> filteredList = filterList(UUList, RUList, genNum);
            case "RU" -> filteredList = LowFormatfilterList(RUList, NUList, genNum);
            case "NU" -> filteredList = LowFormatfilterList(NUList, PUList, genNum);
            case "PU" -> filteredList = LowFormatfilterList(PUList, ZUList, genNum);
            case "ZU" -> filteredList = LowFormatfilterList(ZUList, NFEList, genNum);
            case "NFE" -> filteredList = LowFormatfilterList(NFEList, LCList, genNum);
            case "LC" -> filteredList = LowFormatfilterList(LCList, LCList, genNum);
        }
        for(int i = 0 ; i < 6 ; i ++)
            team.add(filteredList.get(i).getDex());
        //System.out.println(team.toString());
    }

    //TODO: implement an actual solution instead of this hack.
    private void getSpecialDex(String UID, String format, int gen) {
        if(vipList.containsUID(UID) && (format.equals("OU") || format.equals("UBER")) && (gen == 9 || gen == 9001)) {
            Boolean metRequirement = false;
            for (int i = 0; i < team.size(); i++) {
                if(team.get(i) == 908) {
                    team.set(i, 908010);
                    metRequirement = true;
                    break;
                }
            }
            if (!metRequirement && new Random().nextInt(3) == 0) {
                team.set(3, 908010);
            }
        }
    }

    public ArrayList<Pokemon> filterList(List<Pokemon> formatList, List<Pokemon> formatBelowList, int gen) {
        ArrayList<Pokemon> result = new ArrayList<>();
        if (gen == 1 || gen == 2) {
            selectRandomPokemon(result, formatList, 2);
            selectRandomPokemon(result, formatBelowList, 4);
        } else if (gen >= 3 && gen <= 5) {
            selectRandomPokemon(result, formatList, 3);
            selectConditionalPokemon(result, formatList, formatBelowList, 3, 8);
        } else if (gen >= 6) {
            selectRandomPokemon(result, formatList, 3);
            selectConditionalPokemon(result, formatList, formatBelowList, 2, 20);
            selectMegaPokemon(result, formatList, formatBelowList);
        }
        return result;
    }

    public ArrayList<Pokemon> LowFormatfilterList(List<Pokemon> formatList, List<Pokemon> formatBelowList, int gen) {
        ArrayList<Pokemon> result = new ArrayList<>();
        if (gen == 1 || gen == 2) {
            selectRandomPokemon(result, formatList, 2);
            selectRandomPokemon(result, formatBelowList, 4);
        } else if (gen >= 3 && gen <= 5) {
            selectRandomPokemon(result, formatList, 3);
            selectConditionalPokemon(result, formatList, formatBelowList, 3, 8);
        } else if (gen >= 6) {
            selectRandomPokemon(result, formatList, 3);
            selectConditionalPokemon(result, formatList, formatBelowList, 3, 20);
        }
        return result;
    }

    public ArrayList<Pokemon> AGfilterList(List<Pokemon> formatList, List<Pokemon> formatBelowList, List<Pokemon> formatBelowList2, int gen) {
        ArrayList<Pokemon> result = new ArrayList<>();
        if (gen == 1) {
            selectRandomPokemon(result, formatBelowList, 2);
            selectRandomPokemon(result, formatBelowList2, 4);
        } else if (gen >= 2 && gen <= 5) {
            selectRandomPokemon(result, formatBelowList, 4);
            selectRandomPokemon(result, formatBelowList2, 2);
        } else if (gen == 6 || gen == 7) {
            selectRandomPokemon(result, formatBelowList, 3);
            selectRandomPokemon(result, formatBelowList2, 2);
            selectMegaPokemon(result, formatList, formatBelowList);
        } else if (gen == 9) {
            selectRandomPokemon(result, formatList, 1);
            selectRandomPokemon(result, formatBelowList, 4);
            selectRandomPokemon(result, formatBelowList2, 1);
        }
        return result;
    }

    public ArrayList<Pokemon> GMAXfilterList(List<Pokemon> gmaxList, List<Pokemon> agList, List<Pokemon> uberList, List<Pokemon> ouList) {
        ArrayList<Pokemon> result = new ArrayList<>();
        selectRandomPokemon(result, gmaxList, 1);
        selectRandomPokemon(result, agList, 1);
        selectRandomPokemon(result, uberList, 3);
        selectRandomPokemon(result, ouList, 1);
        return result;
    }

    public ArrayList<Pokemon> GMAXNatfilterList(List<Pokemon> gmaxList, List<Pokemon> agList, List<Pokemon> uberList, List<Pokemon> ouList) {
        ArrayList<Pokemon> result = new ArrayList<>();
        selectRandomPokemon(result, gmaxList, 1);
        selectRandomPokemon(result, agList, 1);
        selectRandomPokemon(result, uberList, 3);
        selectMegaPokemon(result, uberList, ouList);
        return result;
    }

    private void selectRandomPokemon(List<Pokemon> result, List<Pokemon> list, int count) {
        for (int i = 0; i < count; i++) {
            if (list.isEmpty()) break;
            Pokemon randomPoke = removeRandomPokemon(list);
            if (!checkDuplicate(result, randomPoke) && !randomPoke.IsMega()) {
                result.add(randomPoke);
            } else {
                i--;
            }
        }
    }

    private void selectConditionalPokemon(List<Pokemon> result, List<Pokemon> primaryList, List<Pokemon> secondaryList, int count, int chance) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            List<Pokemon> selectedList = (random.nextInt(chance) == 0) ? primaryList : secondaryList;
            if (selectedList.isEmpty()) continue;
            Pokemon randomPoke = removeRandomPokemon(selectedList);
            if (!checkDuplicate(result, randomPoke) && !randomPoke.IsMega()) {
                result.add(randomPoke);
            } else {
                i--;
            }
        }
    }

    private Pokemon removeRandomPokemon(List<Pokemon> list) {
        return list.remove(new Random().nextInt(list.size()));
    }

    private void selectMegaPokemon(List<Pokemon> result, List<Pokemon> primaryList, List<Pokemon> secondaryList) {
        Collections.shuffle(primaryList);
        for (Pokemon pokemon : primaryList) {
            if (pokemon.IsMega() && !result.contains(pokemon)) {
                result.add(pokemon);
                return;
            }
        }
        Collections.shuffle(secondaryList);
        for (Pokemon pokemon : secondaryList) {
            if (pokemon.IsMega() && !result.contains(pokemon)) {
                result.add(pokemon);
                return;
            }
        }
    }

    private boolean checkDuplicate(List<Pokemon> dexList, Pokemon pokemon) {
        if (dexList.isEmpty()) return false;
        for (Pokemon pokemonCurrent : dexList) {
            if (pokemonCurrent.getDex() > 10000 || pokemon.getDex() > 10000) {
                if (Math.abs(pokemonCurrent.getDex() - pokemon.getDex()) <= 5) {
                    return true;
                }
            }
            if (pokemonCurrent.getDex() == pokemon.getDex()) {
                dexList.remove(pokemon);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getTeam() {
        ArrayList<String> pokemonEmojis;
        pokemonEmojis = getEmoji(team);
        return pokemonEmojis;
    }

    private ArrayList<String> getEmoji (ArrayList<Integer> dex) {

        ArrayList<String> emojiList = new ArrayList<>();
        String emojiID = null;

        for(Integer currentDex : dex) {
            switch(currentDex) {
                //gen 1:
                case 1 -> emojiID = "<:bulbasaur:1312345446999527444>";
                case 2 -> emojiID = "<:ivysaur:1312349855934578709>";

                case 30001 -> emojiID = "<:venusaur:1312360644292513842>";
                case 30002 -> emojiID = "<:venusaurmega:1314051761849499690>";
                case 30004 -> emojiID = "<:venusaurgmax:1314245485749473390>";

                case 4 -> emojiID = "<:charmander:1312345766446239774>";
                case 5 -> emojiID = "<:charmeleon:1312345778462658640>";

                case 60001 -> emojiID = "<:charizard:1312345731956346903>";
                case 60002 -> emojiID = "<:charizardmegax:1314051344327249980>";
                case 60003 -> emojiID = "<:charizardmegay:1314046760997359616>";
                case 60004 -> emojiID = "<:charizardgmax:1314245509187371169>";

                case 7 -> emojiID = "<:squirtle:1312359132480929852>";
                case 8 -> emojiID = "<:wartortle:1312391185100308650>";

                case 90001 -> emojiID = "<:blastoise:1312345147476021248>";
                case 90002 -> emojiID = "<:blastoisemega:1314051306503012462>";
                case 90004 -> emojiID = "<:blastoisegmax:1314245522932109393>";

                case 10 -> emojiID = "<:caterpie:1312345674402107393>";

                case 11 -> emojiID = "<:metapod:1312351939245379626>";

                case 120001 -> emojiID = "<:butterfree:1312345517438799912>";
                case 120004 -> emojiID = "<:butterfreegmax:1314245538555760660>";

                case 13 -> emojiID = "<:weedle:1312391215588708375>";
                case 14 -> emojiID = "<:kakuna:1312350511642578974>";

                case 150001 -> emojiID = "<:beedrill:1312344959315345478>";
                case 150002 -> emojiID = "<:beedrillmega:1314051294104780871>";

                case 16 -> emojiID = "<:pidgey:1312356861860909116>";
                case 17 -> emojiID = "<:pidgey:1312356861860909116>";

                case 180001 -> emojiID = "<:pidgeot:1312356837491867689>";
                case 180002 -> emojiID = "<:pidgeotmega:1314051621251973130>";

                case 190001 -> emojiID = "<:rattata:1312357410232602634>";
                case 190002 -> emojiID = "<:rattataalola:1312357420227493908>";
                case 200001 -> emojiID = "<:raticate:1312357385272168531>";
                case 200002 -> emojiID = "<:raticatealola:1312357397624520826>";

                case 21 -> emojiID = "<:spearow:1312359044136308746>";
                case 22 -> emojiID = "<:fearow:1312347291973324890>";
                case 23 -> emojiID = "<:ekans:1312347046958596138>";
                case 24 -> emojiID = "<:arbok:1312148153553916024>";

                case 250001 -> emojiID = "<:pikachu:1312356891313180754>";
                case 250002 -> emojiID = "<:pikachugmax:1314245552443232256>";

                case 260001 -> emojiID = "<:raichu:1312357298160668682>";
                case 260002 -> emojiID = "<:raichualola:1312357309996863590>";

                case 270001 -> emojiID = "<:sandshrew:1312357819231637554>";
                case 270002 -> emojiID = "<:sandshrewalola:1312357836029825046>";
                case 280001 -> emojiID = "<:sandslash:1312357854459465758>";
                case 280002 -> emojiID = "<:sandslashalola:1312357864869859409>";

                case 29 -> emojiID = "<:nidorina:1312352427760029748>";
                case 30 -> emojiID = "<:nidorina:1312352427760029748>";

                case 31 -> emojiID = "<:nidoqueen:1312352396520853514>";
                case 32 -> emojiID = "<:nidoranm:1312352415596417085>";
                case 33 -> emojiID = "<:nidorino:1312352438509899847>";
                case 34 -> emojiID = "<:nidoking:1312352385510801472>";
                case 35 -> emojiID = "<:clefairy:1312345978979880960>";

                case 36 -> emojiID = "<:clefable:1312345966451626075>";

                case 370001 -> emojiID = "<:vulpix:1312391129857003590>";
                case 370002 -> emojiID = "<:vulpixalola:1312391141458448425>";
                case 380001 -> emojiID = "<:ninetales:1312352468847558706>";
                case 380002 -> emojiID = "<:ninetalesalola:1312352479203037254>";

                case 39 -> emojiID = "<:jigglypuff:1312350384781787186>";
                case 40 -> emojiID = "<:wigglytuff:1312391301353836554>";

                case 41 -> emojiID = "<:zubat:1312391638911291532>";
                case 42 -> emojiID = "<:golbat:1312348365169627186>";
                case 43 -> emojiID = "<:oddish:1312352687278260285>";
                case 44 -> emojiID = "<:gloom:1312348344458150018>";
                case 45 -> emojiID = "<:vileplume:1312390985371750420>";

                case 46 -> emojiID = "<:paras:1312356658466521148>";
                case 47 -> emojiID = "<:parasect:1312356668960538654>";
                case 48 -> emojiID = "<:venomoth:1312360622742175765>";
                case 49 -> emojiID = "<:venomoth:1312360622742175765>";

                case 500001 -> emojiID = "<:diglett:1312346683966750760>";
                case 500002 -> emojiID = "<:diglettalola:1314172006052139018>";
                case 510001 -> emojiID = "<:dugtrio:1312346906344816670>";
                case 510002 -> emojiID = "<:dugtrioalola:1314171996388724736>";

                case 520001 -> emojiID = "<:meowth:1312351887856500757>";
                case 520002 -> emojiID = "<:meowthgalar:1312729610416291880>";
                case 520004 -> emojiID = "<:meowthgmax:1314245564921155594>";

                case 530001 -> emojiID = "<:persian:1312356735255842816>";
                case 530002 -> emojiID = "<:persianalola:1312356755686162484>";

                case 54 -> emojiID = "<:psyduck:1312357161849847818>";
                case 55 -> emojiID = "<:golduck:1312348386845921340>";

                case 56 -> emojiID = "<:mankey:1312351616984154163>";
                case 57 -> emojiID = "<:primeape:1312357130275389500>";

                case 580001 -> emojiID = "<:growlithe:1312348754405490709>";
                case 580002 -> emojiID = "<:growlithehisui:1312812184392302613>";
                case 590001 -> emojiID = "<:arcanine:1312148165251829803>";
                case 590002 -> emojiID = "<:arcaninehisui:1312812283449053264>";

                case 60 -> emojiID = "<:poliwag:1312357020300742666>";
                case 61 -> emojiID = "<:poliwhirl:1312357029792448512>";
                case 62 -> emojiID = "<:poliwrath:1312357038734704650>";
                case 63 -> emojiID = "<:abra:1312144839579795496>";
                case 64 -> emojiID = "<:kadabra:1312350500326473748>";

                case 650001 -> emojiID = "<:alakazam:1312147863488434246>";
                case 650002 -> emojiID = "<:alakazammega:1314051234352857088>";

                case 66 -> emojiID = "<:machop:1312351420342734878>";
                case 67 -> emojiID = "<:machoke:1312351410439852073>";

                case 680001 -> emojiID = "<:machamp:1312351398796595210>";
                case 680004 -> emojiID = "<:machampgmax:1314245584680386610>";

                case 69 -> emojiID = "<:bellsprout:1312345027883827262>";
                case 70 -> emojiID = "<:weepinbell:1312391224904257667>";

                case 71 -> emojiID = "<:victreebel:1312360690903941150>";
                case 72 -> emojiID = "<:tentacool:1312359914185687051>";
                case 73 -> emojiID = "<:tentacruel:1312359925489340467>";

                case 740001 -> emojiID = "<:geodude:1312348208646586398>";
                case 740002 -> emojiID =  "<:geodudealola:1312348220659208192>";
                case 750001 -> emojiID = "<:graveler:1312348573760880753>";
                case 750002 -> emojiID = "<:graveleralola:1312348584548503603>";
                case 760001 -> emojiID = "<:golem:1312348396723507200>";
                case 760002 -> emojiID = "<:golemalola:1312348422376001656>";

                case 770001 -> emojiID = "<:ponyta:1312357048557768704>";
                case 770002 -> emojiID = "<:ponytagalar:1312729688766152734>";
                case 780001 -> emojiID = "<:rapidash:1312357376275251220>";
                case 780002 -> emojiID = "<:rapidashgalar:1312729734395990016>";

                case 790001 -> emojiID = "<:slowpoke:1312358606284390440>";
                case 790002 -> emojiID = "<:slowpokegalar:1312729978856804362>";
                case 800001 -> emojiID = "<:slowbro:1312358577985421383>";
                case 800002 -> emojiID = "<:slowbromega:1314051714352943245>";
                case 800003 -> emojiID = "<:slowbrogalar:1312730025589739560>";

                case 81 -> emojiID = "<:magnemite:1312351503926951946>";
                case 82 -> emojiID = "<:magneton:1312351515570339850>";

                case 830001 -> emojiID = "<:farfetchd:1312347280652636161>";
                case 830002 -> emojiID = "<:farfetchdgalar:1312730290522951731>";

                case 84 -> emojiID = "<:doduo:1312346729491992586>";
                case 85 -> emojiID = "<:dodrio:1312346716640514068>";

                case 86 -> emojiID = "<:seel:1312358078607523880>";
                case 87 -> emojiID = "<:dewgong:1312346591989858325>";

                case 880001 -> emojiID = "<:grimer:1312348609420984411>";
                case 880002 -> emojiID = "<:grimeralola:1312348619139190784>";
                case 890001 -> emojiID = "<:muk:1312352263682920478>";
                case 890002 -> emojiID = "<:mukalola:1312352273611096074>";

                case 90 -> emojiID = "<:shellder:1312358239085527050>";

                case 91 -> emojiID = "<:cloyster:1312346000907702372>";
                case 92 -> emojiID = "<:gastly:1312348132817895435>";
                case 93 -> emojiID = "<:haunter:1312348937021030410>";

                case 940001 -> emojiID = "<:gengar:1312348185619988500>";
                case 940002 -> emojiID = "<:gengarmega:1314051404742004756>";
                case 940004 -> emojiID = "<:gengargmax:1314245622093713570>";

                case 95 -> emojiID = "<:onix:1312352719901818953>";

                case 96 -> emojiID = "<:drowzee:1312346873356488784>";
                case 97 -> emojiID = "<:hypno:1312349784119578705>";
                case 98 -> emojiID = "<:krabby:1312350701283709018>";

                case 990001 -> emojiID = "<:kingler:1312350593980829767>";
                case 990004 -> emojiID = "<:kinglergmax:1314245635381137408>";

                case 100001 -> emojiID = "<:voltorb:1312391106427621466>";
                case 100002 -> emojiID = "<:voltorbhisui:1312812035037204551>";
                case 101001 -> emojiID = "<:electrode:1312347096854040586>";
                case 101002 -> emojiID = "<:electrodehisui:1312812231947452436>";

                case 102 -> emojiID = "<:exeggcute:1312347233189892147>";
                case 1030001 -> emojiID = "<:exeggutor:1312347242971271188>";
                case 1030002 -> emojiID = "<:exeggutoralola:1312347257546342401>";

                case 104 -> emojiID = "<:cubone:1312346390910996570>";
                case 1050001 -> emojiID = "<:marowak:1312351696772665385>";
                case 1050002 -> emojiID = "<:marowakalola:1312351706608046130>";

                case 106 -> emojiID = "<:hitmonlee:1312349083075084370>";
                case 107 -> emojiID = "<:hitmonchan:1312349071037693982>";
                case 108 -> emojiID = "<:lickitung:1312351131204063232>";
                case 109 -> emojiID = "<:koffing:1312350668799086662>";
                case 110 -> emojiID = "<:weezing:1312391237960990780>";

                case 111 -> emojiID = "<:rhyhorn:1312357544181895198>";
                case 112 -> emojiID = "<:rhydon:1312357537827389470>";
                case 113 -> emojiID = "<:chansey:1312345719293607936>";
                case 114 -> emojiID = "<:tangela:1312359805511536701>";

                case 1150001 -> emojiID = "<:kangaskhan:1312350522505957376>";
                case 1150002 -> emojiID = "<:kangaskhanmega:1314051481363546142>";

                case 116 -> emojiID = "<:horsea:1312349724665184326>";
                case 117 -> emojiID = "<:seadra:1312358019509784606>";
                case 118 -> emojiID = "<:goldeen:1312348375194013736>";
                case 119 -> emojiID = "<:seaking:1312358030079168573>";
                case 120 -> emojiID = "<:staryu:1312359226034880552>";

                case 121 -> emojiID = "<:starmie:1312359210767486986>";
                case 122 -> emojiID = "<:mrmime:1312352222515953805>";
                case 123 -> emojiID = "<:scyther:1312358009338593321>";
                case 124 -> emojiID = "<:jynx:1312350466709000203>";
                case 125 -> emojiID = "<:electabuzz:1312347058346135553>";

                case 126 -> emojiID = "<:magmar:1312351482497990717>";

                case 1270001 -> emojiID = "<:pinsir:1312356959772479529>";
                case 1270002 -> emojiID = "<:pinsirmega:1314051631658041384>";

                case 128 -> emojiID = "<:tauros:1312359880388247553>";
                case 129 -> emojiID = "<:magikarp:1312351472591179787>";

                case 1300001 -> emojiID = "<:gyarados:1312348893119250473>";
                case 1300002 -> emojiID = "<:gyaradosmega:1314051444122587138>";

                case 1310001 -> emojiID = "<:lapras:1312350995438768128>";
                case 1310004 -> emojiID = "<:laprasgmax:1314245650480889977>";

                case 132 -> emojiID = "<:ditto:1312346703776452638>";

                case 1330001 -> emojiID = "<:eevee:1312347033255940206>";
                case 1330004 -> emojiID = "<:eeveegmax:1314245661658452029>";

                case 134 -> emojiID = "<:vaporeon:1312360576021827597>";
                case 135 -> emojiID = "<:jolteon:1312350420282376252>";

                case 136 -> emojiID = "<:flareon:1312347527454003211>";
                case 137 -> emojiID = "<:porygon:1312357091884662796>";
                case 138 -> emojiID = "<:omanyte:1312352697630068747>";
                case 139 -> emojiID = "<:omastar:1312352709583699998>";
                case 140 -> emojiID = "<:kabuto:1312350478339936267>";

                case 141 -> emojiID = "<:kabutops:1312350489391927306>";

                case 1420001 -> emojiID = "<:aerodactyl:1312144958001647627>";
                case 1420002 -> emojiID = "<:aerodactylmega:1314051207416905749>";

                case 1430001 -> emojiID = "<:snorlax:1312358717999677511>";
                case 1430004 -> emojiID = "<:snorlaxgmax:1314245674283302963>";

                case 144 -> emojiID = "<:articuno:1312148392784302212>";
                case 145 -> emojiID = "<:zapdos:1312391558024134706>";

                case 146 -> emojiID = "<:moltres:1312352170846453791>";
                case 147 -> emojiID = "<:dratini:1312346818536935434>";
                case 148 -> emojiID = "<:dragonair:1312346772668157994>";
                case 149 -> emojiID = "<:dragonite:1312346783116165180>";

                case 1500001 -> emojiID = "<:mewtwo:1312351961550557244>";
                case 1500002 -> emojiID = "<:mewtwomegax:1314051597948420196>";
                case 150003 -> emojiID = "<:mewtwomegay:1314051608136519700>";

                case 151 -> emojiID = "<:mew:1312351951190622299>";
                //gen 2:
                case 152 -> emojiID = "<:chikorita:1312345853238841435>";
                case 153 -> emojiID = "<:bayleef:1312148652827086930>";
                case 154 -> emojiID = "<:meganium:1312351825793388604>";
                case 155 -> emojiID = "<:cyndaquil:1312346414407487518>";

                case 156 -> emojiID = "<:quilava:1312357269245001728>";
                case 1570001 -> emojiID = "<:typhlosion:1312360370467508305>";
                case 1570002 -> emojiID = "<:typhlosionhisui:1312812060937027735>";

                case 158 -> emojiID = "<:totodile:1312360166792101909>";
                case 159 -> emojiID = "<:croconaw:1312346344463011891>";
                case 160 -> emojiID = "<:feraligatr:1312347327150821457>";

                case 161 -> emojiID = "<:sentret:1312358100824752189>";
                case 162 -> emojiID = "<:furret:1312348048005009429>";
                case 163 -> emojiID = "<:hoothoot:1312349703542800395>";
                case 164 -> emojiID = "<:noctowl:1312352503509024840>";
                case 165 -> emojiID = "<:ledyba:1312351112464171009>";

                case 166 -> emojiID = "<:ledian:1312351102087462923>";
                case 167 -> emojiID = "<:spinarak:1312359075945906217>";
                case 168 -> emojiID = "<:ariados:1312148330247356587>";
                case 169 -> emojiID = "<:crobat:1312346333503553536>";
                case 170 -> emojiID = "<:chinchou:1312345887007178803>";

                case 171 -> emojiID = "<:lanturn:1312350982629359676>";
                case 172 -> emojiID = "<:pichu:1312356824397254687>";
                case 173 -> emojiID = "<:cleffa:1312345989796859985>";
                case 174 -> emojiID = "<:igglybuff:1312349797709123594>";
                case 175 -> emojiID = "<:togepi:1312360043622174781>";

                case 176 -> emojiID = "<:togetic:1312360054439018576>";
                case 177 -> emojiID = "<:natu:1312352339524587520>";
                case 178 -> emojiID = "<:xatu:1312391456702332929>";
                case 179 -> emojiID = "<:mareep:1312351675700350986>";
                case 180 -> emojiID = "<:flaaffy:1312347468934938664>";

                case 1810001 -> emojiID = "<:ampharos:1312148085530427392>";
                case 1810002 -> emojiID = "<:ampharosmega:1314051258147147826>";

                case 182 -> emojiID = "<:bellossom:1312345014977695764>";
                case 183 -> emojiID = "<:marill:1312351686249156718>";
                case 184 -> emojiID = "<:azumarill:1312148496068902964>";
                case 185 -> emojiID = "<:sudowoodo:1312359308385718293>";

                case 186 -> emojiID = "<:politoed:1312357010406379563>";
                case 187 -> emojiID = "<:hoppip:1312349713739157576>";
                case 188 -> emojiID = "<:skiploom:1312358476038537226>";
                case 189 -> emojiID = "<:jumpluff:1312350444106023002>";
                case 190 -> emojiID = "<:aipom:1312147835512160297>";

                case 191 -> emojiID = "<:sunkern:1312359622471843860>";
                case 192 -> emojiID = "<:sunflora:1312359612162379846>";
                case 193 -> emojiID = "<:yanma:1312391503066304552>";
                case 194 -> emojiID = "<:wooper:1312391411961827328>";
                case 195 -> emojiID = "<:quagsire:1312357253961220136>";

                case 196 -> emojiID = "<:espeon:1312347198389747712>";
                case 197 -> emojiID = "<:umbreon:1312360429166530571>";
                case 198 -> emojiID = "<:murkrow:1312352305382690897>";

                case 1990001 -> emojiID = "<:slowking:1312358595299639396>";
                case 1990002 -> emojiID = "<:slowkinggalar:1312730327386554398>";

                case 200 -> emojiID = "<:misdreavus:1312352147043778561>";

                case 201 -> emojiID = "<:unown:1312360454974210058>";
                case 202 -> emojiID = "<:wobbuffet:1312391356559396955>";
                case 203 -> emojiID = "<:girafarig:1312348257988509707>";
                case 204 -> emojiID = "<:pineco:1312356948888518687>";
                case 205 -> emojiID = "<:forretress:1312347900818358272>";

                case 206 -> emojiID = "<:dunsparce:1312346924275335168>";
                case 207 -> emojiID = "<:gligar:1312348324418031677>";

                case 2080001 -> emojiID = "<:steelix:1312359238068338698>";
                case 2080002 -> emojiID = "<:steelixmega:1314051724234981436>";

                case 209 -> emojiID = "<:snubbull:1312358749851357204>";
                case 210 -> emojiID = "<:granbull:1312348562419617792>";

                case 2110001 -> emojiID = "<:qwilfish:1312357288455045121>";
                case 2110002 -> emojiID = "<:qwilfishhisui:1312812132663955466>";

                case 2120001 -> emojiID = "<:scizor:1312357953671790632>";
                case 2120002 -> emojiID = "<:scizormega:1314051692664459284>";
                case 213 -> emojiID = "<:shuckle:1312358329028182026>";

                case 2140001 -> emojiID = "<:heracross:1312349022794809365>";
                case 2140002 -> emojiID = "<:heracrossmega:1314051458978676807>";

                case 2150001 -> emojiID = "<:sneasel:1312358692779196436>";
                case 2150002 -> emojiID = "<:sneaselhisui:1312812091014643733>";

                case 216 -> emojiID = "<:teddiursa:1312359903142084668>";
                case 217 -> emojiID = "<:ursaring:1312360520455815311>";
                case 218 -> emojiID = "<:slugma:1312358626639482932>";
                case 219 -> emojiID = "<:magcargo:1312351451149762630>";
                case 220 -> emojiID = "<:swinub:1312359736926011402>";

                case 221 -> emojiID = "<:piloswine:1312356939430236170>";

                case 2220001 -> emojiID = "<:corsola:1312346100807499816>";
                case 2220002 -> emojiID = "<:corsolagalar:1312730443682152569>";

                case 223 -> emojiID = "<:remoraid:1312357498123976776>";
                case 224 -> emojiID = "<:octillery:1312352668118810726>";
                case 225 -> emojiID = "<:delibird:1312346549547696128>";

                case 226 -> emojiID = "<:mantine:1312351632872181820>";
                case 227 -> emojiID = "<:skarmory:1312358451179159613>";
                case 228 -> emojiID = "<:houndour:1312349749336080475>";

                case 2290001 -> emojiID = "<:houndoom:1312349737558609960>";
                case 2290002 -> emojiID = "<:houndoommega:1314051470500429844>";

                case 230 -> emojiID = "<:kingdra:1312350583495200768>";

                case 231 -> emojiID = "<:phanpy:1312356779677454408>";
                case 232 -> emojiID = "<:donphan:1312346740372013077>";
                case 233 -> emojiID = "<:porygon2:1312357101762248764>";
                case 234 -> emojiID = "<:stantler:1312359160570056715>";
                case 235 -> emojiID = "<:smeargle:1312358658520256552>";

                case 236 -> emojiID = "<:tyrogue:1312360403518361651>";
                case 237 -> emojiID = "<:hitmontop:1312349094169018380>";
                case 238 -> emojiID = "<:smoochum:1312358680251076708>";
                case 239 -> emojiID = "<:elekid:1312347109579821168>";
                case 240 -> emojiID = "<:magby:1312351431545720843>";

                case 241 -> emojiID = "<:miltank:1312352021340225536>";
                case 242 -> emojiID = "<:blissey:1312345178761330719>";
                case 243 -> emojiID = "<:raikou:1312357340824997898>";
                case 244 -> emojiID = "<:entei:1312347176805863446>";
                case 245 -> emojiID = "<:suicune:1312359602796363816>";

                case 246 -> emojiID = "<:larvitar:1312351018247393280>";
                case 247 -> emojiID = "<:pupitar:1312357195710726196>";

                case 2480001 -> emojiID = "<:tyranitar:1312360380135379024>";
                case 2480002 -> emojiID = "<:tyranitarmega:1314051749476040784>";

                case 249 -> emojiID = "<:lugia:1312351301786533889>";
                case 250 -> emojiID = "<:hooh:1312349126922600519>";

                case 251 -> emojiID = "<:celebi:1312345685869334528>";
                case 252 -> emojiID = "<:treecko:1312360244063637605>";
                case 253 -> emojiID = "<:grovyle:1312348741830836274>";

                case 2540001 -> emojiID = "<:sceptile:1312357941038288948>";
                case 2540002 -> emojiID = "<:sceptilemega:1314051680081285191>";

                case 255 -> emojiID = "<:torchic:1312360065587744800>";
                case 256 -> emojiID = "<:combusken:1312346052094988318>";

                case 2570001 -> emojiID = "<:blaziken:1312345164282593371>";
                case 2570002 -> emojiID = "<:blazikenmega:1314051317840220160>";

                case 258 -> emojiID = "<:mudkip:1312352241600041010>";
                case 259 -> emojiID = "<:marshtomp:1312351757631750225>";

                case 2600001 -> emojiID = "<:swampert:1312359691741040640>";
                case 2600002 -> emojiID = "<:swampertmega:1314051734968205353>";

                case 261 -> emojiID = "<:poochyena:1312357058095349790>";
                case 262 -> emojiID = "<:mightyena:1312352001245581322>";

                case 2630001 -> emojiID = "<:zigzagoon:1312391606288125983>";
                case 2630002 -> emojiID = "<:zigzagoongalar:1312730479459438602>";
                case 2640001 -> emojiID = "<:linoone:1312351183708491838>";
                case 2640002 -> emojiID = "<:linoonegalar:1312730563114958858>";

                case 265 -> emojiID = "<:wurmple:1312391428030337056>";

                case 266 -> emojiID = "<:silcoon:1312358360837787709>";
                case 267 -> emojiID = "<:beautifly:1312344937731198986>";
                case 268 -> emojiID = "<:cascoon:1312345645209620511>";
                case 269 -> emojiID = "<:dustox:1312346989538709544>";
                case 270 -> emojiID = "<:lotad:1312351255988801559>";

                case 271 -> emojiID = "<:lombre:1312351234304245781>";
                case 272 -> emojiID = "<:ludicolo:1312351291514556438>";
                case 273 -> emojiID = "<:seedot:1312358057316974622>";
                case 274 -> emojiID = "<:nuzleaf:1312352556470767616>";
                case 275 -> emojiID = "<:shiftry:1312358289106800670>";

                case 276 -> emojiID = "<:taillow:1312359784665714688>";
                case 277 -> emojiID = "<:swellow:1312359718328729631>";
                case 278 -> emojiID = "<:wingull:1312391323424129065>";
                case 279 -> emojiID = "<:pelipper:1312356722307891220>";
                case 280 -> emojiID = "<:ralts:1312357358294401084>";

                case 281 -> emojiID = "<:kirlia:1312350604374442104>";

                case 2820001 -> emojiID = "<:gardevoir:1312348118007676928>";
                case 2820002 -> emojiID = "<:gardevoirmega:1314051391961960550>";

                case 283 -> emojiID = "<:surskit:1312359633276637224>";
                case 284 -> emojiID = "<:masquerain:1312351768348332032>";
                case 285 -> emojiID = "<:shroomish:1312358318970503198>";

                case 286 -> emojiID = "<:breloom:1312345270910189649>";
                case 287 -> emojiID = "<:slakoth:1312358551297069127>";
                case 288 -> emojiID = "<:vigoroth:1312360701939028060>";
                case 289 -> emojiID = "<:slaking:1312358539376984094>";
                case 290 -> emojiID = "<:nincada:1312352458567057450>";

                case 291 -> emojiID = "<:ninjask:1312352492620873758>";
                case 292 -> emojiID = "<:shedinja:1312358213177577482>";
                case 293 -> emojiID = "<:whismur:1312391283095900261>";
                case 294 -> emojiID = "<:loudred:1312351270799020103>";
                case 295 -> emojiID = "<:exploud:1312347269856628806>";

                case 296 -> emojiID = "<:makuhita:1312351540735901696>";
                case 297 -> emojiID = "<:hariyama:1312348927227596821>";
                case 298 -> emojiID = "<:azurill:1312148507896975431>";
                case 299 -> emojiID = "<:nosepass:1312352535469621248>";
                case 300 -> emojiID = "<:skitty:1312358487656894526>";

                case 301 -> emojiID = "<:delcatty:1312346539213062144>";

                case 3020001 -> emojiID = "<:sableye:1312357736796917812>";
                case 3020002 -> emojiID = "<:sableyemega:1314051656790310973>";

                case 3030001 -> emojiID = "<:mawile:1312351785163161640>";
                case 3030002 -> emojiID = "<:mawilemega:1314051561369899068>";

                case 304 -> emojiID = "<:aron:1312148376766382080>";
                case 305 -> emojiID = "<:lairon:1312350853167841280>";

                case 3060001 -> emojiID = "<:aggron:1312147810891862058>";
                case 3060002 -> emojiID = "<:aggronmega:1314051219836239892>";

                case 307 -> emojiID = "<:meditite:1312351814620020756>";

                case 3080001 -> emojiID = "<:medicham:1312351804503101542>";
                case 3080002 -> emojiID = "<:medichammega:1314051573537574922>";

                case 309 -> emojiID = "<:electrike:1312347084426317915>";

                case 3100001 -> emojiID = "<:manectric:1312351595844866048>";
                case 3100002 -> emojiID = "<:manectricmega:1314051556483797052>";

                case 311 -> emojiID = "<:plusle:1312356984816795688>";
                case 312 -> emojiID = "<:minun:1312352135903707196>";
                case 313 -> emojiID = "<:volbeat:1312391065466175499>";
                case 314 -> emojiID = "<:illumise:1312349807792230450>";
                case 315 -> emojiID = "<:roselia:1312357611701665853>";

                case 316 -> emojiID = "<:gulpin:1312348804795727884>";
                case 317 -> emojiID = "<:swalot:1312359673747214428>";
                case 318 -> emojiID = "<:carvanha:1312345630877683784>";

                case 3190001 -> emojiID = "<:sharpedo:1312358168952574002>";
                case 3190002 -> emojiID = "<:sharpedomega:1314051704093806684>";

                case 320 -> emojiID = "<:wailmer:1312391153030660126>";

                case 321 -> emojiID = "<:wailord:1312391163751170149>";
                case 322 -> emojiID = "<:numel:1312352545670299658>";

                case 3230001 -> emojiID = "<:camerupt:1312345578155282462>";
                case 3230002 -> emojiID = "<:cameruptmega:1314051331949854720>";

                case 324 -> emojiID = "<:torkoal:1312360081903583272>";
                case 325 -> emojiID = "<:spoink:1312359113610760294>";

                case 326 -> emojiID = "<:grumpig:1312348793118920794>";
                case 327 -> emojiID = "<:spinda:1312359087018610718>";
                case 328 -> emojiID = "<:trapinch:1312360233720352828>";
                case 329 -> emojiID = "<:vibrava:1312360666996150322>";
                case 330 -> emojiID = "<:flygon:1312347632991211620>";

                case 331 -> emojiID = "<:cacnea:1312345549030166569>";
                case 332 -> emojiID = "<:cacturne:1312345565245345823>";
                case 333 -> emojiID = "<:swablu:1312359647201726565>";

                case 3340001 -> emojiID = "<:altaria:1312148012922830918>";
                case 3340002 -> emojiID = "<:altariamega:1314051245694259220>";

                case 335 -> emojiID = "<:zangoose:1312391545248550922>";

                case 336 -> emojiID = "<:seviper:1312358142121742367>";
                case 337 -> emojiID = "<:lunatone:1312351331670818846>";
                case 338 -> emojiID = "<:solrock:1312359031859314780>";
                case 339 -> emojiID = "<:barboach:1312148608338100326>";
                case 340 -> emojiID = "<:whiscash:1312391272861925536>";

                case 341 -> emojiID = "<:corphish:1312346086844928031>";
                case 342 -> emojiID = "<:crawdaunt:1312346297499390002>";
                case 343 -> emojiID = "<:baltoy:1312148538783957082>";
                case 344 -> emojiID = "<:claydol:1312345956380835930>";
                case 345 -> emojiID = "<:lileep:1312351151622062140>";

                case 346 -> emojiID = "<:cradily:1312346202896994425>";
                case 347 -> emojiID = "<:anorith:1312148113506435215>";
                case 348 -> emojiID = "<:armaldo:1312148350123900998>";
                case 349 -> emojiID = "<:feebas:1312347303121518673>";
                case 350 -> emojiID = "<:milotic:1312352010489823312>";

                case 351 -> emojiID = "<:castform:1312345656651939880>";
                case 352 -> emojiID = "<:kecleon:1312350560049037424>";
                case 353 -> emojiID = "<:shuppet:1312358339514077246>";

                case 3540001 -> emojiID = "<:banette:1312148552394346526>";
                case 3540002 -> emojiID = "<:banettemega:1314051282008281088>";

                case 355 -> emojiID = "<:duskull:1312346977685471282>";

                case 356 -> emojiID = "<:dusclops:1312346956248518766>";
                case 357 -> emojiID = "<:tropius:1312360266079408198>";
                case 358 -> emojiID = "<:chimecho:1312345875716116542>";

                case 3590001 -> emojiID = "<:absol:1312144855576608788>";
                case 3590002 -> emojiID = "<:absolmega:1314051196499267584>";

                case 360 -> emojiID = "<:wynaut:1312391439166079030>";

                case 361 -> emojiID = "<:snorunt:1312358727923269633>";

                case 3620001 -> emojiID = "<:glalie:1312348298266415196>";
                case 3620002 -> emojiID = "<:glaliemega:1314051415592931368>";

                case 363 -> emojiID = "<:spheal:1312359066525237308>";
                case 364 -> emojiID = "<:sealeo:1312358045304754187>";
                case 365 -> emojiID = "<:walrein:1312391174933450793>";

                case 366 -> emojiID = "<:clamperl:1312345919412371456>";
                case 367 -> emojiID = "<:huntail:1312349760799248427>";
                case 368 -> emojiID = "<:gorebyss:1312348500608155668>";
                case 369 -> emojiID = "<:relicanth:1312357488389001247>";
                case 370 -> emojiID = "<:luvdisc:1312351352680222802>";

                case 371 -> emojiID = "<:bagon:1312148526204977233>";
                case 372 -> emojiID = "<:shelgon:1312358224099278878>";

                case 3730001 -> emojiID = "<:salamence:1312357751711596714>";
                case 3730002 -> emojiID = "<:salamencemega:1314051669872349194>";

                case 374 -> emojiID = "<:beldum:1312345001833005066>";
                case 375 -> emojiID = "<:metang:1312351928897765376>";

                case 3760001 -> emojiID = "<:metagross:1312351917615091752>";
                case 3760002 -> emojiID = "<:metagrossmega:1314051586913468509>";

                case 377 -> emojiID = "<:regirock:1312357467551825930>";
                case 378 -> emojiID = "<:regice:1312357442591526973>";
                case 379 -> emojiID = "<:registeel:1312357478264082442>";

                case 3800001 -> emojiID = "<:latias:1312351028091420764>";
                case 3800002 -> emojiID = "<:latiasmega:1314051503887089694>";
                case 3810001 -> emojiID = "<:latios:1312351061364703233>";
                case 3810002 -> emojiID = "<:latiosmega:1314051516314685523>";

                case 3820001 -> emojiID = "<:kyogre:1312350823648591942>";
                case 3820002 -> emojiID = "<:kyogreprimal:1314051493728358511>";
                case 3830001 -> emojiID = "<:groudon:1312348720591011880>";
                case 3830002 -> emojiID = "<:groudonprimal:1314051428830023751>";
                case 3840001 -> emojiID = "<:rayquaza:1312357429954089040>";
                case 3840002 -> emojiID = "<:rayquazamega:1314051644601663508>";

                case 385 -> emojiID = "<:jirachi:1312350396408135710>";

                case 386 -> emojiID = "<:deoxys:1312346572721225729>";
                case 387 -> emojiID = "<:turtwig:1312360320907612231>";
                case 388 -> emojiID = "<:grotle:1312348707726823434>";
                case 389 -> emojiID = "<:torterra:1312360124886814741>";
                case 390 -> emojiID = "<:chimchar:1312345865167310858>";

                case 391 -> emojiID = "<:monferno:1312352181172572180>";
                case 392 -> emojiID = "<:infernape:1312349831330795540>";
                case 393 -> emojiID = "<:piplup:1312356975329415240>";
                case 394 -> emojiID = "<:prinplup:1312357140052054026>";
                case 395 -> emojiID = "<:empoleon:1312347165884158024>";

                case 396 -> emojiID = "<:starly:1312359198574645259>";
                case 397 -> emojiID = "<:staravia:1312359187183042631>";
                case 398 -> emojiID = "<:staraptor:1312359175849775124>";
                case 399 -> emojiID = "<:bidoof:1312345090039087214>";
                case 400 -> emojiID = "<:bibarel:1312345068572643329>";

                case 401 -> emojiID = "<:kricketot:1312350711706816562>";
                case 402 -> emojiID = "<:kricketune:1312350721995182080>";
                case 403 -> emojiID = "<:shinx:1312358308040020049>";
                case 404 -> emojiID = "<:luxio:1312351362704478260>";
                case 405 -> emojiID = "<:luxray:1312351373144358963>";

                case 406 -> emojiID = "<:budew:1312345346088767549>";
                case 407 -> emojiID = "<:roserade:1312357623399710740>";
                case 408 -> emojiID = "<:cranidos:1312346285243895838>";
                case 409 -> emojiID = "<:rampardos:1312357365194035210>";
                case 410 -> emojiID = "<:shieldon:1312358278172246016>";

                case 411 -> emojiID = "<:bastiodon:1312148638360801391>";
                case 412 -> emojiID = "<:burmy:1312345479870152704>";

                case 4130001 -> emojiID = "<:wormadam:1312498518665072652>";
                case 4310002 -> emojiID = "<:wormadamsandy:1313842706019123200>";
                case 4310003 -> emojiID = "<:wormadamtrash:1313842719272996874>";

                case 414 -> emojiID = "<:mothim:1312352210054811699>";
                case 415 -> emojiID = "<:combee:1312346035254988881>";

                case 416 -> emojiID = "<:vespiquen:1312360657240326197>";
                case 417 -> emojiID = "<:pachirisu:1312352770795372554>";
                case 418 -> emojiID = "<:buizel:1312345433720356864>";
                case 419 -> emojiID = "<:floatzel:1312347572161089567>";
                case 420 -> emojiID = "<:cherubi:1312345817738252340>";

                case 421 -> emojiID = "<:cherrim:1312345806556364831>";
                case 422 -> emojiID = "<:shellos:1312358252503371787>";
                case 423 -> emojiID = "<:gastrodon:1312348146122358794>";
                case 424 -> emojiID = "<:ambipom:1312148043931582484>";
                case 425 -> emojiID = "<:drifloon:1312346846785437757>";

                case 426 -> emojiID = "<:drifblim:1312346834920013874>";
                case 427 -> emojiID = "<:buneary:1312345457405591603>";

                case 428001 -> emojiID = "<:lopunny:1312351243846553621>";
                case 428002 -> emojiID = "<:lopunnymega:1314051528214184006>";

                case 429 -> emojiID = "<:mismagius:1312352159098208257>";
                case 430 -> emojiID = "<:honchkrow:1312349104587804672>";

                case 431 -> emojiID = "<:glameow:1312348311759487036>";
                case 432 -> emojiID = "<:purugly:1312357223023775754>";
                case 433 -> emojiID = "<:chingling:1312345897916563527>";
                case 434 -> emojiID = "<:stunky:1312359297610547210>";
                case 435 -> emojiID = "<:skuntank:1312358525363556382>";

                case 436 -> emojiID = "<:bronzor:1312345323913482311>";
                case 437 -> emojiID = "<:bronzong:1312345311515246634>";
                case 438 -> emojiID = "<:bonsly:1312345216383979550>";
                case 439 -> emojiID = "<:mimejr:1312352031197106218>";
                case 440 -> emojiID = "<:happiny:1312348916984840263>";

                case 441 -> emojiID = "<:chatot:1312345790857089085>";
                case 442 -> emojiID = "<:spiritomb:1312359099647791104>";
                case 443 -> emojiID = "<:gible:1312348234571710475>";
                case 444 -> emojiID = "<:gabite:1312348060851896363>";

                case 4450001 -> emojiID = "<:garchomp:1312348105953247242>";
                case 4450002 -> emojiID = "<:garchompmega:1314051382244016178>";

                case 446 -> emojiID = "<:munchlax:1312352285417934898>";
                case 447 -> emojiID = "<:riolu:1312357577627140186>";

                case 4480001 -> emojiID = "<:lucario:1312351276297879613>";
                case 4480002 -> emojiID = "<:lucariomega:1314051538917785660>";

                case 449 -> emojiID = "<:hippowdon:1312349056923598898>";
                case 450 -> emojiID = "<:hippopotas:1312349046094041109>";

                case 451 -> emojiID = "<:skorupi:1312358497568034870>";
                case 452 -> emojiID = "<:drapion:1312346804339216435>";
                case 453 -> emojiID = "<:croagunk:1312346321214111764>";
                case 454 -> emojiID = "<:toxicroak:1312360212023349269>";
                case 455 -> emojiID = "<:carnivine:1312345608874623028>";

                case 456 -> emojiID = "<:finneon:1312347452489203773>";
                case 457 -> emojiID = "<:lumineon:1312351311324385290>";
                case 458 -> emojiID = "<:mantyke:1312351644561969163>";
                case 459 -> emojiID = "<:snover:1312358738543378472>";

                case 4600001 -> emojiID = "<:abomasnow:1312144759376052319>";
                case 4600002 -> emojiID = "<:abomasnowmega:1314051180812570644>";

                case 461 -> emojiID = "<:weavile:1312391204297642014>";
                case 462 -> emojiID = "<:magnezone:1312351525103992832>";
                case 463 -> emojiID = "<:lickilicky:1312351122282774558>";
                case 464 -> emojiID = "<:rhyperior:1312357553673474048>";
                case 465 -> emojiID = "<:tangrowth:1312359814671892572>";

                case 466 -> emojiID = "<:electivire:1312347069666558012>";
                case 467 -> emojiID = "<:magmortar:1312351492501409802>";
                case 468 -> emojiID = "<:togekiss:1312360033845121054>";
                case 469 -> emojiID = "<:yanmega:1312391514403377162>";
                case 470 -> emojiID = "<:leafeon:1312351074178568232>";

                case 471 -> emojiID = "<:glaceon:1312348286463643678>";
                case 472 -> emojiID = "<:gliscor:1312348335134212097>";
                case 473 -> emojiID = "<:mamoswine:1312351563276222484>";
                case 474 -> emojiID = "<:porygonz:1312357111631581245>";

                case 4750001 -> emojiID = "<:gallade:1312348070977208431>";
                case 4750002 -> emojiID = "<:gallademega:1314051367190659112>";

                case 476 -> emojiID = "<:probopass:1312357149308882954>";
                case 477 -> emojiID = "<:dusknoir:1312346965983363074>";
                case 478 -> emojiID = "<:froslass:1312348004245573662>";

                case 4790001 -> emojiID = "<:rotom:1312357636473356368>";
                case 4790002 -> emojiID = "<:rotomfan:1313842740194185287>";
                case 4790003 -> emojiID = "<:rotomfrost:1313842762235252736>";
                case 4790004 -> emojiID = "<:rotomheat:1313842775854415872>";
                case 4790005 -> emojiID = "<:rotommow:1313842791222214707>";
                case 4790006 -> emojiID = "<:rotomwash:1313842804589334579>";

                case 480 -> emojiID = "<:uxie:1312360531927109632>";

                case 481 -> emojiID = "<:mesprit:1312351904843567134>";
                case 482 -> emojiID = "<:azelf:1312148482332561490>";
                case 483 -> emojiID = "<:dialga:1312346635812081695>";
                case 484 -> emojiID = "<:palkia:1312352780220108881>";
                case 485 -> emojiID = "<:heatran:1312348980411367444>";

                case 486 -> emojiID = "<:regigigas:1312357454884900924>";
                case 4870001 -> emojiID = "<:giratina:1312348268541378661>";
                case 4870002 -> emojiID = "<:giratinaorigin:1314165633549865021>";

                case 488 -> emojiID = "<:cresselia:1312346309096640602>";
                case 489 -> emojiID = "<:phione:1312356812472844319>";
                case 490 -> emojiID = "<:manaphy:1312351573632094259>";

                case 491 -> emojiID = "<:darkrai:1312346427438923776>";

                case 4920001 -> emojiID = "<:shaymin:1312358197864173568>";
                case 4920002 -> emojiID = "<:shayminsky:1313842821165355081>";

                case 493 -> emojiID = "<:arceus:1312148185191546970>";
                case 494 -> emojiID = "<:victini:1312360679642107916>";
                case 495 -> emojiID = "<:snivy:1312358706436112384>";

                case 496 -> emojiID = "<:servine:1312358122115043430>";
                case 497 -> emojiID = "<:serperior:1312358111150997554>";
                case 498 -> emojiID = "<:tepig:1312359938495877150>";
                case 499 -> emojiID = "<:pignite:1312356881762615366>";
                case 500 -> emojiID = "<:emboar:1312347132782575676>";

                case 501 -> emojiID = "<:oshawott:1312352760745951333>";
                case 502 -> emojiID = "<:dewott:1312346602689794049>";

                case 5030001 -> emojiID = "<:samurott:1312357795424632865>";
                case 5030002 -> emojiID = "<:samurotthisui:1312812119560945714>";

                case 504 -> emojiID = "<:patrat:1312356702397665290>";
                case 505 -> emojiID = "<:watchog:1312391194546016266>";

                case 506 -> emojiID = "<:lillipup:1312351173520396328>";
                case 507 -> emojiID = "<:herdier:1312349034538729512>";
                case 508 -> emojiID = "<:stoutland:1312359261246066698>";
                case 509 -> emojiID = "<:purrloin:1312357205625933834>";
                case 510 -> emojiID = "<:liepard:1312351144760053840>";

                case 511 -> emojiID = "<:pansage:1312352848154984518>";
                case 512 -> emojiID = "<:simisage:1312358431574724648>";
                case 513 -> emojiID = "<:pansear:1312356648764838001>";
                case 514 -> emojiID = "<:simisear:1312358440936673351>";
                case 515 -> emojiID = "<:panpour:1312352835870130308>";

                case 516 -> emojiID = "<:simipour:1312358420124274748>";
                case 517 -> emojiID = "<:munna:1312352296176451617>";
                case 518 -> emojiID = "<:musharna:1312352317286125610>";
                case 519 -> emojiID = "<:pidove:1312356872329629758>";
                case 520 -> emojiID = "<:tranquill:1312360222693789827>";

                case 521 -> emojiID = "<:unfezant:1312360440726159390>";
                case 522 -> emojiID = "<:blitzle:1312345194116546572>";
                case 523 -> emojiID = "<:zebstrika:1312391569361600553>";
                case 524 -> emojiID = "<:roggenrola:1312357599596777524>";
                case 525 -> emojiID = "<:boldore:1312345205613002822>";

                case 526 -> emojiID = "<:gigalith:1312348245481099264>";
                case 527 -> emojiID = "<:woobat:1312391400653983764>";
                case 528 -> emojiID = "<:swoobat:1312359758790918224>";
                case 529 -> emojiID = "<:drilbur:1312346859045392414>";
                case 530 -> emojiID = "<:excadrill:1312347221701689465>";

                case 5310001 -> emojiID = "<:audino:1312148405711147018>";
                case 5310002 -> emojiID = "<:audinomega:1314051268557275186>";

                case 532 -> emojiID = "<:timburr:1312359983287111690>";
                case 533 -> emojiID = "<:gurdurr:1312348832205504573>";
                case 534 -> emojiID = "<:conkeldurr:1312346076191395841>";
                case 535 -> emojiID = "<:tympole:1312360334211944538>";

                case 536 -> emojiID = "<:palpitoad:1312352799727550464>";
                case 537 -> emojiID = "<:seismitoad:1312358090007511090>";
                case 538 -> emojiID = "<:throh:1312359959807135804>";
                case 539 -> emojiID = "<:sawk:1312357887091146762>";
                case 540 -> emojiID = "<:sewaddle:1312358155686117396>";

                case 541 -> emojiID = "<:swadloon:1312359661147787345>";
                case 542 -> emojiID = "<:leavanny:1312351088552316960>";
                case 543 -> emojiID = "<:venipede:1312360611971338301>";
                case 544 -> emojiID = "<:whirlipede:1312391263009505451>";
                case 545 -> emojiID = "<:scolipede:1312357977663078510>";

                case 546 -> emojiID = "<:cottonee:1312346144030064760>";
                case 547 -> emojiID = "<:whimsicott:1312391252649709598>";
                case 548 -> emojiID = "<:petilil:1312356770189938729>";
                case 5490001 -> emojiID = "<:lilligant:1312351164297248880>";
                case 5490002 -> emojiID = "<:lilliganthisui:1312812153643733032>";
                case 550 -> emojiID = "<:basculin:1312148621571133580>";

                case 551 -> emojiID = "<:sandile:1312357807252570244>";
                case 552 -> emojiID = "<:krokorok:1312350732175020046>";
                case 553 -> emojiID = "<:krookodile:1312350744380178452>";

                case 5540001 -> emojiID = "<:darumaka:1312346464328089620>";
                case 5540002 -> emojiID = "<:darumakagalar:1312730603652780163>";
                case 5550001 -> emojiID = "<:darmanitan:1312346438805622785>";
                case 5550002 -> emojiID = "<:darmanitangalar:1312730613903523861>";

                case 556 -> emojiID = "<:maractus:1312351654481367101>";
                case 557 -> emojiID = "<:dwebble:1312346999823269950>";
                case 558 -> emojiID = "<:crustle:1312346356957839403>";
                case 559 -> emojiID = "<:scraggy:1312357997783154748>";
                case 560 -> emojiID = "<:scrafty:1312357988303896596>";

                case 561 -> emojiID = "<:sigilyph:1312358351098740847>";
                case 5620001 -> emojiID = "<:yamask:1312391492958162998>";
                case 5620002 -> emojiID = "<:yamaskgalar:1312731040304857138>";

                case 563 -> emojiID = "<:cofagrigus:1312346023158611988>";
                case 564 -> emojiID = "<:tirtouga:1312360010956935270>";
                case 565 -> emojiID = "<:carracosta:1312345621247823942>";

                case 566 -> emojiID = "<:archen:1312148301516378132>";
                case 567 -> emojiID = "<:archeops:1312148317953855558>";
                case 568 -> emojiID = "<:trubbish:1312360277601157251>";
                case 5690001 -> emojiID = "<:garbodor:1312348096834830406>";
                case 5690004 -> emojiID = "<:garbodorgmax:1314245687776379000>";

                case 5700001 -> emojiID = "<:zorua:1312391628450693200>";
                case 5700002 -> emojiID = "<:zoruahisui:1312812011511484479>";
                case 5710001 -> emojiID = "<:zoroark:1312391616543068240>";
                case 5710002 -> emojiID = "<:zoroarkhisui:1312811996508459008>";

                case 572 -> emojiID = "<:minccino:1312352054361985067>";
                case 573 -> emojiID = "<:cinccino:1312345908607975424>";
                case 574 -> emojiID = "<:gothita:1312348512737820813>";
                case 575 -> emojiID = "<:gothorita:1312348533835173908>";

                case 576 -> emojiID = "<:gothitelle:1312348522946887792>";
                case 577 -> emojiID = "<:solosis:1312359021939920989>";
                case 578 -> emojiID = "<:duosion:1312346935448834190>";
                case 579 -> emojiID = "<:reuniclus:1312357521020813393>";
                case 580 -> emojiID = "<:ducklett:1312346895842148392>";

                case 581 -> emojiID = "<:swanna:1312359705473187911>";
                case 582 -> emojiID = "<:vanillite:1312360554106458132>";
                case 583 -> emojiID = "<:vanillish:1312360544115752970>";
                case 584 -> emojiID = "<:vanilluxe:1312360565980532868>";
                case 585 -> emojiID = "<:deerling:1312346498771456040>";

                case 586 -> emojiID = "<:sawsbuck:1312357906619957339>";
                case 587 -> emojiID = "<:emolga:1312347144182566912>";
                case 588 -> emojiID = "<:karrablast:1312350537580150794>";
                case 589 -> emojiID = "<:escavalier:1312347187446943754>";
                case 590 -> emojiID = "<:foongus:1312347663110373446>";

                case 591 -> emojiID = "<:amoonguss:1312148071219724348>";
                case 592 -> emojiID = "<:frillish:1312347969240170546>";
                case 593 -> emojiID = "<:jellicent:1312350373285204089>";
                case 594 -> emojiID = "<:alomomola:1312147887748022342>";
                case 595 -> emojiID = "<:joltik:1312350432005324891>";

                case 596 -> emojiID = "<:galvantula:1312348085720191087>";
                case 597 -> emojiID = "<:ferroseed:1312347338303475773>";
                case 598 -> emojiID = "<:ferrothorn:1312347367575388240>";
                case 599 -> emojiID = "<:klink:1312350647479308308>";
                case 600 -> emojiID = "<:klang:1312350614625189918>";

                case 601 -> emojiID = "<:klinklang:1312350658644541531>";
                case 602 -> emojiID = "<:tynamo:1312360344823529502>";
                case 603 -> emojiID = "<:eelektrik:1312347011055489085>";
                case 604 -> emojiID = "<:eelektross:1312347021637582879>";
                case 605 -> emojiID = "<:elgyem:1312347121311285248>";

                case 606 -> emojiID = "<:beheeyem:1312344978009358409>";
                case 607 -> emojiID = "<:litwick:1312351220907638877>";
                case 608 -> emojiID = "<:lampent:1312350862840172554>";
                case 609 -> emojiID = "<:chandelure:1312345708892000296>";
                case 610 -> emojiID = "<:axew:1312148462929838110>";

                case 611 -> emojiID = "<:fraxure:1312347954715037759>";
                case 612 -> emojiID = "<:haxorus:1312348957661335623>";
                case 613 -> emojiID = "<:cubchoo:1312346379393302569>";
                case 614 -> emojiID = "<:beartic:1312148683428593785>";
                case 615 -> emojiID = "<:cryogonal:1312346368353763340>";

                case 616 -> emojiID = "<:shelmet:1312358268261367838>";
                case 617 -> emojiID = "<:accelgor:1312144913151955028>";
                case 6180001 -> emojiID = "<:stunfisk:1312359285484949554>";
                case 6180002 -> emojiID = "<:stunfiskgalar:1312731078699782205>";

                case 619 -> emojiID = "<:mienfoo:1312351976050131025>";
                case 620 -> emojiID = "<:mienshao:1312351986565255228>";

                case 621 -> emojiID = "<:druddigon:1312346886165889046>";
                case 622 -> emojiID = "<:golett:1312348439752867860>";
                case 623 -> emojiID = "<:golurk:1312348462280609873>";
                case 624 -> emojiID = "<:pawniard:1312356711859748946>";
                case 625 -> emojiID = "<:bisharp:1312345117977350154>";

                case 626 -> emojiID = "<:bouffalant:1312345226735648788>";
                case 627 -> emojiID = "<:rufflet:1312357725589737482>";

                case 6280001 -> emojiID = "<:braviary:1312345260126502982>";
                case 6280002 -> emojiID = "<:braviaryhisui:1312812255099752479>";

                case 629 -> emojiID = "<:vullaby:1312391120059240488>";
                case 630 -> emojiID = "<:mandibuzz:1312351583438241842>";

                case 631 -> emojiID = "<:heatmor:1312348970512678912>";
                case 632 -> emojiID = "<:durant:1312346945934725161>";
                case 633 -> emojiID = "<:deino:1312346524994502677>";
                case 634 -> emojiID = "<:zweilous:1312391649275543552>";
                case 635 -> emojiID = "<:hydreigon:1312349772891422730>";

                case 636 -> emojiID = "<:larvesta:1312351007694520320>";
                case 637 -> emojiID = "<:volcarona:1312391095577084014>";
                case 638 -> emojiID = "<:cobalion:1312346012983230464>";
                case 639 -> emojiID = "<:terrakion:1312359949560451092>";
                case 640 -> emojiID = "<:virizion:1312391002836832316>";

                case 6410001 -> emojiID = "<:tornadus:1312360091726381056>";
                case 6410002 -> emojiID = "<:tornadustherian:1312812081816404069>";
                case 6420001 -> emojiID = "<:thundurus:1312359971639267368>";
                case 6420002 -> emojiID = "<:thundurustherian:1312812071662125088>";

                case 643 -> emojiID = "<:reshiram:1312357508945281054>";
                case 644 -> emojiID = "<:zekrom:1312391580862386288>";

                case 6450001 -> emojiID = "<:landorus:1312350873682444300>";
                case 6450002 -> emojiID = "<:landorustherian:1312812165136388196>";

                case 6460001 -> emojiID = "<:kyurem:1312350838185918474>";
                case 6460002 -> emojiID = "<:kyuremwhite:1313893388319326229>";
                case 6460003 -> emojiID = "<:kyuremblack:1313893380547149915>";

                case 647 -> emojiID = "<:keldeo:1312350571117674566>";

                case 6480001 -> emojiID = "<:meloetta:1312351847964479588>";
                case 6480002 -> emojiID = "<:meloettapirouette:1313893556120715355>";

                case 649 -> emojiID = "<:genesect:1312348159338614859>";
                case 650 -> emojiID = "<:chespin:1312345840320253995>";

                case 651 -> emojiID = "<:quilladin:1312357277948313640>";
                case 652 -> emojiID = "<:chesnaught:1312345828395978806>";
                case 653 -> emojiID = "<:fennekin:1312347315159437342>";
                case 654 -> emojiID = "<:braixen:1312345247417765908>";
                case 655 -> emojiID = "<:delphox:1312346561589673994>";

                case 656 -> emojiID = "<:froakie:1312347981164314634>";
                case 657 -> emojiID = "<:frogadier:1312347991180443719>";
                case 658 -> emojiID = "<:greninja:1312348596435157013>";
                case 659 -> emojiID = "<:bunnelby:1312345468679749674>";
                case 660 -> emojiID = "<:diggersby:1312346671123922974>";

                case 661 -> emojiID = "<:fletchling:1312347557581688832>";
                case 662 -> emojiID = "<:fletchinder:1312347538581360640>";
                case 663 -> emojiID = "<:talonflame:1312359796049051678>";
                case 664 -> emojiID = "<:scatterbug:1312357928920940574>";
                case 665 -> emojiID = "<:spewpa:1312359055230111854>";

                case 666 -> emojiID = "<:vivillon:1312391013473452135>";
                case 667 -> emojiID = "<:litleo:1312351193674158100>";
                case 668 -> emojiID = "<:pyroar:1312357233559863316>";
                case 669 -> emojiID = "<:flabebe:1312347481165795419>";
                case 670 -> emojiID = "<:floette:1312347587642130443>";

                case 671 -> emojiID = "<:florges:1312347611512176680>";
                case 672 -> emojiID = "<:skiddo:1312358462629609562>";
                case 673 -> emojiID = "<:gogoat:1312348355552346132>";
                case 674 -> emojiID = "<:pancham:1312352809303412746>";
                case 675 -> emojiID = "<:pangoro:1312352821093597236>";

                case 676 -> emojiID = "<:furfrou:1312348014651641906>";
                case 677 -> emojiID = "<:espurr:1312347208619786300>";
                case 678 -> emojiID = "<:meowstic:1312351877110693888>";
                case 679 -> emojiID = "<:honedge:1312349115165970472>";
                case 680 -> emojiID = "<:doublade:1312346752396820541>";

                case 681 -> emojiID = "<:aegislash:1312144933687398642>";
                case 682 -> emojiID = "<:spritzee:1312359123156860938>";
                case 683 -> emojiID = "<:aromatisse:1312148362903945277>";
                case 684 -> emojiID = "<:swirlix:1312359748095705168>";
                case 685 -> emojiID = "<:slurpuff:1312358646977531934>";

                case 686 -> emojiID = "<:inkay:1312349842365878302>";
                case 687 -> emojiID = "<:malamar:1312351556309487666>";
                case 688 -> emojiID = "<:binacle:1312345104102723584>";
                case 689 -> emojiID = "<:barbaracle:1312148595436290118>";
                case 690 -> emojiID = "<:skrelp:1312358506401366067>";

                case 691 -> emojiID = "<:dragalge:1312346762450833438>";
                case 692 -> emojiID = "<:clauncher:1312345932687347783>";
                case 693 -> emojiID = "<:clawitzer:1312345944376873002>";
                case 694 -> emojiID = "<:helioptile:1312349007527415858>";
                case 695 -> emojiID = "<:heliolisk:1312348997465407539>";

                case 696 -> emojiID = "<:tyrunt:1312360417565081671>";
                case 697 -> emojiID = "<:tyrantrum:1312360391438897173>";
                case 698 -> emojiID = "<:amaura:1312148028639023305>";
                case 699 -> emojiID = "<:aurorus:1312148432382591006>";
                case 700 -> emojiID = "<:sylveon:1312359772384661624>";

                case 701 -> emojiID = "<:hawlucha:1312348948232671252>";
                case 702 -> emojiID = "<:dedenne:1312346487157690408>";
                case 703 -> emojiID = "<:carbink:1312345598556504074>";
                case 704 -> emojiID = "<:goomy:1312348489325477998>";

                case 7050001 -> emojiID = "<:sliggoo:1312358563703816252>";
                case 7050002 -> emojiID = "<:sliggoohisui:1312812110094401606>";
                case 7060001 -> emojiID = "<:goodra:1312348476763537439>";
                case 7060002 -> emojiID = "<:goodrahisui:1312812201798668319>";

                case 707 -> emojiID = "<:klefki:1312350633038446632>";
                case 708 -> emojiID = "<:phantump:1312356791899652106>";
                case 709 -> emojiID = "<:trevenant:1312360255413424128>";
                case 710 -> emojiID = "<:pumpkaboo:1312357179319255111>";

                case 711 -> emojiID = "<:gourgeist:1312348545289814076>";
                case 712 -> emojiID = "<:bergmite:1312345040408018995>";
                case 7130001 -> emojiID = "<:avalugg:1312148450258718812>";
                case 7130002 -> emojiID = "<:avalugghisui:1312812264759492730>";

                case 714 -> emojiID = "<:noibat:1312352513273495593>";
                case 715 -> emojiID = "<:noivern:1312352525130793030>";

                case 716 -> emojiID = "<:xerneas:1312391462113247303>";
                case 717 -> emojiID = "<:yveltal:1312391536469872771>";
                case 7180001 -> emojiID = "<:zygarde:1312391659446599740>";
                case 7180002 -> emojiID = "<:zygarde10:1314198364757295184>";

                case 7190001 -> emojiID = "<:diancie:1312346646394175530>";
                case 7190002 -> emojiID = "<:dianciemega:1314051354754285681>";

                case 7200001 -> emojiID = "<:hoopa:1312349139069177887>";
                case 7200002 -> emojiID = "<:hoopaunbound:1314198356838322217>";

                case 721 -> emojiID = "<:volcanion:1312391076807704628>";
                case 722 -> emojiID = "<:rowlet:1312357713384046645>";
                case 723 -> emojiID = "<:dartrix:1312346452965589032>";

                case 7240001 -> emojiID = "<:decidueye:1312346476059295836>";
                case 7420002 -> emojiID = "<:decidueyehisui:1312812245650247760>";

                case 725 -> emojiID = "<:litten:1312351207066697851>";

                case 726 -> emojiID = "<:torracat:1312360113087971440>";
                case 727 -> emojiID = "<:incineroar:1312349819636813876>";
                case 728 -> emojiID = "<:popplio:1312357080354521119>";
                case 729 -> emojiID = "<:brionne:1312345281056215080>";
                case 730 -> emojiID = "<:primarina:1312357120737542154>";

                case 731 -> emojiID = "<:pikipek:1312356929137279029>";
                case 732 -> emojiID = "<:trumbeak:1312360288846221444>";
                case 733 -> emojiID = "<:toucannon:1312360187654574092>";
                case 734 -> emojiID = "<:yungoos:1312391523739897906>";
                case 735 -> emojiID = "<:gumshoos:1312348817944875039>";

                case 736 -> emojiID = "<:grubbin:1312348764840792074>";
                case 737 -> emojiID = "<:charjabug:1312345754127564831>";
                case 738 -> emojiID = "<:vikavolt:1312390965952253952>";
                case 739 -> emojiID = "<:crabrawler:1312346176057769994>";
                case 740 -> emojiID = "<:crabominable:1312346155669262358>";

                case 741 -> emojiID = "<:oricorio:1312352743867940865>";
                case 742 -> emojiID = "<:cutiefly:1312346403808346203>";
                case 743 -> emojiID = "<:ribombee:1312357563848986704>";

                case 744 -> emojiID = "<:rockruff:1312357589727576104>";
                case 7450001 -> emojiID = "<:lycanroc:1312351383529197588>";
                case 7450002 -> emojiID = "<:lycanrocdusk:1312694611369656361>";
                case 7450003 -> emojiID = "<:lycanrocmidnight:1312694621972725811>";

                case 746 -> emojiID = "<:wishiwashi:1312391342789496832>";
                case 747 -> emojiID = "<:mareanie:1312351664132325416>";
                case 748 -> emojiID = "<:toxapex:1312360207036452906>";
                case 749 -> emojiID = "<:mudbray:1312352232494075914>";
                case 750 -> emojiID = "<:mudsdale:1312352253272920084>";

                case 751 -> emojiID = "<:dewpider:1312346614291234857>";
                case 752 -> emojiID = "<:araquanid:1312148135266488350>";
                case 753 -> emojiID = "<:fomantis:1312347645120872498>";
                case 754 -> emojiID = "<:lurantis:1312351342899101717>";
                case 755 -> emojiID = "<:morelull:1312352195219296266>";

                case 756 -> emojiID = "<:shiinotic:1312358298518950000>";
                case 757 -> emojiID = "<:salandit:1312357770498150443>";
                case 758 -> emojiID = "<:salazzle:1312357781663252532>";
                case 759 -> emojiID = "<:stufful:1312359271765119006>";
                case 760 -> emojiID = "<:bewear:1312345052957380658>";

                case 761 -> emojiID = "<:bounsweet:1312345236881805313>";
                case 762 -> emojiID = "<:steenee:1312359250965823550>";
                case 763 -> emojiID = "<:tsareena:1312360299613126696>";
                case 764 -> emojiID = "<:comfey:1312346065583734836>";
                case 765 -> emojiID = "<:oranguru:1312352729750048831>";

                case 766 -> emojiID = "<:passimian:1312356685481771098>";
                case 767 -> emojiID = "<:wimpod:1312391312674259075>";
                case 768 -> emojiID = "<:golisopod:1312348451660496937>";
                case 769 -> emojiID = "<:sandygast:1312357875867455488>";
                case 770 -> emojiID = "<:palossand:1312352789787181107>";

                case 771 -> emojiID = "<:pyukumuku:1312357244209332294>";
                case 772 -> emojiID = "<:typenull:1312360358781911040>";
                case 773 -> emojiID = "<:silvally:1312358370983936042>";
                case 774 -> emojiID = "<:minior:1312352065070170163>";
                case 775 -> emojiID = "<:komala:1312350678970138624>";

                case 776 -> emojiID = "<:turtonator:1312360310316863552>";
                case 777 -> emojiID = "<:togedemaru:1312360022113652756>";
                case 778 -> emojiID = "<:mimikyu:1312352042374660106>";
                case 779 -> emojiID = "<:bruxish:1312345334537523240>";
                case 780 -> emojiID = "<:drampa:1312346793647931432>";

                case 781 -> emojiID = "<:dhelmise:1312346625536163850>";
                case 782 -> emojiID = "<:jangmoo:1312349877769867274>";
                case 783 -> emojiID = "<:hakamoo:1312348906234839050>";
                case 784 -> emojiID = "<:kommoo:1312350691293007872>";
                case 785 -> emojiID = "<:tapukoko:1312359860553121834>";

                case 786 -> emojiID = "<:tapulele:1312359870502146078>";
                case 787 -> emojiID = "<:tapubulu:1312359841393672233>";
                case 788 -> emojiID = "<:tapufini:1312359848029061220>";
                case 789 -> emojiID = "<:cosmog:1312346131967115375>";
                case 790 -> emojiID = "<:cosmoem:1312346116968288297>";

                case 791 -> emojiID = "<:solgaleo:1312358760701755475>";
                case 792 -> emojiID = "<:lunala:1312351321667538995>";
                case 793 -> emojiID = "<:nihilego:1312352448417103955>";
                case 794 -> emojiID = "<:buzzwole:1312345538888470568>";
                case 795 -> emojiID = "<:pheromosa:1312356801684967435>";

                case 796 -> emojiID = "<:xurkitree:1312391479271886908>";
                case 797 -> emojiID = "<:celesteela:1312345698292727818>";
                case 798 -> emojiID = "<:kartana:1312350550234234900>";
                case 799 -> emojiID = "<:guzzlord:1312348844612124692>";

                case 8000001 -> emojiID = "<:necrozma:1312352348991127553>";
                case 8000002 -> emojiID = "<:necrozmadusk:1312352373489799228>";
                case 8000003 -> emojiID = "<:necrozmadawn:1312352363167744093>";

                case 801 -> emojiID = "<:magearna:1312351460016656434>";
                case 802 -> emojiID = "<:marshadow:1312351717635129354>";
                case 803 -> emojiID = "<:poipole:1312356995512270858>";
                case 804 -> emojiID = "<:naganadel:1312352328661336116>";
                case 805 -> emojiID = "<:stakataka:1312359150986199080>";

                case 806 -> emojiID = "<:blacephalon:1312345135773646868>";
                case 807 -> emojiID = "<:zeraora:1312391595978526820>"
                ;
                case 808 -> emojiID = "<:meltan:1312351865345937459>";
                case 8090001 -> emojiID = "<:melmetal:1312351835352207380>";
                case 8090004 -> emojiID = "<:melmetalgmax:1314245716247449653>";

                case 810 -> emojiID = "<:grookey:1312731201886228560>";
                case 811 -> emojiID = "<:thwackey:1312731213533937674>";
                case 8120001 -> emojiID = "<:rillaboom:1312731223923359785>";
                case 8120004 -> emojiID = "<:rillaboomgmax:1314245734115180665>";

                case 813 -> emojiID = "<:scorbunny:1312731234677559317>";
                case 814 -> emojiID = "<:raboot:1312731244827770961>";
                case 8150001 -> emojiID = "<:cinderace:1312731257276469320>";
                case 8150004 -> emojiID = "<:cinderacegmax:1314245747805261965>";

                case 816 -> emojiID = "<:sobble:1312731268164751451>";
                case 817 -> emojiID = "<:drizzile:1312731289371017276>";
                case 8180001 -> emojiID = "<:inteleon:1312731299957444628>";
                case 8180004 -> emojiID = "<:cinderacegmax:1314245747805261965>";

                case 819 -> emojiID = "<:skwovet:1312731497421078528>";
                case 820 -> emojiID = "<:greedent:1312731502660026420>";

                case 821 -> emojiID = "<:rookidee:1312731513497849908>";
                case 822 -> emojiID = "<:corvisquire:1312731525384507392>";
                case 8230001 -> emojiID = "<:corviknight:1312731537925734411>";
                case 8230004 -> emojiID = "<:corviknightgmax:1314245772539068506>";

                case 824 -> emojiID = "<:blipbug:1312731569043275796>";
                case 825 -> emojiID = "<:dottler:1312731581399564399>";

                case 8260001 -> emojiID = "<:orbeetle:1312731593592406066>";
                case 8260004 -> emojiID = "<:orbeetlegmax:1314245799424557106>";

                case 827 -> emojiID = "<:nickit:1312731803789955112>";
                case 828 -> emojiID = "<:thievul:1312731808965595166>";
                case 829 -> emojiID = "<:gossifleur:1312731818960621609>";
                case 830 -> emojiID = "<:eldegoss:1312731828116787260>";

                case 831 -> emojiID = "<:wooloo:1312731839227629578>";
                case 832 -> emojiID = "<:dubwool:1312731851219009556>";
                case 833 -> emojiID = "<:chewtle:1312731866037485569>";

                case 8340001 -> emojiID = "<:drednaw:1312731877798314014>";
                case 8340004 -> emojiID = "<:drednawgmax:1314245810137075712>";

                case 835 -> emojiID = "<:yamper:1312731889592696852>";
                case 836 -> emojiID = "<:boltund:1312731899847774318>";

                case 837 -> emojiID = "<:rolycoly:1312731915501174814>";
                case 838 -> emojiID = "<:carkol:1312731928893325323>";
                case 8390001 -> emojiID = "<:coalossal:1312731945150713957>";
                case 8390004 -> emojiID = "<:coalossalgmax:1314245823441141862>";

                case 840 -> emojiID = "<:applin:1312732227288694914>";

                case 8410001 -> emojiID = "<:flapple:1312732237367742497>";
                case 8410004 -> emojiID = "<:flapplegmax:1314245832165294100>";
                case 8420001 -> emojiID = "<:appletun:1312732248826576968>";
                case 8420004 -> emojiID = "<:flapplegmax:1314245832165294100>";

                case 843 -> emojiID = "<:silicobra:1312732259081781278>";
                case 8440001 -> emojiID = "<:sandaconda:1312732272620867605>";
                case 8440004 -> emojiID = "<:sandacondagmax:1314245842311450737>";

                case 845 -> emojiID = "<:cramorant:1312732304661287002>";

                case 846 -> emojiID = "<:arrokuda:1312732344955830342>";
                case 847 -> emojiID = "<:barraskewda:1312732356578250803>";

                case 848 -> emojiID = "<:toxel:1312732565572026428>";
                case 8490001 -> emojiID = "<:toxtricity:1312732579388063795>";
                case 8490004 -> emojiID = "<:toxtricitygmax:1314245853413900380>";

                case 850 -> emojiID = "<:sizzlipede:1312732592994254848>";
                case 8510001 -> emojiID = "<:centiskorch:1312732602976702546>";
                case 8510004 -> emojiID = "<:centiskorchgmax:1314245876381909084>";

                case 852 -> emojiID = "<:clobbopus:1312732615618465842>";
                case 853 -> emojiID = "<:grappoloct:1312732628692111462>";
                case 854 -> emojiID = "<:sinistea:1312732638028500992>";
                case 855 -> emojiID = "<:polteageist:1312732649089138698>";

                case 856 -> emojiID = "<:hatenna:1312732666004639804>";
                case 857 -> emojiID = "<:hattrem:1312732674015887412>";
                case 8580001 -> emojiID = "<:hatterene:1312732688788094976>";
                case 8580004 -> emojiID = "<:hatterenegmax:1314245888087953448>";

                case 859 -> emojiID = "<:impidimp:1312733283758379028>";
                case 860 -> emojiID = "<:morgrem:1312733295955546153>";
                case 8610001 -> emojiID = "<:grimmsnarl:1312733306520997949>";
                case 8610004 -> emojiID = "<:grimmsnarlgmax:1314245911768993864>";

                case 862 -> emojiID = "<:obstagoon:1312733317099163669>";
                case 863 -> emojiID = "<:perrserker:1312733329350725712>";
                case 864 -> emojiID = "<:cursola:1312733347255947345>";
                case 865 -> emojiID = "<:sirfetchd:1312733358794473472>";

                case 866 -> emojiID = "<:mrrime:1312733368923979868>";
                case 867 -> emojiID = "<:runerigus:1312733379367796827>";
                case 868 -> emojiID = "<:milcery:1312733388691607573>";

                case 8690001 -> emojiID = "<:alcremine:1312733414641893476>";
                case 8690004 -> emojiID = "<:alcremiegmax:1314245924997959730>";

                case 870 -> emojiID = "<:falinks:1312733831475761224>";

                case 871 -> emojiID = "<:pincurchin:1312733844725567509>";
                case 872 -> emojiID = "<:snom:1312733854771187795>";
                case 873 -> emojiID = "<:frosmoth:1312733923314372628>";
                case 874 -> emojiID = "<:stonjourner:1312733934035140659>";
                case 875 -> emojiID = "<:eiscue:1312733956822663178>";

                case 8760001 -> emojiID = "<:indeedeef:1312733975021883483>";
                case 8760002 -> emojiID = "<:indeedeem:1312733984933023835>";

                case 877 -> emojiID = "<:morpeko:1312734001215307786>";

                case 878 -> emojiID = "<:cufant:1312734136741531670>";
                case 8790001 -> emojiID = "<:copperajah:1312734150804901890>";
                case 8790004 -> emojiID = "<:copperajahgmax:1314245936259666071>";

                case 880 -> emojiID = "<:dracozolt:1312734162335170581>";
                case 881 -> emojiID = "<:arctozolt:1312734174158917662>";
                case 882 -> emojiID = "<:dracovish:1312734184065994762>";
                case 883 -> emojiID = "<:arctovish:1312734195977682944>";

                case 8840001 -> emojiID = "<:duraludon:1312734206471962624>";
                case 8840004 -> emojiID = "<:duraludongmax:1314245949144694824>";

                case 885 -> emojiID = "<:dreepy:1312734541798182993>";
                case 886 -> emojiID = "<:drakloak:1312734553630310451>";
                case 887 -> emojiID = "<:dragapult:1312734564782968903>";

                case 888 -> emojiID = "<:zacian:1312734575323123742>";
                case 889 -> emojiID = "<:zamazenta:1312734585486049280>";
                case 890 -> emojiID = "<:eternatus:1312734594902003783>";

                case 891 -> emojiID = "<:kubfu:1312734613461925969>";
                case 8920001 -> emojiID = "<:urshifu:1312734637214404719>";
                case 8920002 -> emojiID = "<:urshifurapidstrike:1314246464376934431>";
                case 8920003 -> emojiID = "<:urshifugmax:1314245991305580614>";
                case 8920004 -> emojiID = "<:urshifurapidstrikegmax:1314246003985092619>";

                case 893 -> emojiID = "<:zarude:1312734698673410129>";
                case 894 -> emojiID = "<:ragieleki:1312734711298392084>";
                case 895 -> emojiID = "<:regidrago:1312734721087901736>";

                case 896 -> emojiID = "<:glastrier:1312734731271536650>";
                case 897 -> emojiID = "<:spectrier:1312734742055223297>";

                case 8980001 -> emojiID = "<:calyrex:1312734756647207004>";
                case 8980002 -> emojiID = "<:calyrexice:1312734765295599676>";
                case 8980003 -> emojiID = "<:calyrexshadow:1312734776154656830>";

                case 899 -> emojiID = "<:wyrdeer:1312812025885491261>";
                case 900 -> emojiID = "<:kleavor:1312812174913175572>";

                case 9010001 -> emojiID = "<:ursaluna:1312812046756347935>";
                case 9010002 -> emojiID = "<:ursalunabloodmoon:1312799981949816882>";

                case 9020001 -> emojiID = "<:basculegion:1312812273810538566>";
                case 9020002 -> emojiID = "<:basculegionf:1314242419289493544>";

                case 903 -> emojiID = "<:sneasler:1312812101240356975>";
                case 904 -> emojiID = "<:overqwil:1312812141866127400>";
                case 9050001 -> emojiID = "<:enamorus:1312812212582354974>";
                case 9050002 -> emojiID = "<:enamorustherian:1312812222459674705>";

                case 906 -> emojiID = "<:sprigatito:1312791608994828318>";
                case 907 -> emojiID = "<:floragato:1312793655052075078>";
                case 908 -> emojiID = "<:meowscarada:1312793669006524557>";
                case 908010 -> emojiID = "<a:meowscaradashiny:1314598490596180008>";
                case 909 -> emojiID = "<:fuecoco:1312793680666431538>";
                case 910 -> emojiID = "<:crocalor:1312793691517354055>";

                case 911 -> emojiID = "<:skeledirge:1312793701658919053>";
                case 912 -> emojiID = "<:quaxly:1312793712849588295>";
                case 913 -> emojiID = "<:quaxwell:1312793724262289429>";
                case 914 -> emojiID = "<:quaquaval:1312793733455941632>";
                case 915 -> emojiID = "<:lechonk:1312793748865941534>";

                case 9160001 -> emojiID = "<:oinkologne:1312793762635710644>";
                case 9160002 -> emojiID = "<:oinkolognef:1312801152269549568>";

                case 917 -> emojiID = "<:tarountula:1312794005049970771>";
                case 918 -> emojiID = "<:spidops:1312794019281109133>";
                case 919 -> emojiID = "<:nymble:1312794029460816032>";
                case 920 -> emojiID = "<:lokix:1312794048674660422>";

                case 921 -> emojiID = "<:pawmi:1312794061194793033>";
                case 922 -> emojiID = "<:pawmo:1312794072414687302>";
                case 923 -> emojiID = "<:pawmot:1312794136964763668>";
                case 924 -> emojiID = "<:tandemaus:1312794147635204146>";
                case 925 -> emojiID = "<:maushold:1312794158469087335>";

                case 926 -> emojiID = "<:fidough:1312794168292020224>";
                case 927 -> emojiID = "<:dachsbun:1312794179675623534>";
                case 928 -> emojiID = "<:smoliv:1312794191046246520>";
                case 929 -> emojiID = "<:dolliv:1312794202307821628>";
                case 930 -> emojiID = "<:arboliva:1312794527073042543>";

                case 931 -> emojiID = "<:squawkabilly:1312794536950632551>";
                case 932 -> emojiID = "<:nacli:1312794547339788409>";
                case 933 -> emojiID = "<:naclstack:1312794559666716682>";
                case 934 -> emojiID = "<:garganacl:1312794570852929597>";
                case 935 -> emojiID = "<:charcadet:1312794581472903269>";

                case 936 -> emojiID = "<:armarouge:1312794591442894889>";
                case 937 -> emojiID = "<:ceruledge:1312794602117402644>";
                case 938 -> emojiID = "<:tadbulb:1312794613798670426>";
                case 939 -> emojiID = "<:bellibolt:1312794661546623096>";
                case 940 -> emojiID = "<:wattrel:1312794674037264445>";

                case 941 -> emojiID = "<:kilowattrel:1312794684166373416>";
                case 942 -> emojiID = "<:maschiff:1312794699764862976>";
                case 943 -> emojiID = "<:mabosstiff:1312794710162538507>";
                case 944 -> emojiID = "<:shroodle:1312796285618749440>";
                case 945 -> emojiID = "<:grafaiai:1312796299325734932>";

                case 946 -> emojiID = "<:bramblin:1312796311342420029>";
                case 947 -> emojiID = "<:brambleghast:1312796322952384643>";
                case 948 -> emojiID = "<:toedscool:1312796333140217957>";
                case 949 -> emojiID = "<:toedscruel:1312796345198968933>";
                case 950 -> emojiID = "<:klawf:1312796359274922044>";

                case 951 -> emojiID = "<:capsakid:1312796370457071656>";
                case 952 -> emojiID = "<:scovillain:1312796380665876551>";
                case 953 -> emojiID = "<:rellor:1312796391310889110>";
                case 954 -> emojiID = "<:rabsca:1312796403222970428>";
                case 955 -> emojiID = "<:flittle:1312796417777209437>";

                case 956 -> emojiID = "<:espathra:1312796432461463572>";
                case 957 -> emojiID = "<:tinkatink:1312796443496681483>";
                case 958 -> emojiID = "<:tinkatuff:1312796455697780766>";
                case 959 -> emojiID = "<:tinkaton:1312796466162434058>";
                case 960 -> emojiID = "<:wiglett:1312796475738296341>";

                case 961 -> emojiID = "<:wugtrio:1312796486693556224>";
                case 962 -> emojiID = "<:bombirdier:1312796497070391468>";
                case 963 -> emojiID = "<:finizen:1312796507862339635>";
                case 964 -> emojiID = "<:palafin:1312796520017563689>";
                case 965 -> emojiID = "<:varoom:1312796531383861409>";

                case 966 -> emojiID = "<:revavroom:1312796542859608164>";
                case 967 -> emojiID = "<:cyclizar:1312796560706371665>";
                case 968 -> emojiID = "<:orthworm:1312796573591277668>";
                case 969 -> emojiID = "<:glimmet:1312796585108963449>";
                case 970 -> emojiID = "<:glimmora:1312796596483784827>";

                case 971 -> emojiID = "<:greavard:1312796608072646727>";
                case 972 -> emojiID = "<:houndstone:1312796621100028004>";
                case 973 -> emojiID = "<:flamingo:1312796633594990733>";
                case 974 -> emojiID = "<:cetoddle:1312796651739545713>";
                case 975 -> emojiID = "<:cetitan:1312796662451933254>";

                case 976 -> emojiID = "<:veluza:1312797395754684586>";
                case 977 -> emojiID = "<:dondozo:1312797407150473337>";
                case 978 -> emojiID = "<:tatsugiri:1312797416872738898>";
                case 979 -> emojiID = "<:annihilape:1312797428080054363>";
                case 980 -> emojiID = "<:clodsire:1312797437449998357>";

                case 981 -> emojiID = "<:farigiraf:1312797447939952710>";
                case 982 -> emojiID = "<:dudunsparce:1312797461328433273>";
                case 983 -> emojiID = "<:kingambit:1312797472325636186>";
                case 984 -> emojiID = "<:greattusk:1312797482018803753>";
                case 985 -> emojiID = "<:screamtail:1312797491602653258>";

                case 986 -> emojiID = "<:brutebonnet:1312797501970972742>";
                case 987 -> emojiID = "<:fluttermane:1312797512444416082>";
                case 988 -> emojiID = "<:slitherwing:1312797776806940692>";
                case 989 -> emojiID = "<:sandyshocks:1312797788681015418>";
                case 990 -> emojiID = "<:irontreads:1312797798923632783>";

                case 991 -> emojiID = "<:ironbundle:1312797808998354995>";
                case 992 -> emojiID = "<:ironhands:1312797818490064996>";
                case 993 -> emojiID = "<:ironjugulis:1312797828279435354>";
                case 994 -> emojiID = "<:ironmoth:1312797950572888125>";
                case 995 -> emojiID = "<:ironthorns:1312797973872251000>";

                case 996 -> emojiID = "<:frigibax:1312797987910713484>";
                case 997 -> emojiID = "<:arctibax:1312797998551535770>";
                case 998 -> emojiID = "<:baxcaliber:1312798010228342805>";
                case 999 -> emojiID = "<:gimmighoul:1312798273370722375>";
                case 1000 -> emojiID = "<:gholdengo:1312798284389023774>";

                case 1001 -> emojiID = "<:wochien:1312798294640037989>";
                case 1002 -> emojiID = "<:chienpao:1312798306069516308>";
                case 1003 -> emojiID = "<:tinglu:1312798317822087252>";
                case 1004 -> emojiID = "<:chiyu:1312798329926582272>";
                case 1005 -> emojiID = "<:roaringmoon:1312798342572675214>";

                case 1006 -> emojiID = "<:ironvaliant:1312798354509660160>";
                case 1007 -> emojiID = "<:koraidon:1312798368203931648>";
                case 1008 -> emojiID = "<:miraidon:1312798378454941767>";
                case 1009 -> emojiID = "<:walkingwake:1312798562744275054>";
                case 1010 -> emojiID = "<:ironleaves:1312798573787873363>";

                case 1011 -> emojiID = "<:dipplin:1312798618805338112>";
                case 1012 -> emojiID = "<:poltchageist:1312798585108303972>";
                case 1013 -> emojiID = "<:sinistcha:1312798607908405258>";
                case 1014 -> emojiID = "<:okidogi:1312798630163255326>";
                case 1015 -> emojiID = "<:munkidori:1312798645426585641>";

                case 1016 -> emojiID = "<:fezandipiti:1312798657250201681>";
                case 1017 -> emojiID = "<:ogerpon:1312798667022794856>";
                case 1018 -> emojiID = "<:archaludon:1312799084586991656>";
                case 1019 -> emojiID = "<:hydrapple:1312799097656180798>";
                case 1020 -> emojiID = "<:gougingfire:1312799106980384898>";

                case 1021 -> emojiID = "<:ragingbolt:1312799118158200972>";
                case 1022 -> emojiID = "<:ironboulder:1312799127930798080>";
                case 1023 -> emojiID = "<:ironcrown:1312799140211851294>";
                case 1024 -> emojiID = "<:terapagos:1312799153272918178>";
                case 1025 -> emojiID = "<:pecharunt:1312799471813525524>";
            }
            emojiList.add(emojiID);
        }
        return emojiList;
    }
}
