import java.util.*;
public class ProdMax{

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter array size:");
        int size = scan.nextInt();
        int [] array = new int[size];
        for(int i = 0;i<size;i++)
        	array[i] = scan.nextInt();
        int[] maxProductPair = findMaxProductPair(array);
        System.out.println("The pair of numbers with the maximum product is: " + maxProductPair[0] + " and " + maxProductPair[1]);
        System.out.println("Their product is: " + (maxProductPair[0] * maxProductPair[1]));
    }

    public static int[] findMaxProductPair(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int[] maxProductPair = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] * nums[j] > maxProduct) {
                    maxProduct = nums[i] * nums[j];
                    maxProductPair[0] = nums[i];
                    maxProductPair[1] = nums[j];
                }
            }
        }

        return maxProductPair;
    }
}