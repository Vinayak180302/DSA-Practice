public class IsSorted {

  //Program to check if array is sorted or not

  public static boolean Sort(int arr[]){
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] < arr[i-1]){
        return false;
      }
      
    }
    return true;
  }

  public static boolean isSorted(int arr[]){
    for(int i=1; i<arr.length; i++){
      if(arr[i] >= arr[i-1]){
        
      }
      else{
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 4, 5, 8, 9};
    // System.out.println(isSorted(arr));
    System.out.println(Sort(arr));
  }
}
