package PracticeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        Runnable arrayListTask = () -> {
            for (int i = 0; i < 100; i++) {
                arrayList.add(i);
            }
        };

        Runnable vectorTask = () -> {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }
        };

        Thread thread1 = new Thread(arrayListTask);
        Thread thread2 = new Thread(vectorTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Vector size: " + vector.size());
    }
}
