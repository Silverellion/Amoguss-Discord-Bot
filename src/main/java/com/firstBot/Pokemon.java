package com.firstBot;

public class Pokemon {
    public enum Type {
        NORMAL,
        FIRE,
        WATER,
        ELECTRIC,
        GRASS,

        ICE,
        FIGHTING,
        POISON,
        GROUND,
        FLYING,

        PSYCHIC,
        BUG,
        ROCK,
        GHOST,
        DRAGON,

        DARK,
        STEEL,
        FAIRY,

        NONE
    }
    public enum Format {
        GMAX,
        AG,
        UBER,
        OU,
        UU,
        RU,
        NU,
        PU,
        ZU,
        NFE,
        LC
    }
    private final int dex;
    private final int gen;
    private final Boolean isMega;
    private final Type type;
    private final Type type2;
    private final Format format;

    Pokemon(int dex, int gen, Type type, Type type2, Format format) {
        this.dex = dex;
        this.gen = gen;
        this.isMega = false;
        this.type = type;
        this.type2 = type2;
        this.format = format;
    }

    Pokemon(int dex, int gen, Boolean isMega, Type type, Type type2, Format format) {
        this.dex = dex;
        this.gen = gen;
        this.isMega = isMega;
        this.type = type;
        this.type2 = type2;
        this.format = format;
    }

    public int getDex() {
        return dex;
    }

    public int getGen() {
        return gen;
    }

    public Boolean IsMega() {
        return isMega;
    }

    public Type getType() {
        return type;
    }

    public Type getType2() {
        return type2;
    }

    public Format getFormat() {
        return format;
    }
}
