package case_study.exception;

public class DuplicateIDException extends Throwable {
    public DuplicateIDException(String message){
        super(message);
    }

}
