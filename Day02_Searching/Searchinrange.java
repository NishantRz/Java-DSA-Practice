public class Searchinrange {
    public static void main(String[] args) {
        //We will do the same as we done before but here we will itereate for loop
        //through specific index
        String name = "elephant";
        char target = 't';
        System.out.println(Search(name, target,1,4));
    }

    static boolean Search(String str, char target,int start,int end) {
        for (int i = start; i <=end; i++) {//this the logic here
            if (str.charAt(i) == target) {
                return true;
            }

        }
        return false;
    }
}