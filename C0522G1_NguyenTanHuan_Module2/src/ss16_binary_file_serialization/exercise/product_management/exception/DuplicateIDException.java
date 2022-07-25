package ss16_binary_file_serialization.exercise.product_management.exception;

public class DuplicateIDException extends Exception {
    public DuplicateIDException(String message) {
        super(message);
    }
}
