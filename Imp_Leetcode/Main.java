public class Main{
    public static void main(String[] args) {
    int[]arr={2,3,34,56,899,90};
    int target = 34;
        System.out.println(Search(arr,target));
    }
    static int Search(int[]arr,int target){
        for (int i =0; i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}