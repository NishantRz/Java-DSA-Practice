import java.util.Arrays;

public class Find_firstandLast_pos_element {
    public static void main(String[] args) {
      int[]  arr = {5,7,7,8,8,10};
      int target = 8;
      int []result=searchRange(arr,8);

        System.out.println(Arrays.toString(result) );
    }
    public  static int[] searchRange(int[] arr, int target) {
//        int n = arr.length ;
//            int start=0;
//            int end = n-1;
//            while(start<=end){
//                int mid = start+(end - start)/2;
//                if (target<arr[mid]){
//                    end = mid-1;
//
//                }else if (target>arr[mid]){
//                    start= mid+1;
//                }else {
//                    return mid;
//                }
//            }
//            return
            int [] ans ={-1,-1};
            //check for first index for target first
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);

        return ans;
    }
    public static  int  search(int[] arr, int target,boolean FindStartIndex) {
        int n = arr.length;
        int ans = -1;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
              ans = mid;
              if (FindStartIndex== true){
                  end = mid -1;
              }else {
                  start=mid+1;
              }
            }
        }
        return ans;
    }
}
