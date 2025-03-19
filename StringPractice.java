import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args)
    {
        Scanner cn = new Scanner(System.in);

        //Anagram check
        String str1 = "Hello how are you?";
        String str2 = "HELLO HOW ARE YOU?";

        char[] str1Arr = str1.toLowerCase().toCharArray();
        char[] str2Arr = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(Arrays.equals(str1Arr,str2Arr));

        // Splitting string based on white spaces

        String[] words = str1.split(" ");

        for(String str : words)
        {
            System.out.println(str);
        }

        //replace one character with another
        System.out.println(str2.replace('H','M'));

    }
}
