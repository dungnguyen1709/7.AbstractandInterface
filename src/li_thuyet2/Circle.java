package li_thuyet2;

public class Circle extends Geometric  {

    private double radius;

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(" Day la hinh tron ");

    }

    @Override
    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;

    }
}
