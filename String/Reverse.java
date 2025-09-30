public class Reverse {

  public static void Reverse(String str){
     
    String reversed = "";
    for(int i = str.length()-1; i >=0; i--){
      reversed += str.charAt(i);

    }

    System.out.println("reverse string is : "+ reversed);
     
     
  }
  public static void main(String[] args) {
    String str = "vinayak";

    Reverse(str);

   
  }
}
