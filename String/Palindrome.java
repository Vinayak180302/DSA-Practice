public class Palindrome {
  public static void main(String[] args) {
    String str = "madam";
   int  n = str.length();
   boolean isPallindrome = true;
    for(int i =0; i < n/2; i++){
     if (str.charAt(i) != str.charAt(n - 1 - i)) {
      isPallindrome = false;
      break;
     }
    }

    if (isPallindrome) {
      System.out.println("the given string is pallindrome");
    }else{
      System.out.println("the given string is not pallindrome");
    }
  }
}
