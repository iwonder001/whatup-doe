import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		   //Create scanner object
	       Scanner s = new Scanner(System.in);
	       
	       //Output the number prompt
	       System.out.print("Enter the number to be reversed : ");
	       int input = s.nextInt();
	       int result = reverse(input);
	       System.out.println("The reversed number is " + result);
	   }

	   public static int reverse(int n) {
		   //below is a method which takes an integer parameter n, reverses it and returns the result
	       int result = 0;
	       int rem;
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           result = result * 10 + rem;
	           
	          //Note that since both n and the number we are dividing with (10) are int values, the resulting value will be an int and not a decimal
	       }
	       return result;
	   }
	}