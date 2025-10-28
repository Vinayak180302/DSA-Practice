public class Reverse2 {
  public static void main(String[] args) {
    StringBuilder s1= new StringBuilder("Hello");

    for(int i = 0; i < s1.length()/2; i++) {       //run loop to middle of string
      int front = i;                  //create 2 variables and stored index of first and last index
      int back = s1.length() -1-i;

 //now create 2 char variable and stored in them the char. at first and last index 
      char frontchar = s1.charAt(front);    
      char backchar = s1.charAt(back);

//now swap those character which is first to last and vice versa
      s1.setCharAt(front, backchar);
      s1.setCharAt(back, frontchar);
    }
    System.out.println(s1);
  }
}
