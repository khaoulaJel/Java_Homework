package PracticeExceptions;

public class Question9 {
    public static void main(String[] args) {
        try {
            checkPositive(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.println("Number is: " + number);
    }
}
