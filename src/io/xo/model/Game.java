package io.xo.model;

public class Game {

    private final Player[] players;

    private final Field field;

    private String name;

    public Game(final Player[] players,
                final Field field,
                final String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Field getField() {
        return field;
    }

    public Player[] getPlayers() {
        return players;
    }
}
