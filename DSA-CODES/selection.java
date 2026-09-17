public class selection {

  public static void main(String[] args) {
    int[] nums = { 2, 3, 7, 6, 5 };

    for (int i = 0; i < nums.length - 1; i++) {
      int min = i;

      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }
      int temp = nums[min];
      nums[min] = nums[i];
      nums[i] = temp;
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }
}
