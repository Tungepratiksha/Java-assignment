//Write a program in JAVA to test the Type Casting.   
//Sample Output:
//Formatting the output using type casting:
//----------------------------------------------
//Print floating-point number in fixed format with 1 decimal place:
//Test explicit type casting :
//0
//0.5
//0.5
//0.0
//Test implicit type casting :
//0
//0
//int implicitly casts to double:
//4.0
//double truncates to int!:
//6
public class TestTypeCasting{
	public static void main(String[] args) {
	

    System.out.println("Formatting the output using type casting");
	System.out.println( "----------------------------------------------"); 
	System.out.println( "Print floating-point number in fixed format with 1 decimal place: ");
   
 System.out.println("Test explicit type casting :");
   int i1 = 4, i2 = 8;
   System.out.println(  i1 / i2 );    
   System.out.println( (double)i1 / i2 ); 
   System.out.println(  i1 / (double)i2 );  
   System.out.println(  (double)(i1 / i2) );
 
   double d1 = 5.5, d2 = 6.6;
System.out.println( "\nTest implicit type casting :\n") ;  
   System.out.println(  (int)d1 / i2 );    
   System.out.println(  (int)(d1 / i2) );   
    System.out.println( "\nint implicitly casts to double: \n");
   d1 = i1;    
   System.out.println(  d1);
    System.out.println("double truncates to int!: \n");
   d2 = i2;            
   System.out.println( i2 );  // 6
}

	}
