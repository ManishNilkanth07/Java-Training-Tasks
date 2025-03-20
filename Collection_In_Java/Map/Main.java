package Collection_In_Java.Map;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //HashMap
        Map<String,Integer> iccTrophy = new HashMap<>();

        iccTrophy.put("Australia",10);
        iccTrophy.put("India", 7);
        iccTrophy.put("West Indies", 5);
        iccTrophy.put("Pakistan",3);
        iccTrophy.put("Sri Lanka",3);
        iccTrophy.put("England", 3);
        iccTrophy.put("New Zealand",2);
        iccTrophy.put("South Africa",1);

        for(Map.Entry<String ,Integer> data : iccTrophy.entrySet())
        {
            System.out.println(data.getKey() + " = "+ data.getValue());
        }

        //LinkedHashMap maintains insertion order
        Map<String,Integer> iccTrophy1 = new LinkedHashMap<>(iccTrophy);

        for(Map.Entry<String ,Integer> data : iccTrophy1.entrySet())
        {
            System.out.println(data.getKey() + " = "+ data.getValue());
        }

        System.out.println(iccTrophy1.containsKey("India"));
        System.out.println(iccTrophy1.containsValue(10));


        //TreeMap contains sorted values ordered by key
        Map<String,Integer> iccTrophy2 = new TreeMap<>(iccTrophy);

        for(Map.Entry<String ,Integer> data : iccTrophy2.entrySet())
        {
            System.out.println(data.getKey() + " = "+ data.getValue());
        }

    }
}

