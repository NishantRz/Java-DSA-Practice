import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[]arr={20,30,40,70,60};
        swap(arr , 1 , 4);
        swap(arr , 4 , 2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr ,int Index1 , int Index2){
        int temp = arr[Index1];
       arr[Index1]=arr[Index2];
       arr [Index2]=temp;

    }
}
