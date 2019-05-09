package masterchief.exception;

public class SaladAlreadyExistException extends SaladException {
    public SaladAlreadyExistException(String saladName) {
        super(saladName);
    }

    public SaladAlreadyExistException(String message, String saladName) {
        super(message, saladName);
    }

    public SaladAlreadyExistException(String message, Throwable cause, String saladName) {
        super(message, cause, saladName);
    }
}
