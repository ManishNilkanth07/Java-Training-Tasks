package Collection_In_Java.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        //Priority queue uses min heap data structure to set priority
        Queue<String> name = new PriorityQueue<>();
        name.offer("Rahul");
        name.offer("Rohan");
        name.offer("Ram");
        name.offer("Rinku");

        name.poll();
        System.out.println(name.peek());

        //ArrayDeque
        Deque<String > name1 = new ArrayDeque<>();
        name1.offerFirst("Rahul");
        name1.offerFirst("Rohan");
        name1.offerLast("Ram");
        name1.offerLast("Rinku");

        name1.pollFirst();
        name1.pollLast();

    }
}
