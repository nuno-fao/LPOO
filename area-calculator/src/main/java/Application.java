public class Application {
    public static void main(String[] args) {
        AreaAggregator areaAggregator = new AreaAggregator();
        areaAggregator.addShape(new Circle(2.5));
        areaAggregator.addShape(new Square(2.5));
        areaAggregator.addShape(new Ellipse(1.5,1.5));
        areaAggregator.addShape(new Rectangle(3.5,1.5));
        areaAggregator.addShape(new Triangle(2.5,1.0));
        areaAggregator.addShape(new House(2.5,1.0, 4.5));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(areaAggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());
    }
}
