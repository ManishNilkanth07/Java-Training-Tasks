package ExceptionHandling;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args)
    {
        Scanner cn = new Scanner(System.in);

        try (cn) {
            System.out.println("Enter any number");
            int num = cn.nextInt();
            System.out.println("Enter another number");
            int num2 = cn.nextInt();

            // Code that may throw an exception
            int ans = num / num2;
            System.out.println("Answer: " + ans);

        } catch (ArithmeticException e) {

            // Handling the exception
            System.out.println(
                    "Error: Division by zero is not allowed!");
        } finally {
            //Program continues after handling the exception
            System.out.println("scanner has been closed");
        }
    }
}
