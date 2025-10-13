import java.lang.reflect.Array;
import java.util.Arrays;


//Check aangram of 2 non-empty string  consist lower-case letters
public class isAnagrams {

  public static boolean Anagram(String s1, String s2){
    if(s1.length() != s2.length()) return false;   //if length is not same, no need to check further

    char[] a1 = s1.toCharArray();          //convert string to char array to sort and check further
    char[] a2 = s2.toCharArray();

    Arrays.sort(a1);
    Arrays.sort(a2);

    return Arrays.equals(a1, a2);      //after sort, check if 2 array consist same length and same element
  }
  public static void main(String[] args) {
      String s1 = "geeks";
      String s2 = "kseeg";

      System.out.println(Anagram(s1, s2));
  }
}
