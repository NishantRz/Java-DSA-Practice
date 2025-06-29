public class RotatedBinarySearch {

//this code is for duplicate ones

        public static void main(String[] args){
            int[] nums = {2, 5, 6, 0, 0, 1, 2};
            int target = 0;
            System.out.println(search(nums, target));  // Output: 3 or 4
        }

        public static int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // 🔄 Handle duplicates
                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                    start++;
                    end--;
                }

                // ✅ Left half is sorted
                else if (nums[start] <= nums[mid]) {
                    if (target >= nums[start] && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

                // ✅ Right half is sorted
                else {
                    if (target > nums[mid] && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

            return -1;
        }
    }


