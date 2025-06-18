public class FuncOverloding {
    public static void main(String[] args) {
    fun(23,35);
    fun("nishant");
//This is called function   overiding
    }
    static void fun(int a, int b){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
