package PracticeExceptions;

public class Question2 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
 
        
        try {
            int index = Integer.parseInt("5");
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Please provide a valid index.");
        }
    }
}
