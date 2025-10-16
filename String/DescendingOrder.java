import java.util.Arrays;

public class DescendingOrder {
  

  public  static String descending(String s){
    char[] s2 = s.toCharArray();

    Arrays.sort(s2);

    StringBuilder s3 = new StringBuilder(new String(s2));

    s3.reverse();

    return s3.toString();
  }

  public static void main(String[] args) {
    
  System.out.println(descending("geeks"));
  }
}
