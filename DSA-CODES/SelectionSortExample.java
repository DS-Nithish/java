import java.util.Arrays;

public class SelectionSortExample {
  public static void main(String[] args) {
    int[] arr = { 3, 7, 8, 2 };

    for (int i = 1; i < arr.length; i++) {

      int key = arr[i];
      int j = i - 1;
      System.out.println("Key:" + key);

      // inserting the unsorted into sorted
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
      System.out.println(arr[j + 1]);

    }
    System.out.println(Arrays.toString(arr));
  }
}
