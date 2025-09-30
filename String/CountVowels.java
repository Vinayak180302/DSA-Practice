public class CountVowels {
 public static void main(String[] args) {
  String str = "hello world"; 

  str = str.toLowerCase();   //to make it lowercase

  int vowels = 0, consonents = 0;

  for(int i=0; i<str.length(); i++){
    char ch = str.charAt(i);

    if(Character.isLetter(ch)){  //check only letters
       if (ch =='a' || ch =='e' ||ch =='i' ||ch =='o' ||ch =='u') {
        vowels++;
       }else{
        consonents++;
       }
    }
  }

  System.out.println("vowels are : "+ vowels);
  System.out.println("consonents are : "+ consonents);


 } 
}
