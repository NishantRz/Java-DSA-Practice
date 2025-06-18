public class arguments {
    public static void main(String[] args) {
        /*
        int ans = sum(20 , 30);
        System.out.println(ans);
    }
    static int sum(int a , int b){
        int sum = a+ b;
         return sum;
    }
}


         */

//Let's do the same for greeting
        String ans = greet("good morning");
        System.out.println(ans);
    }
    static String greet(String name){
        String message = "hello" + name;
        return message;
    }
}