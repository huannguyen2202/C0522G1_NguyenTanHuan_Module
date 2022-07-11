package ss7_abstract_lass_interface.practice.animal_and_interface_dible.module;

public class Chicken extends Animal implements Edible  {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
