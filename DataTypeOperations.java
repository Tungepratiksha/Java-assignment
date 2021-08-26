// Write a program in JAVA to display various type or arithmetic operation using mixed data type.   
//Sample output:
//Display arithmetic operations with mixed data type :
//---------------------------------------------------------
//5 + 7 = 12
//3.7 + 8.0 = 11.7
//5 + 8.0 = 13.0
//5 - 7 = -2
//3.7 - 8.0 = -4.3
//5 - 8.0 = -3.0
//5 * 7 = 35
//3.7 * 8.0 = 29.6
//5 * 8.0 = 40.0
//5 / 7 = 0
//3.7 / 8.0 = 0.5
//5 / 8.0 = 0.6
 
import java.util.*;
class DataTypeOperations { 
public static void main (String[] args)
{
int M1=7,M2=9;
double D1= 4.5 , D2=9.0;
System.out.println("Display arithmetic operations with mixed data type:" );
System.out.println(" ..................................................");
System.out.println("7+9= "+(M1+M2));
System.out.println("4.5+9.0= "+(D1+D2));
System.out.println("7+9.0=" +(M1+D2));
System.out.println("7-9= "+(M1-M2));
System.out.println("4.5-9.0= "+(D1-D2));
System.out.println("7-9.0=" +(M1-D2));
System.out.println("7*9= "+(M1*M2) );
System.out.println("4.5*9.0= "+(D1*D2));
System.out.println("7*9.0=" +(M1*D2));
System.out.println("7/9= "+(M1/M2));
System.out.println("4.5/9.0= "+(D1/D2));
System.out.println("7/9.0=" +(M1/D2));
}
}