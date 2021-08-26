//Write a program in JAVA to compute quotient and remainder.   
//Sample Output:
//Compute quotient and remainder :
//-------------------------------------
//Input the dividend : 25
//Input the divisor : 3
//The quotient of the division is : 8
//The remainder of the division is : 1
 
import java.util.Scanner;

public class ComputeQuoAndRem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dn, dr, qu, rem;
        

        System.out.println("Compute quotient and remainder:");
        System.out.println("- - - - - - - - - - - -- - - -");
        System.out.print("Input the dividend:");
        dn = in.nextInt();
        System.out.print("Input the divisor:");
        dr = in.nextInt();

       
        qu = dn / dr;
        rem = dn % dr;

        System.out.println("The Quotient of the division is: " + qu);
        System.out.println("The Remainder of the division is: " + rem);
    }
} 