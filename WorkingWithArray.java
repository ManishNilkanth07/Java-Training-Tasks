import java.util.Scanner;

public class WorkingWithArray {
    public static int linearSearch(int[] arr,int value)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int value)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        while(start < end)
        {
            if(arr[mid] == value)
            {
                return mid;
            }
            if(arr[mid] > value)
            {
                start = mid + 1;
            }
            else
            {
               end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }

     public static void main(String[] args)
     {
         Scanner cn = new Scanner(System.in);

         int[] arr = new int[5];

         System.out.println("enter array values");
         //value initialization in array
         for(int i = 0; i < arr.length; i++)
         {
             arr[i] = cn.nextInt();
         }

         //traversing array
         for(int i = 0; i < arr.length; i++)
         {
             System.out.print(arr[i] + " ");
         }
         System.out.println("\n enter any value for linear search");
         int num = cn.nextInt();
         int valueIndex = linearSearch(arr,num);

         if(valueIndex > 0)
         {
             System.out.println("Value is present at index " + valueIndex);
         }
         else
         {
             System.out.println("Value is not present in array.");
         }
         System.out.println("\n Enter another value for binary search");
         num = cn.nextInt();
         valueIndex = linearSearch(arr,num);

         if(valueIndex > 0)
         {
             System.out.println("Value is present at index " + valueIndex);
         }
         else
         {
             System.out.println("Value is not present in array.");
         }
     }
}