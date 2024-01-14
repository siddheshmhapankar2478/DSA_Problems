package A00_Java_Collections;
import java.util.HashMap;

public class Q2_HashMap {
    public static void main(String[] args) {
        HashMapExample();
    }
    public static void HashMapExample() {
        // Declaration
        HashMap<Integer,String> languages = new HashMap<>();

        // add elements to hashmap
        languages.put(1,"Java");
        languages.put(2,"Javascript");
        languages.put(3,"React");


        // get() method to get value
        String value = languages.get(1);
        System.out.println("value"+value);

        // change element with key 2
        languages.replace(2, "C++");

        // remove element associated with key 2
        String removed = languages.remove(2);
        System.out.println("removed"+removed);

        // check if key Domain is present
        System.out.println("contains Domain "+languages.containsKey(3));

        // check if value Java is present
        System.out.println("contains value Java "+languages.containsValue("Java"));


        // return set view of keys  using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        System.out.println("HashMap: " + languages);

        // get the number of keys/values from HashMap
        int size = languages.size();
        System.out.println("size "+size);

        // remove all mappings from HashMap
        languages.clear();

        // checks if the HashMap is empty
        boolean result = languages.isEmpty();  // false
        System.out.println("isempty"+result);
    }
}
