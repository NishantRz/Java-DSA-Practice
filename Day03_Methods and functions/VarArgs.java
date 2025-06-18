import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 89, 100, 190, 1000);
        //this is for int array
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

     /*
//if we want for mix data types
    public static void main(String[] args) {

        fun(26,3,"shubhi","peehoo");
    }
    static void fun(int a ,int b, String...v){
        System.out.println( Arrays.toString(v));
    }
}

`
      */
