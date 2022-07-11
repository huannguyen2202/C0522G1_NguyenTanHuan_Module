package ss7_abstract_lass_interface.exercise.exercise_1.controller;

import ss7_abstract_lass_interface.exercise.exercise_1.module.*;

public class mainController {
    public static void main(String[] args) {
      Shape[] shapes =new Shape[3];
      shapes[0]= new Circle(5.0);
      shapes[1]=new Rectangle(3.0,4.0);
      shapes[2]=new Square(2);

      for (Shape shape: shapes){
          System.out.println(shape);
      }
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Pre-resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }

        System.out.println("\npercent: " + percent + "%\n");

        System.out.println("After-resize: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }
    }
}
