package Shape;

public class Circle implements ShapeIt{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
