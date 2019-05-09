package masterchief.exception;

public class MissingProteinInfoException extends SaladException {
    public MissingProteinInfoException(String saladName) {
        super(saladName);
    }

    public MissingProteinInfoException(String message, String saladName) {
        super(message, saladName);
    }

    public MissingProteinInfoException(String message, Throwable cause, String saladName) {
        super(message, cause, saladName);
    }
}
