package com.aor.refactoring.example5;

public class RotateRight implements Command {
    @Override
    public void execute( Position position) {
        if (position.getDirection() == 'N') position.setDirection('E');
        else if (position.getDirection() == 'E') position.setDirection('S');
        else if (position.getDirection() == 'S') position.setDirection('W');
        else if (position.getDirection() == 'W') position.setDirection('N');
    }
}
