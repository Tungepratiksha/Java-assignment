//Write a program in JAVA to check whether a number is positive, negative or zero.   
//Sample Output:
//Check whether a number is positive, negative or zero :
//-----------------------------------------------------------
//Input a number : 8
//The entered number is positive.
 
import java.util.*;
 
class PosNegZeroChecking
{
    public static void main(String []s)
    {
       System.out.println("Check whether a number is positive, negative or zero:");
       System.out.println("---------------------------------------------");
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number: ");
        num=sc.nextInt();
        if(num>0)
            System.out.println("The entered number is positive ." +num);
        else if(num<0)
            System.out.println("The entered number is negative "+num);
        else
            System.out.println("The enterd number is  zero");
         
    }
}
