package PracticeExceptions;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (numerator): ");
        double numerator = scanner.nextDouble();
        
        System.out.print("Enter the second number (denominator): ");
        double denominator = scanner.nextDouble();
        
        try {
            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {            
            System.out.println("Error: " + e.getMessage());
        } 
    }

    public static double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2; 
    }
}
