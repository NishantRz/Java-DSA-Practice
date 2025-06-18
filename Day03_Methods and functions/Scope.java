public class Scope {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println(a);
    }
    static void num(){
        int num = 10;
        System.out.println(num);
    }
// so here we get that any variable of any function cannot be called in other function
    //so that's why num called where it is declared and a called where it is.
}
