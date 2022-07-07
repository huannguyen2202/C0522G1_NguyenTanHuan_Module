package ss5_static_method_property.exercise.student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Huan Nguyen");
        student.setClasses("C05");
        System.out.println(student);

    }
}
