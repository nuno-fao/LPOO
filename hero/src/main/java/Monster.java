import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.Random;


public class Monster extends Element {
    public void draw(TextGraphics graphics){

        graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(super.getPosition().getX(), super.getPosition().getY()), "D");
    }

    public Monster(int x, int y){
        super(x,y);
    }

    public void move(int width,int height){
        Random random = new Random();
        int aux;
        boolean again;
        Position nextmove;
        do{
            again=false;
            aux = random.nextInt(4);
            switch(aux){
                case 0:
                    nextmove = moveUp();
                    break;
                case 1:
                    nextmove = moveDown();
                    break;
                case 2:
                    nextmove = moveLeft();
                    break;
                case 3:
                    nextmove = moveRight();
                    break;
                default:
                    nextmove = new Position(0,0);
            }
            if(!(nextmove.getX()>=1 && nextmove.getY()>=1 && nextmove.getX()<width-1 && nextmove.getY()<height-1)){
                again = true;
            }
            else{
                super.setPosition(nextmove);
            }
        }while(again);
    }
}
