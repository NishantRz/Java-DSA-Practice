public class SearchinStrings {
    public static void main(String[] args) {
        String name ="elephant";
        char target = 'p';
        System.out.println(Search(name,target));
    }

    static boolean Search(String str,char target) {
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
return false;
    }
}
