public class Circle implements Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}

