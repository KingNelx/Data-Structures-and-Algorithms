package Stacks;
import java.util.Stack;

public class Main {
    public static void main (String[]args){
        // stack = LIFO last in first out
        // push to add to the top
        // pop to remove from the top
        // sort data as a vertical tower

        Stack<String> stack = new Stack<>();

        stack.push("Invoker");
        stack.push("Shadow Fiend");
        stack.push(" Tinker");
        stack.push("Void Spirit");

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.empty());

    }
}
