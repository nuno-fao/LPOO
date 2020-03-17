public class House implements HasArea {
    private double width;
    private double depth;

    public House(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }


    @Override
    public double getArea() {
        return width*depth;
    }
}
