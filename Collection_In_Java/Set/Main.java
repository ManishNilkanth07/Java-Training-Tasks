package Collection_In_Java.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        //HashSet unique and unordered
        Set<Integer> tokenNum = new HashSet<>();
        tokenNum.add(20);
        tokenNum.add(30);
        tokenNum.add(40);
        tokenNum.add(50);
        tokenNum.add(60);

        tokenNum.remove(20);
        System.out.println(tokenNum.contains(30));
        System.out.println(tokenNum.isEmpty());

        //LinkedHashSet maintains the insertion order
        Set<Integer> tokenNum2 = new LinkedHashSet<>();

        tokenNum2.add(20);
        tokenNum2.add(30);
        tokenNum2.add(40);
        tokenNum2.add(50);
        tokenNum2.add(70);
        tokenNum2.add(60);

        tokenNum2.stream().forEach(i-> System.out.println(i));

        //TreeSet contains sorted and unique values
        Set<Integer> tokenNum3 = new TreeSet<>(tokenNum2);

        tokenNum3.stream().forEach(i-> System.out.println(i));
        System.out.println(tokenNum3.contains(70));
    }
}
