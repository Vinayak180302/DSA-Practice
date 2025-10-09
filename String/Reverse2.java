public class Reverse2 {
  public static void main(String[] args) {
    StringBuilder s1= new StringBuilder("Hello");

    for(int i = 0; i < s1.length()/2; i++) {
      int front = i;
      int back = s1.length() -1-i;

      char frontchar = s1.charAt(front);
      char backchar = s1.charAt(back);


      s1.setCharAt(front, backchar);
      s1.setCharAt(back, frontchar);
    }
    System.out.println(s1);
  }
}
