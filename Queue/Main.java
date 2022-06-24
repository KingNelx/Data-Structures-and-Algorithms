package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main (String[]args){
        // a queue is not a class (it is an abstract)
        // offer (add) in the tail
        // poll to remove in the head
        // peek to view the top element
        // Linear data first in first out
        Queue<String> test = new LinkedList<>();

        System.out.println(test.isEmpty());

        test.offer("Jonel");
        test.offer("Tapia");
        test.offer("KingNel");
        test.offer("Invoking");

        System.out.println(test.size());
        System.out.println(test.peek());
        System.out.println(test.contains("Tapia"));
//        test.poll();
//        test.poll();
        System.out.println(test);
    }
}
