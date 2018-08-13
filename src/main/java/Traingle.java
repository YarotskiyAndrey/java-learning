import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Traingle implements Figure {
    private double a;
    private double b;
    private double c;

    public Traingle(double a, double b, double c) {
        this.a = min(a, min(b, c));
        this.c = max(a, max(b, c));
        this.b = max(min(a, b), min(b, c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getType() {
        String type;

        if (c * c < a * a + b * b) type = "Acute"; //Остроугольный
        else if (c * c > a * a + b * b) type = "Obtuse"; //Тупоугольный
        else type = "Right"; //Прямоугольный

        return type;
    }

    @Override
    public String toString() {
        return this.getType() + " traingle";
    }
}
