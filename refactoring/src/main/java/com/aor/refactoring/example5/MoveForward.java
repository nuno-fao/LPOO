package com.aor.refactoring.example5;

public class MoveForward implements Command {
    @Override
    public void execute(Position position) {
        if (position.getDirection() == 'N') position.setY(position.getY()-1);
        if (position.getDirection() == 'S') position.setY(position.getY()+1);
        if (position.getDirection() == 'W') position.setX(position.getX()-1);
        if (position.getDirection() == 'E') position.setX(position.getX()+1);
    }
}
