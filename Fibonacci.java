
import java.util.*;
import java.util.*;
public class Fibonacci {
	
	  public static int fibRecursion(int count) {
	    if (count == 0) {
	      return 0;
	    } // Oth fibonacci is 0

	    if (count == 1 || count == 2) {
	      return 1;
	    } // 1st and 2nd Fibonacci are 1 and 1 only

	    // calling function recursively for nth Fibonacci number
	    return fibRecursion(count - 1) + fibRecursion(count - 2);
	  }

	  public static void main(String args[]) {
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the number:");
	    int fib_len = scan.nextInt();

	    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
	    for (int i = 0; i < fib_len; i++) {
	    	System.out.print(fibRecursion(i) + " ");
	    }
	    
	  }
	}
/*public class Fibonacci{
    // Function to print N Fibonacci Number
   public static void fibonacciSeries(int n)
    {
      int num1 = 1, num2 = 1;
      System.out.println("The :"+ n +": Fibonacci Series  Are Listed Below:");
      for (int i = 0; i < n; i++) {
        // Print the number
        System.out.print(num1 + " ");

        // Swap
        int num3 = num2 + num1;
        num1 = num2;
        num2 = num3;
      }
    }

    // Driver Code
    public static void main(String args[])
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println(" Enter the number:");
      int num = scanner.nextInt();
      // Function Call
      fibonacciSeries(num);
    }
  }
*/

