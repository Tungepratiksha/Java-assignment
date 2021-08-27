//Write a JAVA program to compute the sum of the two given integers and count the number of digits of the sum value.   
 
class SumOfTwoIntegers
{
public static void main(String args[])
{
int x, y, sumofval,ctr;
x=40;
y=50;
ctr=0; 
sumofval=x+y; 
System.out.println("sum of 2 numbers:"+sumofval);
while(sumofval!=0)
{
 if(sumofval>0)
{ 
sumofval=sumofval/10; 
} 
ctr++; 
} 
System.out.println("Number of digits of the sum value of the said numbers:"+ctr); 
}
}
