
 //Write a program in JAVA to find the Area and Perimeter of a Rectangle.   
//Sample Output:
//Find the Area and Perimeter of a Rectangle :
//-------------------------------------------------
//Input the length of the rectangle : 10
//Input the width of the rectangle : 15
//The perimeter of the rectangle is :50
//The area of the rectangle is : 150
import java.util.Scanner;
public class Area_PerimeterOfRect
{
 
    public static void main(String[] args) 
    {
        System.out.println("Find the Area and Perimeter of a Rectangle");
        System.out.println("--------------------------");
        int l, w, perimeter,area;
         
        Scanner s = new Scanner(System.in);
        System.out.print("Input length of rectangle:");
        l = s.nextInt();
        System.out.print("Input width of rectangle:");
        w= s.nextInt();
        perimeter = 2 * (l + w);
        System.out.println("The perimeter of rectangle is:"+perimeter);
        area = l * w;
        System.out.println("The area of rectangle is:" +area);
    }
} 