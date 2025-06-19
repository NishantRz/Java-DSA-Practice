import java.util.List;
import java.util.ArrayList;

public class KidswithGreatestnumofcandies {
    public static void main(String[]args){
        int[]candies={2,3,5,1,3};
        int extracandies=3;
        List<Boolean>result =kidsWithCandies(candies,1);

        System.out.println(result);

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max =0;
        int n =candies.length;
         for (int candy:candies){
             if (candy>max){
                 max=candy;

             }
    }
        for (int candy:candies){
            result.add(candy+extraCandies>=max);
        }
        return result;
}
}

