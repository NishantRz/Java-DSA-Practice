import java.util.Arrays;

public class Concatenation_arr {
    public static void main(String[] args) {
    int[] nums ={1,2,3};
    int [] ans = getConcatenation(nums);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int[]ans = new int[2* nums.length];
        for (int i =0; i< nums.length ; i++){
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }

return ans;
    }

}