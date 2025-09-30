// import java.util.Arrays;

public class AddElem {

  public static int[] addElement(int[] arr, int element){
       int[] newArr = new int[arr.length+1];

       System.arraycopy(arr, 0, newArr, 0, arr.length);

       newArr[arr.length] = element;

       return newArr;

  }

  public static void main(MyString[] args) {
     int[] arr = {1, 2, 3};

     arr = addElement(arr, 4);

     for (int i : arr) {
      System.out.print(i + " ");
      
     }

    //  System.out.println(Arrays.toString(addElement(arr, 4)));
  }
}