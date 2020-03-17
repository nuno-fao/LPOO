public class Ellipse implements AreaShape{
    private double xRad;
    private double yRad;

    public Ellipse(double xRad, double yRad) {
        this.xRad = xRad;
        this.yRad = yRad;
    }

    public double getXRad() {
        return xRad;
    }

    public void setXRad(double xRad) {
        this.xRad = xRad;
    }

    public double getYRad() {
        return yRad;
    }

    public void setYRad(double yRad) {
        this.yRad = yRad;
    }

    @Override
    public double getArea() {
        return Math.PI*xRad*yRad;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse\n");
    }
}
