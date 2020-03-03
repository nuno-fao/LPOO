import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    private Position position;

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Position moveUp() { return new Position(position.getX(), position.getY() - 1); }

    public Position moveDown() {
        return new Position(position.getX(), position.getY() + 1);
    }

    public Position moveLeft() {
        return new Position(position.getX()-1, position.getY());
    }

    public Position moveRight() {
        return new Position(position.getX()+1, position.getY());
    }

    public abstract void draw (TextGraphics graphics);

    public Element(int x, int y){
        position = new Position(x,y);
    }

    public boolean samePos(Element e) {
        return getPosition().getX() == e.getPosition().getX() && getPosition().getY() == e.getPosition().getY();
    }
}
