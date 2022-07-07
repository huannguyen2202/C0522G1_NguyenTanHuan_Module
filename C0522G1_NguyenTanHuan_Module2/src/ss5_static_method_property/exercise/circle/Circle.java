package ss5_static_method_property.exercise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected Circle() {
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
