import java.util.Arrays;

/**
 * FindFirstandLastPositionofElementinSortedArray
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstandLastPositionofElementinSortedArray {

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 8, 10 };
    int target = 8;
    int[] re = Solution.searchRange(nums, target);
    System.out.println(Arrays.toString(re));
  }

  class Solution {
    public static int[] searchRange(int[] nums, int target) {
      int[] result = new int[2];

      int left = 0;
      int right = nums.length;

      while (left < right) {
        int middle = left + (right - left) / 2;

        if (nums[middle] < target) {
          left = middle + 1;
        } else {
          right = middle;
        }
      }

      // Target doesn't exist
      if (left == nums.length || nums[left] != target) {
        result[0] = -1;
        result[1] = -1;
        return result;
      }

      result[0] = left;

      int l = 0;
      int r = nums.length;

      while (l < r) {
        int m = l + (r - l) / 2;

        if (nums[m] > target) {
          r = m;
        } else {
          l = m + 1;
        }
      }

      result[1] = r - 1;

      return result;
    }
  }
}
