package masterchief.exception;

public abstract class SaladException extends RuntimeException{

    private static final String MESSAGE_TEMPLATE = "Salad \"%s\" has problems: %s";

    private String saladName;

    public SaladException(String saladName) {
        this.saladName = saladName;
    }

    public SaladException(String message, String saladName) {
        super(message);
        this.saladName = saladName;
    }

    public SaladException(String message, Throwable cause, String saladName) {
        super(message, cause);
        this.saladName = saladName;
    }

    @Override
    public String getMessage() {
        return String.format(MESSAGE_TEMPLATE, saladName, super.getMessage());
    }

    public String getSaladName() {
        return saladName;
    }
}
