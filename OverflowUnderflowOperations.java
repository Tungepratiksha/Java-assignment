//Write a program in JAVA to check overflow/underflow during various arithmetical operation.   
//Sample Output:
//Check overflow/underflow during various arithmetical operation :
//Range of int is [-2147483648, 2147483647]
//---------------------------------------------------------------------
//Overflow the integer range and set in minimum range : -2147483648
//Increasing from its minimum range : -2147483647
//Product is :1
//Underflow the range and set in maximum range : 2147483647
//Decreasing from its maximum range : 2147483646
//Product is : 0

class OverflowUnderflowOperations{ 
public static void main (String[] args)
{
System.out.println("Check overflow/underflow during various arithmetical operation :");
System.out.println("Range of int is [-2147483648, 2147483647]"); 
 System.out.println("---------------------------------------------------------------------"); 
int n1 = 2147483647;
System.out.println("Overflow the integer range and set in minimum range : "+(n1+1) );
System.out.println("Increasing from its minimum range : " +( n1 + 2)); 
System.out.println("Product is :" + (n1 * n1 ));
 int n2 = -2147483648; 
System.out.println("Underflow the range and set in maximum range : " +( n2 - 1)); 
 System.out.println("Decreasing from its maximum range : " +( n2 - 2));
System.out.println("Product is : " +( n2 * n2)); 
}
}