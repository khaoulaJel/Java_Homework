package PracticeExceptions;

public class Question7 {
    public static void main(String[] args) {
        String str = null;
        int num = 5;

        try {
            System.out.println(str.length());
            int result = num / 0;
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
