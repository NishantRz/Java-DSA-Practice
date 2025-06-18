import java.util.Scanner;

public class MultidimenstionalARR {
    public static void main(String[] args) {
        /*2D arrays are just type a matrix kind of String
        * like example 1 2 3
                       6 7 8
                       8 9 6  //this a 2d array

        int [][]arr ={
                {1,2,3,},//0th index
                {14,5},//1st index
                {12,3,4}//2nd index
        };

         */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);//no of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= sc.nextInt();

            }
        }


        //output
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
     System.out.print (  arr[row][col] + " ");

            }
             System.out.println();

        }
    }
}
