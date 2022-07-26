package ss17_string_regex.exercise.validate_phone_number;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex="[(][\\d][\\d][)][-][(][0][\\d]{9}[)]";
        System.out.println("(84)-(0978489648)".matches(regex));
        System.out.println("(a8)-(22222222)".matches(regex));
    }

}
