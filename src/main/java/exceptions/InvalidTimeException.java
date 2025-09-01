package exceptions;

public class InvalidTimeException extends RuntimeException {
    public InvalidTimeException(String message) {
        super("Hora de ficar no zoológico expirada!");
    }
}
