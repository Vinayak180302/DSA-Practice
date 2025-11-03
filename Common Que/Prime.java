import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    
  System.out.println("enter no - ");

  int num = sc.nextInt();
  boolean isprime = true;

  if(num <=1){
  isprime = false;
  }else{
    for(int i=2; i <= num/2; i++){
      if(num % i ==0){
        isprime = false;
        break;
      }
    }
  }

  if(isprime){
    System.out.println(num + " is prime no.");
  }
  else{
    System.out.println(num + " is not a prime no.");
  }

    
  }
}
