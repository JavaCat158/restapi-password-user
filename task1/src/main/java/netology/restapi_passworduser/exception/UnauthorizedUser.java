package netology.restapi_passworduser.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String s) {
        super(s);
    }
}
