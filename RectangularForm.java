//Write a program in JAVA to input a single digit number and print a rectangular form of 4 columns and 6 rows.   
//Sample Output:
//Make a rectangular shape by a single digit number :
//--------------------------------------------------------
//Input the number : 5
//5555
//5 5
//5 5
//5 5
//5 5
//5555

import java.util.Scanner;
 public class RectangularForm{
	public static void main(String[] args) 
	{
		System.out.println("Make a rectangular shape by a single digit number:");
		System.out.println("--------------------------------------");
		int num, i, j;
		int rows=6;
	    int columns=4;
		 Scanner sc = new Scanner(System.in);
		System.out.print("Input the number : ");
		num = sc.nextInt();	
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <=columns; j++)
			{
				System.out.print(num); 
			}
			System.out.print("\n"); 
		}	
	}
}