import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers..:");
        int a=sc.nextInt();
        int b=sc.nextInt();
int res;
        System.out.println("Enter your choice 1.Addition 2.subtraction 3.Multiplication 4.Division");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                res=a+b;
                System.out.println("Result is :"+res);
                break;
            case 2:
                res=a-b;
                System.out.println("Result is :"+res);
                break;
            case 3:
                res=a*b;
                System.out.println("Result is :"+res);
                break;
            case 4:
                res=a/b;
                System.out.println("Result is :"+res);
                break;
            default:
                System.out.println("Sorry..Invalid Input..Try Again...");
        }
    }
}
