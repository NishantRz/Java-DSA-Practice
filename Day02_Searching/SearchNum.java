public class SearchNum {
    public static void main(String[] args) {
        int[]arr = {2,3,4,14,6,7};
       // Findnum(arr,14);
        System.out.println(Findnum(arr,14));
    }
    public static boolean Findnum(int[]arr , int n){
        for (int i =0; i< arr.length;i++){
        if (arr[i]==n){
       return true;
        }
        }
return false;

    }
    }