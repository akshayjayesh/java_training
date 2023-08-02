import java.util.Scanner;

public class Factorial {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..:");
        int a = sc.nextInt();
        int res=1;
        for(int i=1;i<=a;i++){
            res=res*i;

        }
        System.out.println("factorial of  "+a+" is :"+res);
    }
}
