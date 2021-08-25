// Write a program in JAVA to calculate the volume of a cylinder.   
//Sample Output:
//Calculate the volume of a cylinder :
//-----------------------------------------
//Input the radius of the cylinder : 6
//Input the height of the cylinder : 8
//The volume of a cylinder is : 904.32
 
import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
    System.out.println("Calculate the volume of a cylinder:");
    System.out.println("----------------------------------");
      Scanner s= new Scanner(System.in);
        System.out.print("Input the radius of the cylinder:");
         double r=s.nextDouble();
         System.out.print("Input the height of the cylinder:");
         double h=s.nextDouble();
      double  volume=((22*r*r*h)/7);
  System.out.println("The volume of cylinder is: " +volume);
         }
}