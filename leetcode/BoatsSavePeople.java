import java.util.Arrays;

public class BoatsSavePeople {

  public static void main(String[] args) {
    int[] nums = { 1, 2 };
    int lim = 3;
    // Result should be 1 boat (1,2)
    int l = Solution.numRescueBoats(nums, lim);
    System.out.println(l);
  }

  class Solution {
    public static int numRescueBoats(int[] nums, int limit) {
      int lim = 0;
      // Sorting

      for (int i = 0; i < nums.length - 1; i++) {
        int boat = i;
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] < nums[boat]) {
            boat = j;
          }
        }
        int temp = nums[boat];
        nums[boat] = nums[i];
        nums[i] = temp;
      }
      Arrays.sort(nums);
      // Two pointers
      int l = 0;
      int r = nums.length - 1;
      while (l <= r) {
        int sum = nums[l] + nums[r];

        if (sum <= limit) {
          lim = lim + 1;
          l++;
          r--;
        } else {
          lim++;
          r--;
        }
      }
      return lim;
    }
  }
}
