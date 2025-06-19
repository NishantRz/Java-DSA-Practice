public class Find_the_highest_Altitude {
    public static void main(String[]args){
        int[]gain={-5,1,5,0,-7};
        System.out.print(largestAltitude(gain));

    }
    public static int largestAltitude(int[] gain) {
        int current =0;
        int max =0;
        int n = gain.length;
        for (int g:gain){
            current+=g;
            if (current>max){
                max=current;
            }
        }
return max;
        }

    }


