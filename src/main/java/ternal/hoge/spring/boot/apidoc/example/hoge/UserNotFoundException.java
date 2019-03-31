package ternal.hoge.spring.boot.apidoc.example.hoge;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
