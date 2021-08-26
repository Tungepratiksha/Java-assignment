// Write a program in JAVA to enter two angles of a triangle and find the third angle.   
//Sample Output:
//Find the third angle of a triangle :
//-----------------------------------------
//Input the 1st angle of the triangle : 35
//Input the 2nd angle of the triangle : 35
//The 3rd of the triangle is : 110
 
import java.util.Scanner;
class AnglesOfTriangle {
	public static void main(String args[]) {
		float ang1, ang2, ang3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the third angle of a triangle:");
		System.out.println("-------------------------------------");
		System.out.print("Input the 1st angle of the triangle:");
		ang1 = sc.nextFloat();
		System.out.print("Input the 2nd angle of the triangle:");
		ang2 = sc.nextFloat();
		ang3 = 180 - (ang1 + ang2);
		System.out.println("The 3rd of the triangle is:" + ang3);
	}
}
