import java.util.Arrays;

public class DescendingOrder {
  

  public  static String descending(String s){

//convert string to char array to sort and further check
    char[] s2 = s.toCharArray();

    Arrays.sort(s2);

//create new strig with srtingbuilder to reverse it
    StringBuilder s3 = new StringBuilder(new String(s2));

    s3.reverse();

    return s3.toString();
  }

  public static void main(String[] args) {
    
  System.out.println(descending("geeks"));
  }
}
