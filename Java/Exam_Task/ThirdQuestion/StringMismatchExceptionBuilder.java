package ThirdQuestion;

public class StringMismatchExceptionBuilder {
    private String message;

    public StringMismatchExceptionBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public StringMismatchException createStringMismatchException() {
        return new StringMismatchException(message);
    }
}