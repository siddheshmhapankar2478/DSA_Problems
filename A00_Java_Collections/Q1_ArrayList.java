package A00_Java_Collections;
import java.util.ArrayList;
public class Q1_ArrayList {
    public static void main(String[] args) {
        ArrayListExample();
    }
    public static void ArrayListExample() {
        //Declaration
        ArrayList<String> languages =new ArrayList<>();

        //Add elements to ArrayList
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("React");
        languages.add("Next");

        //Add newlist
        ArrayList<String> newList =new ArrayList<>();
        newList.add("Sanskrit");
        newList.add("English");
        newList.add("Marathi");
        languages.addAll(newList);
        System.out.println(languages);

        //get the element from the array list 
        String str=languages.get(1);

        //change the element of the arraylist
        languages.set(2,"MongoDb");
        System.out.println(languages);


        //remove element from index 2
        String removed=languages.remove(2);
        System.out.println(removed);

        //print all element of arraylist
        for(String language: languages){
            System.out.print(language);
        }
        System.out.println("ArrayList:"+languages);


        //checks if "Java" is present in the arraylist
        boolean ans=languages.contains("Java");
        System.out.println("containsJava"+ans);

        //find the position of 50 it returns -1 if not present
        int index=languages.indexOf(50);
        System.out.println("indexOf50 "+index);

        //get the number of elements of arraylist
        int size=languages.size();
        System.out.println("size "+size);
        
        //Empty the arraylist
        languages.clear();

        //checks if the ArrayList isempty
        boolean result=languages.isEmpty(); //false
        System.out.println("languages.isEmpty()"+result);
    }
}




