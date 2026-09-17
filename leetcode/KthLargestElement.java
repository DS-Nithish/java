/**
 * KthLargestElement
 *
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 */
public class KthLargestElement {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
    int k = 4;
    System.out.println(Solution.findKthLargest(nums, k));
  }

  class Solution {
    public static int findKthLargest(int[] nums, int k) {

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
      int finals = nums[nums.length - k];
      return finals;
    }

  }
}
