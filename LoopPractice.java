import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scanner.nextInt();

        //triangle creation using stars
        for(int i = 1; i<= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Mirror Triangle creation using stars
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= num; j++)
            {
                if(j <= num-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //pyramid creation using stars
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= num; j++)
            {
                if(j <= num - i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            for(int k = 1; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //diamond creation using stars
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= num; j++)
            {
                if(j <= num - i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int k = 1; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num; i >=1; i--)
        {
            for(int j = 1; j <= num; j++)
            {
                if(j <= num - i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int k = 1; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
