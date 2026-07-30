public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = new int[nums.length];
        int[] ans1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans1[i]  = nums[i];
        
        for(int j = 0; j < ans1.length;j++){
            ans[j] = ans1[i];
        }
        }
        System.out.println(ans1[0]);
                System.out.println(ans[4]);

        //   for (int j = 0; j < nums.length; j++) {
        //     ans[j] = nums[ans1];
        // }

    }

}
