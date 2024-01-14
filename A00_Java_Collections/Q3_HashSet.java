package A00_Java_Collections;
import java.util.HashSet;

public class Q3_HashSet {
    public static void main(String[] args) {
        HashSetExample();
    }
    public static void HashSetExample() {
        
        //Decleration
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

    }
}