package PracticeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");

        List<String> destinationList = new ArrayList<>(Collections.nCopies(sourceList.size(), ""));
        Collections.copy(destinationList, sourceList);

        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List: " + destinationList);
    }
}
