import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={1,3,56,7,89,9,0,7};
       bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr){
        //run the steps n-1 times
         boolean swapped;
        for (int i =0; i< arr.length;i++){
            swapped=false;
            //for each step max item  wil come at the last  respective index
            for (int j =1; j < arr.length-i;j++){
                //swp if the item is smaller than the previous item
             if(arr[j]<arr[j-1]){
                    //swap
                 int temp = arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
                swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
