package masterchief.exception;

public final class EmptySaladException extends SaladException{
    public EmptySaladException(String saladName) {
        super(saladName);
    }

    public EmptySaladException(String message, String saladName) {
        super(message, saladName);
    }

    public EmptySaladException(String message, Throwable cause, String saladName) {
        super(message, cause, saladName);
    }
}
