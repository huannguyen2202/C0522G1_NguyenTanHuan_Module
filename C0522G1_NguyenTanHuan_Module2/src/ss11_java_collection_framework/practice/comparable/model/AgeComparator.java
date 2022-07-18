package ss11_java_collection_framework.practice.comparable.model;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Student> thenComparing(Comparator<? super Student> other) {
        return Comparator.super.thenComparing(other);
    }
}
