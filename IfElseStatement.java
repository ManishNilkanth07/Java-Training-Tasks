import java.util.Scanner;

public class IfElseStatement {
    public static  void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);

        System.out.println("Welcome to voting eligibility system");
        System.out.println("Do you want to check your eligibility ? yes = 1 , no = 0");

        int response = sn.nextInt();

        if(response == 1)
        {
            System.out.println("enter you age here");
            int age = sn.nextInt();

            if(age > 17)
            {
                System.out.println("Congratulation !! you are eligible for voting.");
            }
            else if(age < 18)
            {
                System.out.println("Sorry you are not eligible for voting");
            }
        }
        else {
            System.out.println("Thank you for visiting!!");
        }
    }
}
