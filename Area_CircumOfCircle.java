
//Write a program in JAVA to find the area and circumference of a circle.   
//Sample Output:
//Find the area and circumference of any circle :
//----------------------------------------------------
//Input the radius(1/2 of diameter) of a circle : 5
//The area of the circle is : 78.5397
//The circumference of the circle is : 31.4159
 
import java.util.Scanner;

public class Area_CircumOfCircle
{
    public static void main(String args[])
    {
        System.out.println("Find the area and circumference of any circle:");
        System.out.println("------------------------------------------");
        float r;
        double area, circum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input Radius(1/2 of diameter)of a circle : ");
        r = scan.nextFloat();
		
        area = 3.14*r*r;
        circum = 2*3.14*r;
		
        System.out.print("The area of the circle is: " +area);
		
        System.out.print("\nThe circumference of the circle is:" +circum);
    }
}
