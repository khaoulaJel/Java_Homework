package PracticeCollections;
import java.util.HashMap;
public class Question2 {

	public static void main(String[] args) {
		 String inputString = "hello world";
		 HashMap<Character,Integer> frequencyMap= new HashMap<>();
		 
		 for (char c: inputString.toCharArray()) {
			 if (frequencyMap.containsKey(c)) {
				 frequencyMap.put(c, frequencyMap.get(c)+1);
			 }
			 else {
				 frequencyMap.put(c, 1);
			 }
		 }
		 
		 System.out.println("character frequencies:");
		 for (char c : frequencyMap.keySet()) {
			 System.out.println(c + ": " + frequencyMap.get(c));
		 }
	}

}
