package Collection_In_Java.List;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //ArrayList
        List<String> city = new ArrayList<>();

        city.add("Khandwa");
        city.add("Khargon");
        city.add("Indore");
        city.add("Dewas");

        city.remove(1);

        System.out.println(city.contains("Indore"));

        //LinkedList
        List<String> city1 = new LinkedList<>(city);

        city1.add("Punasha");

        city1.remove(2);
        System.out.println(city1.get(2));

        //Vector
        Vector<String> city3 = new Vector<>(city);
        city3.add("Ramgad");

        System.out.println(city3.contains("Ramgad"));

        //Stack
        Stack<String> city4 = new Stack<>();
        city4.push("Ramgad");
        city4.push("Solapur");
        city4.push("Indore");

        System.out.println(city4.peek());
        city4.pop();
        System.out.println(city4.peek());



    }
}
