//Write a JAVA program to read seven numbers and sorts them in descending order.

import java.util.Scanner;
public class DescendingOrderOfNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 7;
        int arr[] = new int[n];
        
        System.out.println("Enter the seven numbers:");
        for (int i = 0; i < n; i++)
         {
            arr[i] = in.nextInt();
         }
        for (int i = 0; i < n - 1; i++)
         {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] < arr[j + 1])
                 {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            } 
        }
        
        System.out.println("Descending order of entered number is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}