import java.util.Scanner;

public class MaximumTermary {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers..:");
        int a=sc.nextInt();
        int b=sc.nextInt();
      int c=  (a>b)?a:b;
        System.out.println(c);
    }
}
