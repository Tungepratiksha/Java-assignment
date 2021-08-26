// Write a program in JAVA to convert temperature in Celsius to Kelvin.   
//Sample Output:
//Convert temperature in Celsius to Kelvin :
//---------------------------------------------------
//Input the temperature in Celsius : 26.85
//The temperature in Celsius : 26.85
//The temperature in Kelvin : 300
 
import java.util.Scanner;
class CelToKelConversion
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
	System.out.println("Convert temperature in Celsius to Kelvin:");
		System.out.println("---------------------------------------");
		Scanner sc=new Scanner(System.in);
    System.out.print("Input the temperature in Celsius : ");
    cel=sc.nextDouble();
    kel=(cel+273.15);
    System.out.println("The temperature in Celsius:" +cel);
    System.out.println("The temperature in Kelvin:" +kel);
}
} 