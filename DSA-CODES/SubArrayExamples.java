/**
 * SubArrayExamples
 */
public class SubArrayExamples {

  public static void main(String[] args) {
    int[] arr = { 2, 1, 5, 1, 3, 2 };
    int k = 3;
    int[] arr2 = { 1, 12, -5, -6, 50, 3 };
    int k2 = 4;
    MaximumK(arr, k);
    AverageK(arr2, k2);

  }

  public static double AverageK(int[] arr, int k) {
    // To find the Average of an sub array for length K
    // 1. 2, 2. 51 , 3. 42,

    double sum = 0;
    double max = 0;
    double average = 0;

    for (int i = 0; i < k; i++) {
      sum = sum + arr[i];
      average = sum / k;

    }
    max = average;

    int l = 0;
    int r = k;
    while (r < arr.length) {
      sum = sum - arr[l] + arr[r];
      average = sum / k;
      if (average > max) {
        max = average;
      }
      l++;
      r++;
    }
    return max;
  }

  public static int MaximumK(int[] arr, int k) {
    // TO find the maximum sum of an SubArray length k

    int sum = 0;
    int max = 0;
    for (int i = 0; i < k; i++) {
      sum = sum + arr[i];
    }
    // max = 8
    max = sum;
    int l = 0;
    int r = k;
    while (r < arr.length) {

      sum = sum - arr[l] + arr[r];
      if (sum > max) {
        max = sum;
      }
      l++;
      r++;

    }
    System.out.println("Maximum Sum:" + max);
    return max;

  }
}
