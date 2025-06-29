public class MountainArray {
    public static void main(String[] args) {

        //find the lowest index of given target in the given array

    }

    int search(int[] arr, int target) {
        int peak = PeakMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //try to search in second half
       return orderAgnosticBS(arr,target,peak,arr.length-1);
    }

    public static int PeakMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else { //if (arr[mid+1] < arr[mid]) {
                start = mid + 1;

            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target,int start , int end) {
//        int start = 0;
//        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}