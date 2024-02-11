package netology.springboot_exception.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String s) {
        super(s);
    }
}
