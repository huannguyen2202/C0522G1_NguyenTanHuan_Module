package BTVN.exercise.vd_overide.module;

public class Cat extends Animal {
    public Cat() {
        super("cat");
    }

    @Override
    public void eat() {
        System.out.println("Tôi ăn cá");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo");
    }
}
