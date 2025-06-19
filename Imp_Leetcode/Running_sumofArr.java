import java.util.Arrays;

public class Running_sumofArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        //int[] sum = new int[nums.length];


        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];

        }
        return nums;
    }
}
