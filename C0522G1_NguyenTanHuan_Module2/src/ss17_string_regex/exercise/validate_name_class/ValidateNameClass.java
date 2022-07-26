package ss17_string_regex.exercise.validate_name_class;

public class ValidateNameClass {
    public static void main(String[] args) {
        String regex= "[CAP][0-9]{4}[GHIKLM]";
        System.out.println("C0318G".matches(regex));
        System.out.println("M0318G".matches(regex));
        System.out.println("P0323A".matches(regex));
    }
}
