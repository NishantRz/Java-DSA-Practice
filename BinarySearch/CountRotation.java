public class CountRotation {
//    public class RotationCountUsingPivot {
        public static void main(String[] args) {
            int[] arr = {15, 18, 2, 3, 6, 12};
            System.out.println("Rotation count: " + countRotations(arr));
        }

        static int countRotations(int[] arr) {
            int pivot = findPivot(arr);
            return pivot + 1; // rotation count
        }

        static int findPivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // case 1: mid is pivot
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }

                // case 2: mid-1 is pivot
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }

                // left half is sorted, go right
                if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                } else { // right half is sorted, go left
                    end = mid - 1;
                }
            }

            return -1; // no rotation
        }
    }

 
