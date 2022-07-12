package BTVN.exercise.vd_overload.controller;

import BTVN.exercise.vd_overload.module.MyMath;

public class Test {
    public static void main(String[] args) {
        MyMath myMath= new MyMath();
        System.out.println("min của(6 ,5): "+ myMath.timMin(6,5));
        System.out.println("min của (5.5, 6.6): "+ myMath.timMin(5.5,6.6));
        System.out.println("Tong của (6,5): "+ myMath.tinhTong(6,5));
        double arr[]=new double[]{1,2,3,4,5};
        System.out.println("Tong cua (arr)= "+ myMath.tinhTong(arr));
    }
}
