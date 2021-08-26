//Write a program in JAVA to convert temperature in Fahrenheit to Celsius.   
//Sample Output:
//Convert temperature in Fahrenheit to Celsius:
//---------------------------------------------------
//Input the temperature in Fahrenheit : 95
//The temperature in Fahrenheit : 95
//The temperature in Celsius : 35
 
import java.util.*;
 
class FahToCelConversion
{
 public static void main(String args[])
 {
 	System.out.println("Convert temperature in Fahrenheit to Celsius:");
 	System.out.println("- - - - - - -  - - - - - - - - - - - - - ");
 int celsius,fahrenheit;
 Scanner sc = new Scanner(System.in);
     // Reads temperature in fahrenheit
 System.out.print("Input temperature in Fahrenheit :");
     fahrenheit=sc.nextInt();
     System.out.println("The temperature in Fahrenheit:" +fahrenheit);
     celsius=(fahrenheit - 32)*5/9;
     
     System.out.println("The temperature in Celsius:"+celsius);
 }
}