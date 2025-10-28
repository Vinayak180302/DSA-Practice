public class ToUpperCase {

  public static String upper(String str){

//create string array to stored each word from given string
    String[] words = str.split(" ");

//create new string to stored final output
    StringBuilder s1 = new StringBuilder();

//run the loop through array to make 1st letter capital
    for (String word : words) {
      if (word.length() > 0){
        String capital = word.substring(0, 1).toUpperCase() + word.substring(1);
//after making 1st letter capital, append it to result
        s1.append(capital).append(" ");
        
      }
    }

    return s1.toString().trim();     
  }
  
  public static void main(String[] args) {

    System.out.println(upper("i love coding"));
    
  }
}
