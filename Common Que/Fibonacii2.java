public class Fibonacii2 {

  public static int Fibo(int n){
     if(n<=1){
      return n;
     }
     else{
      return Fibo(n-1) + Fibo(n-2);
     }
  }
  public static void main(String[] args) {

    int n = 10;
    for (int i = 0; i < n; i++) {
      System.out.print(Fibo(i)+ " ");
      
    }
    
  }
}
