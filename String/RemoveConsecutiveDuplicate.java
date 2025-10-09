public class RemoveConsecutiveDuplicate {
  public static void main(String[] args) {
    String str = "aaaabbbbbccceee";

    StringBuilder s1 = new StringBuilder();

    s1.append(str.charAt(0));

    for(int i=1; i <str.length(); i++){
      if (str.charAt(i) != str.charAt(i-1)) {
        s1.append(str.charAt(i));
        
      }
    }

    System.out.println(s1);
  }
}
