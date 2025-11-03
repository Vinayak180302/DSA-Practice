public class Swap {
  public static void main(String[] args) {
    int a = 10, b = 20;

    System.out.println("befor swap : a = " + a + ", b = "+ b);
    a = a + b;
    b = a - b;
    a = a - b;

    System.err.println("after swap : a = "+ a + ", b = "+ b);
  }
}
