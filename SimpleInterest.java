//Write a program in JAVA to enter P, T, R and calculate Simple Interest.   
//Sample Output:
//Calculate the Simple Interest :
//-----------------------------------
//Input the Principle: 20000
//Input the Rate of Interest: 10
//Input the Time: 1.5
//The Simple interest for the amount 20000 for 1 years @ 10 % is: 2000
 
import java.util.Scanner;
class SimpleInterest {
	public static void main(String args[]) {
		int p, r, t, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the Simple Interest:");
		System.out.println("-------------------------------------");
		System.out.print("Input the Principle:");
		p = sc.nextInt();
		System.out.print("Input the Rate of Interest:");
		r = sc.nextInt();
		System.out.print("Input the Time:");
		t = sc.nextInt();
		i = (p * r * t) / 100;
		System.out.println("The Simple interest for the amount " + p + " for " + t + " years at the rate " + r + " % is:" + i);
	}
}