package PracticeExceptions;

class InvalidInputException extends Exception {
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Question10 {
    public static void main(String[] args) {
        try {
            parseInput("abc");
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause().getMessage());
        }
    }

    static void parseInput(String input) throws InvalidInputException {
        try {
            int value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input provided", e);
        }
    }
}
