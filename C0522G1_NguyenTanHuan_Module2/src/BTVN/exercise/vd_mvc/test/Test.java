package BTVN.exercise.vd_mvc.test;

import BTVN.exercise.vd_mvc.model.CounterModel;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());
    }
}
