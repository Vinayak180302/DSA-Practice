public class ToUpperCase {

  public static String upper(String str){

    String[] words = str.split(" ");

    StringBuilder s1 = new StringBuilder();

    for (String word : words) {
      if (word.length() > 0){
        String capital = word.substring(0, 1).toUpperCase() + word.substring(1);

        s1.append(capital).append(" ");
        
      }
    }

    return s1.toString().trim();
  }
  
  public static void main(String[] args) {

    System.out.println(upper("i love coding"));
    
  }
}
