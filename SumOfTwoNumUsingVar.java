//Write a program in JAVA to print the sum of two numbers using variables.   
//Print the sum of two numbers :
//-----------------------------------
//The sum of 29 and 30 is : 59
 
import java.util.Scanner;
public class SumOfTwoNumUsingVar{
  public static void main(String[] args) 
  {
    int a=25;
    int b=35;
    int sum=a+b;
    System.out.println("Print the sum of two numbers:");
    System.out.println("---------------------------");
    Scanner input = new Scanner (System.in);
    System.out.println("The sum of  "   +a+ " and "+b + " is:"+ sum);
  }
    
}