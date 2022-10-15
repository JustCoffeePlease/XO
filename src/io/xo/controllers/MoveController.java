package io.xo.controllers;

import io.xo.model.Field;
import io.xo.model.Figure;
import io.xo.model.exceptions.AlreadyOccupiedException;
import io.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {

        field.setFigure(point, figure);
    }
}
