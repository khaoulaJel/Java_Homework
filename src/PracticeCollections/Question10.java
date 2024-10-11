package PracticeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        synchronizedList.add(1);
        synchronizedList.add(2);
        synchronizedList.add(3);

        synchronized (synchronizedList) {
            for (Integer number : synchronizedList) {
                System.out.println(number);
            }
        }
    }
}
