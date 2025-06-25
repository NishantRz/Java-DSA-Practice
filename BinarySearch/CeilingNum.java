public class CeilingNum {
    //find ceiling num mean find the smallest number in the array greater than or equal to
    //target
    public static void main(String[] args) {
        int[]arr = {1,3,5,9,47,52};
        int target =10;
        System.out.println(BinarySearch(arr,target));

    }
    static int BinarySearch(int[]arr,int target){
        int start =0;
        int end= arr.length-1;
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
        return start;
    }

}

