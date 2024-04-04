
import java.util.*;
import java.util.Scanner;
public class LongestCommonSubsequence {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter the first string:");
        String string1 = scan.nextLine();
        System.out.print("Enter the second string:");
        String string2 = scan.nextLine();

    
        String lcs = findLCS(string1, string2);
        System.out.println("Longest Common Subsequence: " + lcs);
    }

    public static String findLCS(String string1, String string2) {
        int[][] lengths = new int[string1.length() + 1][string2.length() + 1];

        // Build the length matrix
        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    lengths[i + 1][j + 1] = lengths[i][j] + 1;
                } else {
                    lengths[i + 1][j + 1] = Math.max(lengths[i + 1][j], lengths[i][j + 1]);
                }
            }
        }

        // Build the LCS string
        StringBuilder lcs = new StringBuilder();
        for (int i = string1.length(), j = string2.length(); i != 0 && j != 0; ) {
            if (lengths[i][j] == lengths[i - 1][j]) {
                i--;
            } else if (lengths[i][j] == lengths[i][j - 1]) {
                j--;
            } else {
                assert string1.charAt(i - 1) == string2.charAt(j - 1);
                lcs.append(string1.charAt(i - 1));
                i--;
                j--;
            }
        }

        return lcs.reverse().toString();
    }
}
