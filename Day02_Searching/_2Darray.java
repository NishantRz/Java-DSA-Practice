import java.util.Arrays;

public class _2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {18, 22, 3, 4},
                {78, 99, 90, 76},
                {18, 12}
        };
        int target = 3;
        int[] ans = Findnum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Findnum(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
