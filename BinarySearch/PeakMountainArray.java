import java.util.Arrays;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 35, 25, 15};
       int ans = Search(arr );
        System.out.println(ans);
    }

   public static int Search(int[] arr ) {
        int start = 0;
        int end = arr.length - 1;
        while (start <  end) {
            int mid = start + (end - start) / 2;
            if (arr[mid+1] < arr[mid]) {
               end = mid;
            } else{ //if (arr[mid+1] < arr[mid]) {
                start= mid+1  ;

            }
        }
       return start;
    }
}