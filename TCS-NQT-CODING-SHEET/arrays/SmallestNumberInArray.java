public class SmallestNumberInArray {
  public static void main(String[] args) {
    int[] arr = { -5, -2, -10, -1 };
    int smallest = arr[0];
    for (int i = 0; i < arr.length; i++) {

      for (int j = i; j < arr.length; j++) {
        if (arr[j] < smallest) {
          smallest = arr[j];
        }
      }
    }
    System.out.println(smallest);
  }
}
