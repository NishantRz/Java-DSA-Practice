import java.util.Arrays;
public class practice{
    public static void main(String[] args) {
        //reverse array
        int[]arr = {2,3,4,5,6};
        int start =0;
        int end = arr.length-1;
        while (start<end){
          int temp = arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;

        }
        System.out.println(Arrays.toString(arr));



    }

    }
        //make all  the 0s at the end
//        int[]arr ={1,2,0,3,0,4,0,5};
//        pushzeroestoend(arr);
//        for (int num:arr){
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void pushzeroestoend(int[]arr) {
//        int count = 0;
//        for (int i = 0; i< arr.length;i++){
//            if (arr[i]!=0){
//                 arr[count]=arr[i];
//                count++;
//
//                }
//            }
//        while (count< arr.length){
//            arr[count]=0;
//            count++;
//        }
//
//    }
//}


//public class practice{
//     public static void main(String[] args) {
//         //find the secondlarget number in array
//         int[] arr = {45, 60, 71, 26, 99, 54};
//         System.out.println(secondlargest(arr));
//
//
//     }
//
//     public static int secondlargest(int[] arr) {
//         if (arr.length < 2) return -1;
//         int largest = -1;
//         int secondlargest = -1;
//         for (int num : arr){
//             if (num>largest){
//                 secondlargest=largest;
//                 largest = num;
//
//             } else if (num>secondlargest && num!=largest) {
//                 secondlargest=num;
//
//             }
//         }
//         return secondlargest;
//     }
// }