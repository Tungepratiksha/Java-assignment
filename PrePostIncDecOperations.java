//Write a program in JAVA to display the operation of pre and post increment and decrement.   
//Sample Output:
//Display the operation of pre and post increment and decrement :
//--------------------------------------------------------------------
//The number is : 57
//After post increment by 1 the number is : 58
//After pre increment by 1 the number is : 59
//After increasing by 1 the number is : 60
//After post decrement by 1 the number is : 59
//After pre decrement by 1 the number is : 58
//After decreasing by 1 the number is : 57
 
public class PrePostIncDecOperations {
	public static void main(String[] args) {
		
   int num = 56;      
    System.out.println("Display the operation of pre and post increment and decrement:");
	System.out.println("------------------------------------------------------------");    
   System.out.println("The number is : " + num ); 
   num++;              
   System.out.println("After post increment by 1 the number is : " + num); 
   ++num;              
   System.out.println("After pre increment by 1 the number is : "+ num ); 
   num = num + 1;  
   System.out.println("After increasing by 1 the number is : " +num); 
   num--;              
   System.out.println("After post decrement by 1 the number is : " + num); 
   --num;               
   System.out.println("After pre decrement by 1 the number is : " + num); 
   num = num - 1; 
   System.out.println("After decreasing by 1 the number is : " +num);
	}
}