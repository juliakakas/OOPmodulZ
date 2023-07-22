package Shape;

public class Rectangle implements ShapeIt{
    private double vertical;
    private double horizontal;

    Rectangle(double vertical, double horizontal){
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public double getVertical() {
        return vertical;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }

    public double getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public double perimeter() {
        return 2 * (vertical + horizontal) ;
    }

    @Override
    public double area() {
        return vertical * horizontal;
    }
}
