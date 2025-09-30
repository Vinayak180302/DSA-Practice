import java.util.Arrays;

public class RotateArray1 {
  public static int[] Rotate(int arr[]){ //Rotate array by 1 from left 
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
    return arr;

  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(Rotate(arr)));
  }
}
