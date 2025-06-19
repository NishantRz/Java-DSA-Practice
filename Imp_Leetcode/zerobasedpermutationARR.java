import java.util.Arrays;

public class zerobasedpermutationARR {
    public static void main (String[]args){
        int[]arr={0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] buildArray(int[] nums) {
        int[]ans = new int[nums.length];
        for (int i =0; i< nums.length;i++){
           ans[i]=nums[nums[i]];
        }
    return ans;
    }
}

