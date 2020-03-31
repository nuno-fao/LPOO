package com.aor.refactoring.example2;

public class Shape {
    private Shape2D object;

    public Shape(double x, double y, double width, double height) {
        object= new Rectangle(x,y,width,height);
    }

    public Shape(double x, double y, double radius) {
        object = new Circle(x,y,radius);
    }

    public double getArea() throws Exception {
        return object.getArea();
    }

    public double getPerimeter() throws Exception {
        return object.getPerimeter();
    }

    public void draw(GraphicFramework graphics) {
        object.draw(graphics);
    }
}
