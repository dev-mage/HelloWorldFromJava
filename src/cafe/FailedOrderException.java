package cafe;

public class FailedOrderException extends Exception {
    public FailedOrderException(String message) {
        super(message);
    }
}
