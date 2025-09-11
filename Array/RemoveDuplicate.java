public class RemoveDuplicate {
  //Program to remove dupplicates from array and print new array

  public static int duplicate(int arr[]){
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] != arr[i]) {
        arr[i+1] = arr[j];
        i++;
      }  
    }


    return (i+1);
  }
  public static void main(String[] args) {
    int arr[] = {1, 1, 2, 2, 3, 3, 4, 4};
    int len = duplicate(arr);
    System.out.println("length : " + len);
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    
  }
}
