public class House implements HasArea {
    private double width;
    private double depth;
    private double height;

    public House(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*depth*height;
    }
}
