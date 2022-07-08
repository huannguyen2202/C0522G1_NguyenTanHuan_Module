package ss6_inheritance.exercise.point_2d.controller;

import ss6_inheritance.exercise.point_2d.model.Point2D;
import ss6_inheritance.exercise.point_2d.model.Point3D;

import java.util.Arrays;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D(3.0f, 5.0f);
        System.out.println(point2D1);
        float[] arr = point2D1.getXY();
        System.out.println("XY= " + Arrays.toString(arr));


        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(2f, 3f, 4f);
        System.out.println(point3D1);

        float[] arr1 = point3D1.getXYZ();
        System.out.println("XYZ= "+Arrays.toString(arr1));
    }
}
