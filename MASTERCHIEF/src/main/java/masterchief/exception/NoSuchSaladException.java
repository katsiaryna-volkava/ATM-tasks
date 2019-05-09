package masterchief.exception;

public final class NoSuchSaladException extends SaladException {
    public NoSuchSaladException(String saladName) {
        super(saladName);
    }

    public NoSuchSaladException(String message, String saladName) {
        super(message, saladName);
    }

    public NoSuchSaladException(String message, Throwable cause, String saladName) {
        super(message, cause, saladName);
    }
}
