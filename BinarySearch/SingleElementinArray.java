public class SingleElementinArray {
    public static void main(String[] args) {
       int[]arr= {1,1,2,3,3,4,4,8,8};
        System.out.println(SingleNonDuplicate(arr));
    }
    public static int SingleNonDuplicate(int[]arr){
        int start=0;
        int end =arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[start]==arr[mid] && arr[start]!=arr[mid+1]){
                return mid;
            }
            if (arr[end]==arr[mid] && arr[end]!=arr[mid-1]){
                return mid;
            }
            else if (arr[mid]!=arr[mid-1]&& arr[mid]!=arr[mid+1]){
                    return mid;
                }else{
                return mid;
            }
            }
    return -1;

        }
    }

