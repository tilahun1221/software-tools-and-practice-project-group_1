
import java.util.*;
import java.util.Scanner;
import java.util.*;

public class AnagramString {
  public static boolean isAnagram(String str1, String str2) {
    String s1 = str1.replaceAll("\\s", "");
    String s2 = str2.replaceAll("\\s", "");
    boolean status = true;
    if (s1.length() != s2.length()) {
      status = false;
    } else {
      char[] ArrayS1 = s1.toLowerCase().toCharArray();
      char[] ArrayS2 = s2.toLowerCase().toCharArray();
      Arrays.sort(ArrayS1);
      Arrays.sort(ArrayS2);
      status = Arrays.equals(ArrayS1, ArrayS2);
    }
    return status; 
     
  }
  public static void main(String[] args) {
    Scanner accept = new Scanner(System.in);
    System.out.println("Enter The First String To Check Anagram:");
    String firstString = accept.nextLine();
    System.out.println("Enter The Second String To Check Anagram:");
    String secondString = accept.nextLine();

    boolean result = isAnagram(firstString, secondString);
if(result)
	System.out.println(firstString + " and " + secondString + " Are Anagrams");
else
	System.out.println(firstString + " and " + secondString + " Are Not Anagrams");
  }
}
