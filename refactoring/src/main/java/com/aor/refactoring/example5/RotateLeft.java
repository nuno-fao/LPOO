package com.aor.refactoring.example5;

public class RotateLeft implements Command {
    @Override
    public void execute(Position position) {
        if (position.getDirection() == 'N') position.setDirection('W');
        else if (position.getDirection() == 'W') position.setDirection('S');
        else if (position.getDirection() == 'S') position.setDirection('E');
        else if (position.getDirection() == 'E') position.setDirection('N');

    }
}
