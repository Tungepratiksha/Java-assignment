// Write a program in JAVA to print the result of the specified operations.   
//Sample Output:
//Print the result of some specific operation :
//--------------------------------------------------
//Result of 1st expression is : 23
//Result of 2nd expression is : 5
//Result of 3rd expression is : 12
//Result of 4th expression is : 3
 
  public class Main {
 
 public static void main(String[] args) {
  System.out.println("Print the result of some specific operation:");
  System.out.println("--------------------------------------");
  System.out.println( "Result of 1st expression is:" +(-1+8*3));
  System.out.println( "Result of 2nd expression is:"+(30+5) %4);
  System.out.println("Result of 3rd expression is:"+(20 + 4*5 / 8));
  System.out.println("Result of 4th expression is:"+(3+ 15 / 3 * 3 - 8 % 2));
 }
}