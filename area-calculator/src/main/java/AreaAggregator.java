import java.util.ArrayList;
import java.util.List;

public class AreaAggregator implements SumProvider{
    private List<HasArea> areaShapes = new ArrayList<>();

    public void addShape(HasArea shape) {
        areaShapes.add(shape);
    }

    public double sum() {
        double sum = 0;
        for (HasArea shape: areaShapes) {
            sum+=shape.getArea();
        }
        return sum;
    }



}
