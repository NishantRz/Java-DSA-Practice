import java.util.Arrays;

public class Reversearr {
    public static void main(String[] args) {

                int[] arr = {1, 2, 3, 4, 5};

                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    // Swap elements
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;

                    start++;
                    end--;
                }

                System.out.println("Reversed Array: " + Arrays.toString(arr));
            }

        }
