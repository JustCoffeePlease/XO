package io.xo.controllers;

import io.xo.model.Field;
import io.xo.model.Figure;
import io.xo.model.exceptions.AlreadyOccupiedException;
import io.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class WinnerControllerTest {

    @Test
    public void getWinnerWhenWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void getNoWinnerWhenWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void getWinnerWhenWinnerColumn() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void getNoWinnerWhenWinnerColumn() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void getWinnerWhenWinnerDiag_1() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void getNoWinnerWhenWinnerDiag_1() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.O);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void getWinnerWhenWinnerDiag_2() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 2), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 0), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void getNoWinnerWhenWinnerDiag_() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.O);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }
}