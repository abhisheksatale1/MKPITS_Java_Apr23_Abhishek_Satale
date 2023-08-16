package ThirdQuestion;

class StringMismatchException extends Exception {

    private String message;

    public StringMismatchException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

