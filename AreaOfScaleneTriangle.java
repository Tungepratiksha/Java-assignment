
//Write a program in JAVA to find the area of Scalene Triangle.   
//Sample Output:
//Find the area of Scalene Triangle :
//----------------------------------------
//Input the length of a side of the triangle : 5
//Input the length of another side of the triangle : 6
//Input the angle between these sides of the triangle : 6
//The area of the Scalene Triangle is : 1.56793
 
import java.util.Scanner;
class AreaOfScaleneTrianlge {
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);	
    	double side1, side2, ang1, area;
		System.out.println("Find the area of Scalene Triangle :");
		System.out.println("----------------------------------");		
        System.out.print("Input the length of a side  of the triangle : ");
    	side1=sc.nextDouble();
        System.out.print("Input the length of another side  of the triangle : ");
    	side2=sc.nextDouble();
        System.out.print("Input the angle between these sides of the triangle :");
    	ang1=sc.nextDouble();	
		area = (side1 * side2 * Math.sin((Math.PI/180)*ang1))/2;
        System.out.println("The area of the Scalen Triangle is : "+area);
    }
    }