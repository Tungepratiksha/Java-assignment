// Write a JAVA program that accepts sales unit price and sales quantity of various items and compute total sales amount and the average sales quantity. All input values must greater than or equal to 0 and less than or equal to 1,000, and the number of pairs of sales unit and sales quantity does not exceed 100. If a fraction occurs in the average of the sales quantity, round the first decimal place.   
 
import java.util.Scanner;
public class SalesUnitPrice {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

int prc,qt=2,i,n,total=0;

System.out.println(" Enter the number of sales product: ");

n=sc.nextInt();

for(i=1;i<=n;i++)

{

System.out.println("Enter the details of the "+i+" No. product");

System.out.println("Enter the unit price of the sales product (between 0 to 1000): ");
      prc=sc.nextInt();

System.out.println("Enter the quantity of the sales product (between 0 t0 1000): ");

qt=sc.nextInt();

total=(total+(prc*qt));

}

for(i=1;i<=n;i++)

{

System.out.println("The details of the "+i+" No. product");

System.out.println("The unit price of the sales product is: ");

System.out.println("The quantity of the sales product is: ");

System.out.println("\n\n");

}

System.out.println("The total sales amount is: "+total);

}
	}
