//13. Write a program in JAVA to swap two numbers.   
//Sample Output:
//Swap two numbers :
//-----------------------
//Input 1st number : 25
//Input 2nd number : 39
//After swapping the 1st number is : 39
//After swapping the 2nd number is : 25
 
import java.util.*; 
public class Swapping
{
     public static void main(String []args)
     {
        System.out.println("Swap two numbers");
        System.out.println("---------------------");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:");
        int num2=sc.nextInt();
       int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the 1st number is :"+num1);
        System.out.println("After swapping the 2nd  number is:"+num2);
     }
}