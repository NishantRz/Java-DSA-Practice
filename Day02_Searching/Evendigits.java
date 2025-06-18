public class Evendigits {
    public static void main(String[] args) {
        int[]nums={24,123,4523,45676,2222};
        System.out.println(findNums(nums));
    }
    static int findNums(int[]nums){
        int count =0;
        for (int num :nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
//function to check wether a number conbtains even digits or not
    static boolean even(int num){
        int NumberofDigits = digits(num);
        if (NumberofDigits%2==0){
            return true;
        }
return false;
    }
    //count number of digits
    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=  num/10;
        }
        return count;
    }
 }
