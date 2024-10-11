package PracticeCollections;
import java.util.ArrayList;
import java.util.Iterator;
public class Question1 {

	public static void main(String[] args) {
		ArrayList<String> stringlist= new ArrayList<>();
		stringlist.add("appla");
		stringlist.add("banana");
		stringlist.add("ananasa");
		stringlist.add("khoukha");
		stringlist.add("grapes");
		
		Iterator<String> iterator= stringlist.iterator();
        System.out.println("Iterating over the ArrayList:");
        while (iterator.hasNext()) {
        	String fruit= iterator.next();
        	System.out.println(fruit);
        }

	}

}
