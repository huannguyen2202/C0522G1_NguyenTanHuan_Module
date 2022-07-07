package ss5_static_method_property.exercise.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea());
        Circle circle1 = new Circle(2.0);
        System.out.println("radius: " + circle1.getRadius());
        System.out.println("area: " + circle1.getArea());

    }
}
