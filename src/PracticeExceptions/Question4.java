package PracticeExceptions;
import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid age. Age must be between 0 and 120.");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}


public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            if (age < 0 || age > 120) {
                throw new InvalidAgeException(); 
            }

            System.out.println("Your age is " + age + ".");
        } catch (InvalidAgeException ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
    }
}
