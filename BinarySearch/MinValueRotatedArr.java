public class MinValueRotatedArr {
   // public static void main(String[] args) {
            public static void main(String[] args) {
                int[] arr = {2, 2,2,0,2};
                System.out.println(findMin(arr)); // Output: 1
            }

            public static int findMin(int[] arr) {
                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if(arr[start]==arr[mid ]&& arr[mid] == arr[end]){
                        start++;
                        end--;
                    }

                    // If mid element is greater than end, min must be in right half
                   else if (arr[mid] > arr[end]) {
                        start = mid + 1;
                    } else {
                        // Min is in left half (including mid)
                        end = mid;
                    }
                }

                // At the end, start == end and points to the minimum
                return arr[start];
            }
        }
