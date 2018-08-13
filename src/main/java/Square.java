public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getPerimeter() {
        return 4*a;
    }

    public double getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
