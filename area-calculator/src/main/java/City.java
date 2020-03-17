import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider{
    private List<House> houses;

    public City() {
        houses = new ArrayList<>();
    }

    public City(List<House> houses) {
        this.houses = houses;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public double sum(){
        double out=0;
        for(House house:houses){
            out+=house.getArea();
        }
        return out;
    }
}
