/**
 *
 * SortanArray
 * 
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 * Explanation: After sorting the array, the positions of some numbers are not
 * changed
 * (for example, 2 and 3), while the positions of other numbers are changed (for
 * example, 1 and 5).
 * 
 */
public class SortanArray {

  public static void main(String[] args) {
    int[] nums = { 5, 2, 3, 1 };
    int[] out = Solution.sortArray(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.println(out[i]);
    }
  }

  class Solution {
    public static int[] sortArray(int[] nums) {
      for (int i = 0; i < nums.length - 1; i++) {
        int min = i;
        for (int j = 1 + i; j < nums.length; j++) {
          if (nums[j] < nums[min]) {
            min = j;
          }
        }
        int temp = nums[min];
        nums[min] = nums[i];
        nums[i] = temp;
      }
      return nums;
    }
  }
}
