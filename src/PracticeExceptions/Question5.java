package PracticeExceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        File file = new File("nonexistent.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
