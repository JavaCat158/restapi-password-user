package netology.springboot_exception.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String s) {
        super(s);
    }
}
