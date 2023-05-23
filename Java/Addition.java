import java.util.*;

public class Addition{
/**
*add two numbers a and b
*@param a - This is a first value
*@param b - This is a Second value
*@param sum- This is a addition of a and b 
* E.g. 1. a=3, b=5, sum=8
	   2. a=-3,b=-5, sum= -8
	   3. a=-3, b=5, sum=2
	   4. a=3, b=-5, sum=-2
*/
	public static void main (String args[]){
	scanner sc = new Scanner(System.in);
	int a= sc. nextInt();
	int b = sc. nextInt();
	int sum= a+b;
	System.out.println("The addition of two number is"+ sum);
	}
}