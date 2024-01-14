package A00_Java_Collections;
import java.util.Stack;
public class Q4_Stack {
    public static void main(String[] args) {
        StackExample();
    }
    public static void StackExample() {
        
        // Create String type stack
        Stack<Integer> stack = new Stack<>();

        // Add elements to Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Remove element stacks
        int element = stack.pop();
        System.out.println("Removed Element: " + element);

        // Access element from the top
        int topElement = stack.peek();
        System.out.println("Element at top: " + topElement);

        //Print all elements of stack
        System.out.println("Stack: " + stack);

        // Search an element
        int position = stack.search(10);
        System.out.println("Position of 10: " + position);//4

        // remove all elements from the stack
        stack.clear();

        // Check if stack is empty
        boolean result = stack.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
