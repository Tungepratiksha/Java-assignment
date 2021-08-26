//Write a program in JAVA to print the code (ASCII code / Unicode code etc.) of a given character.   
//Sample Output:
//Print code (ASCII code / Unicode code etc.) of a given character:
//-----------------------------------------------------------------------
//Input a character: a
//The ASCII value of a is: 97
//The character for the ASCII value 97 is: a
 
import java.util.Scanner;
class ASCIICode{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch; 
	System.out.println("Print code (ASCII code / Unicode code etc.) of a  given character:");
	System.out.println("-------------------------------------");
 	System.out.print("Input a character:");
 	  ch=sc.next().charAt(0);	
 	  System.out.println("The ASCII value of "+ch+" is: " +(int)ch); 
  System.out.println("The character for the ASCII value "+(int)ch+" is:"+(char)((int)ch) ); 
}
}
