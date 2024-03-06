package this_is_java.ch11.ex4;

public class InsufficientException extends Exception{
    public InsufficientException() {
        super();
    }

    public InsufficientException(String message) {
        super(message);
    }
}
