package netology.restapi_passworduser.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String s) {
        super(s);
    }
}
