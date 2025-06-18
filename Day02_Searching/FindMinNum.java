public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 14, 6, 7};
        System.out.println(min(arr));
    }
    public static int min(int[]arr){
        int ans = arr[0];
        for (int i =1; i< arr.length;i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}