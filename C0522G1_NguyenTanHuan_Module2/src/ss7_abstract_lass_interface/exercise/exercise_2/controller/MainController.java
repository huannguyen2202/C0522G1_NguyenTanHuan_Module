package ss7_abstract_lass_interface.exercise.exercise_2.controller;


import ss7_abstract_lass_interface.exercise.exercise_2.module.Circle;
import ss7_abstract_lass_interface.exercise.exercise_2.module.Rectangle;
import ss7_abstract_lass_interface.exercise.exercise_2.module.Shape;
import ss7_abstract_lass_interface.exercise.exercise_2.module.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[3];
        shapes[0]= new Circle(5.0);
        shapes[1]=new Rectangle(3.0,4.0);
        shapes[2]=new Square(2);
        for (Shape shape:shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }

    }
}
