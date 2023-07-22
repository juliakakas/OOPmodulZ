package Shape;

public class Square implements ShapeIt{
    private double length;

    Square(double length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
