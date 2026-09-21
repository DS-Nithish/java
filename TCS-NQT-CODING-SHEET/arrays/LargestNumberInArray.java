/**
 * LargestNumberInArray
 */
public class LargestNumberInArray {

  public static void main(String[] args) {
    int[] arr = { -5, -2, -10, -1 };

    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[j] > largest) {
          largest = arr[j];
        }
      }
    }
    System.out.println(largest);
  }
}
