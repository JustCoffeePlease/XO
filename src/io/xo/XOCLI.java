package io.xo;

import io.xo.model.Field;
import io.xo.model.Figure;
import io.xo.model.Game;
import io.xo.model.Player;
import io.xo.view.ConsoleView;

public class XOCLI {

    public static void main(String[] args) {

            final String name1 = "Alex";
            final String name2 = "Olesya";

            final Player[] players = new Player[2];
            players[0] = new Player(name1, Figure.X);
            players[1] = new Player(name2, Figure.O);

            final Game gameXO = new Game(players, new Field(3), "XO");

            final ConsoleView consoleView = new ConsoleView();
            consoleView.show(gameXO);
            while(consoleView.move(gameXO)) {
                consoleView.show(gameXO);
            }
    }
}
