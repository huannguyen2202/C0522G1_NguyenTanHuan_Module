package ss6_inheritance.exercise.Point_and_moveablePoint.controller;

import ss6_inheritance.exercise.Point_and_moveablePoint.model.MoveablePoint;
import ss6_inheritance.exercise.Point_and_moveablePoint.model.Point;

import java.util.Arrays;

public class MainPointAndMoveablePoint {
    public static void main(String[] args) {
        Point point=new Point(2.0f,3.0f);
        System.out.println(point);

        float[] arr = point.getXY();
        System.out.println("XY= " + Arrays.toString(arr));

        MoveablePoint moveablePoint=new MoveablePoint(2.0f,3.0f,4.0f,5.0f);
        System.out.println(moveablePoint);

        MoveablePoint move = moveablePoint.move();
        System.out.println(move);
    }


}
