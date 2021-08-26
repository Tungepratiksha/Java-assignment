// Write a program in JAVA to convert temperature in Fahrenheit to Kelvin.   
//Sample Output:
//Convert temperature in Fahrenheit to Kelvin :
//---------------------------------------------------
//Input the temperature in Fahrenheit : 80.33
//The temperature in Fahrenheit : 80.33
//The temperature in Kelvin : 300
 
import java.util.Scanner;
class FahrenheitToKelvinConversion {
	public static void main(String args[]) {
		Double kel, far;
		System.out.println("Convert temperature in Fahrenheit  to Kelvin:");
		System.out.println("-------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the temperature in Fahrenheit:");
		far = sc.nextDouble();
		kel = (5.0 / 9) * (far - 32) + 273.15;
		System.out.println("The temperature in Fahrenheit:" + far);
		System.out.println("The temperature in Kelvin:" + kel);
	}
}
