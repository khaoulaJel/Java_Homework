package PracticeExceptions;

public class Question6 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        throw new RuntimeException("Exception in innermost method");
    }
}
