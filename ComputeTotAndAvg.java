// Write a program in JAVA to compute the total and average of four numbers.   
//Sample Output:
//Compute the total and average of four numbers :
//----------------------------------------------------
//Input 1st two numbers (separated by space) : 25 20
//Input last two numbers (separated by space) : 15 25
//The total of four numbers is : 85
//The average of four numbers is : 21.25
 
import java.util.Scanner;
public class ComputeTotAndAvg{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1,n2,n3,n4;
        int total;
        float avg;
        

        System.out.println("Compute  the total and average of four numbers:");
        System.out.println("- - - - - - - - - - - -- - - - - - - - - - - - ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Input 1st two numbers(seperated by space):");
        n1= in.nextInt();
        n2=in.nextInt();
        System.out.print("Input last two numbers(seperated by space):");
        n3 = in.nextInt();
        n4=in.nextInt();

       
        total=n1+n2+n3+n4;

       
        avg=total/4;

        System.out.println("The total of the number is: " + total);
        System.out.println("The average of the number is: " + avg);
    }
} 