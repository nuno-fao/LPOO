package com.aor.refactoring.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        position = new Position(row,column,direction);
    }

    public int getRow() {
        return position.getY();
    }

    public int getColumn() {
        return position.getX();
    }

    public char getDirection() {
        return position.getDirection();
    }

    public void execute(char command) {
        Command op;
        if (command == 'L') { // ROTATE LEFT
            op = new RotateLeft();
            op.execute(position);
        } else if (command == 'R') { // ROTATE RIGHT
            op = new RotateRight();
            op.execute(position);
        } else if (command == 'F'){ // MOVE FORWARD
            op = new MoveForward();
            op.execute(position);
        }
    }
}
