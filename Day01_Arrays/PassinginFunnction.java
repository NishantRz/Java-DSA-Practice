import java.util.Arrays;

public class PassinginFunnction {
    public static void main(String[] args) {
        int[]nums = {2,3,4,5,44,33,33};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
 static   void change(int[]arr){
        //lets say 0th index change it to 99
     arr[0]=99;

    }
}
