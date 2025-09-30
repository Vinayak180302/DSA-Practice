public class SearchElem {

  public static int SearchElement(int[] arr, int element){
         for (int i = 0; i < arr.length; i++) {
          if(arr[i] == element)
          return i;           //return index if elem. is found
         }
         return -1;           //return -1 if not found
  }
  public static void main(MyString[] args) {
    int[] arr = {1, 2, 4, 7, 3};
    System.out.println(SearchElement(arr, 9));

  }
}
