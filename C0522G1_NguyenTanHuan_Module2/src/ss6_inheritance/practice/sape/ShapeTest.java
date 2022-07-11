package ss6_inheritance.practice.sape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shapes = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shapes);

        shapes= new Shape("red", false) {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shapes);
    }
}
