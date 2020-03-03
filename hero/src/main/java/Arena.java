import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private int width;
    private int height;
    private Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;
    private List<Monster> monsters;

    public Arena(int w, int h){
        width=w;
        height=h;
        hero = new Hero(10,10);
        walls = createWalls();
        coins = createCoins();
        monsters = createMonsters();
    }

    public void draw(TextGraphics graphics) throws IOException{
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        hero.draw(graphics);
        for (Wall wall : walls) wall.draw(graphics);
        for (Coin coin : coins) coin.draw(graphics);
        for (Monster monster : monsters) monster.draw(graphics);

    }

    public void processKey(KeyStroke key) {
        if (key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        else if (key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
        else if (key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
        else if (key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
        for (Monster monster : monsters) monster.move(width,height);
        System.out.println(key);
    }

    private void moveHero(Position position) {
        if (canHeroMove(position)){
            for(Coin coin:coins){
                if (position.getY()==coin.getPosition().getY() && position.getX()==coin.getPosition().getX()){
                    coins.remove(coin);
                    break;
                }
            }
            hero.setPosition(position);
        }
    }

    private boolean canHeroMove(Position pos){
        return (pos.getX()>=1 && pos.getY()>=1 && pos.getX()<width-1 && pos.getY()<height-1);
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        Coin aux;
        boolean clone;
        for (int i = 0; i < 5; i++){
            clone=false;
            aux = new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1);
            if(i==0){coins.add(aux);}
            else{
                if(!aux.samePos(hero)){
                    for(Coin coin:coins){
                        if(coin.samePos(aux)){
                            clone=true;
                            i--;
                            break;
                        }
                    }
                }
                else{
                    clone=true;
                    i--;
                }
            }
            if(!clone){
                coins.add(aux);
            }
        }
        return coins;
    }

    private List<Monster> createMonsters() {
        Random random = new Random();
        ArrayList<Monster> monsters = new ArrayList<>();
        Monster aux;
        boolean clone;
        for (int i = 0; i < 10; i++){
            clone=false;
            aux = new Monster(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1);
            if(i==0){monsters.add(aux);}
            else{
                if(!aux.samePos(hero)){
                    for(Monster monster:monsters){
                        if(monster.samePos(aux)){
                            clone=true;
                            i--;
                            break;
                        }
                    }
                }
                else{
                    clone=true;
                    i--;
                }
            }
            if(!clone){
                monsters.add(aux);
            }
        }
        return monsters;
    }

    public boolean verifyMonsterCollisions(){
        for(Monster monster:monsters){
            if(Math.abs(monster.getPosition().getX()-hero.getPosition().getX())<=1 && Math.abs(monster.getPosition().getY()-hero.getPosition().getY())<=1){
                return true;
            }
        }
        return false;
    }
}
