public class RemoveDuplicate {
  public static void main(String[] args) {
    String str = "banana";

    String result = "";

    for (int i = 0; i < str.length()-1; i++) {
      char ch = str.charAt(i);

      if(result.indexOf(ch) == -1){    //to check if character are not already present in result
         result += ch;                 //if not then only add it to result 
      }
      
    }

    System.out.println(result);
  }
}
