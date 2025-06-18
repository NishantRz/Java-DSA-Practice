import java.util.Scanner;

public class Basic_sum_method {
    public static void main(String[] args) {
        //this is for return value that's why int is used in the method
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1");
        int num1 = sc.nextInt();
        System.out.print("Enter num2");
        int num2 = sc.nextInt();

        int sum2 = num1 + num2;

        return sum2;
    }

//this is for non return value that's why void is used

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1");
        int num1 = sc.nextInt();
        System.out.print("Enter num2");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("The sum is = " + sum);
    }
}


