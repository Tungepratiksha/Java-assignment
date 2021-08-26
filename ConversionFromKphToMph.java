//Write a program in JAVA that converts kilometers per hour to miles per hour.   
//Sample Output:
//Convert kilometers per hour to miles per hour :
//----------------------------------------------------
//Input the distance in kilometer : 5
//The 5 Km./hr. means 3.10686 Miles/hr.
 
import java.util.Scanner;
class ConversionFromKphToMph {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double kmph, miph;
		System.out.println("Convert kilometers per hour to miles per hour:");
		System.out.println("-------------------------------------");
		System.out.print("Input the distance in kilometer:");
		kmph = sc.nextFloat();
		miph = (kmph * 0.6213712);
		System.out.println("The " + kmph + " Km./hr. means " + miph + " Miles/hr.");
	}
}
