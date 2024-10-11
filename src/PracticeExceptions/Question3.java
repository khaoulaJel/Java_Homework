package PracticeExceptions;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a number:");
		String input= scanner.nextLine();
		
		 try {
	            int number = Integer.parseInt(input);
	            System.out.println("The integer value is: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: The input is not a valid integer. Please enter numeric values only.");
	        }

}}
