//Write a program in JAVA to find the third angle of a triangle.   
//Sample Output:
//Find the third angle of a triangle :
//-----------------------------------------
//Input the 1st angle of the triangle : 30
//Input the 2nd angle of the triangle : 60
//The 3rd of the triangle is : 90
import java.util.Scanner;
public class FindThirdAngle {
public static void main(String[] args)
    {
    	System.out.println("Find the third angle of a triangle:");
    	System.out.println("- - - - - - - - - - - - - - - - - ");
    	Scanner in = new Scanner(System.in);

        System.out.print("Input  the 1st angle of the triangle:");
        int p=in.nextInt();
        System.out.print("Input the 2nd angle of the triangle:");

        
        int q = in.nextInt();
        int r;
        r = 180 - (p + q);
         System.out.println("The 3rd  angle of the triangle is: " + r + "\n");
    }
} 