//Write a program in JAVA to print the area of a polygon.   
//Sample Output:
//Print the area of a polygon:
//---------------------------------
//Input the number of sides of the polygon: 7
//Input the length of each side of the polygon: 6
//The area of the polygon is: 130.821
 
import java.util.Scanner;
class AreaOfPolygon {
	public static void main(String args[]) {
		double area, s, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the area of a polygon:");
		System.out.println("-------------------------------------");
		System.out.print("Input the number of sides of the polygon:");
		n = sc.nextDouble();
		System.out.print("Input the length of each side of the polygon:");
		s = sc.nextDouble();
		area = (n * (s * s)) / (4.0 * Math.tan((Math.PI / n)));
		System.out.print("The area of the ploygon is:" + area);
	}
}
