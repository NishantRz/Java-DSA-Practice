import java.util.Scanner;

public class swappinng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value: ");
        int a = sc.nextInt();
        System.out.println("enter b value: ");
        int b = sc.nextInt();
        swap(a,b);
        System.out.println(a + " " + b);

        }
        //here it will not work cause a and b When you call swap(x, y),
        // x and y are not passed — only their values (10 and 20) are passed.
    // a and b   affects a and b inside the method, not x and y in main.
        static void swap(int a , int b){
        int temp = a;
        a = b;
         b = temp;


    }
}
