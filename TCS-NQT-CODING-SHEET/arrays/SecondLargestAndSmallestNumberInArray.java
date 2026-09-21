public class SecondLargestAndSmallestNumberInArray {
  public static void main(String[] args) {
    int[] arr = { 100, 50, 25, 75, 10 };
    int large = Integer.MIN_VALUE;

    int small = Integer.MAX_VALUE;

    int secondLarge = Integer.MIN_VALUE;
    int secondSmall = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < small) {
          small = arr[j];
        }
        if (arr[j] > large) {
          large = arr[j];
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < secondSmall && arr[j] > small) {
          secondSmall = arr[j];
        }
        if (arr[j] > secondLarge && arr[j] < large) {
          secondLarge = arr[j];
        }
      }
    }
    System.out.println("secondSmallest:" + secondSmall);
    System.out.println("secondLargest:" + secondLarge);
    // for (int i = 0; i < arr.length - 1; i++) {
    // int min = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < arr[min]) {
    // min = j;
    // System.out.println(j);
    // }
    // }
    // int temp = arr[min];
    // arr[min] = arr[i];
    // arr[i] = temp;
    // }
    // System.out.println("secondSmallest:" + arr[1]);
    // System.out.println("secondLargest:" + arr[arr.length - 2]);
    //
  }
}
