package ss5_static_method_property.exercise.student;

public class Student {
    private String student = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String student) {
        this.student = student;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student='" + student + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

