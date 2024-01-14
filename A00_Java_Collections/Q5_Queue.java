package A00_Java_Collections;
import java.util.Queue;
import java.util.LinkedList;


public class Q5_Queue {
    public static void main(String[] args) {
        QueueExample();
    }
    public static void QueueExample(){
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        //Print all elements of Queue
        System.out.println("Updated Queue: " + numbers);

        //To empty queue
        numbers.clear();

        //isEmpty
        boolean res=numbers.isEmpty();
        System.out.println("is Queue empty: " + res);

    }
}
