public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 13, 15, 20, 25, 30, 35, 40, 45, 50}; // simulate infinite
        int target = 10;
        int result = ans(arr, target);
        System.out.println("Element found at index: " + result);

    }
    static int ans(int[]arr,int target){
        //we have to found the bounds
        int start = 0;
        int end = 1;
        int newstart= end +1;
        while (target>arr[end]){
            //formula to find size of box her we are just doubling the size of array
            end = end +(end-start)*2;
            start=newstart;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[]arr,int target,int start,int end){

        while (start<=end){
            //find the middle element
            int mid = start + (end - start)/2;
            if (target<arr[mid]){
                //cause its now go on left side
                end = mid - 1;
            } else if (target>arr[mid]) {
                //cause it son the right side
                start= mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }

}


