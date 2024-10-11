package PracticeCollections;
import java.util.LinkedList;



class Queue {
    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }

    
    public void enqueue(int value) {
        list.addLast(value); 
        System.out.println("Enqueued: " + value);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int value = list.removeFirst(); 
        System.out.println("Dequeued: " + value);
        return value;
    }

    
    public boolean isEmpty() {
        return list.isEmpty();
    }

    
    public int size() {
        return list.size();
    }

    
    public void display() {
        System.out.println("Queue: " + list);
    }
}
public class Question3 {

	public static void main(String[] args) {
		Queue queue = new Queue();


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); 
        queue.display();
	}

}
