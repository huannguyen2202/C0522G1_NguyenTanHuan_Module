package ss5_static_method_property.practice.practice_static_property;

public class StaticProperty {
    private String name;

    private String engine;



    public static int numberOfCars;



    public StaticProperty(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
