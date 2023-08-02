import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FibanocciFunction {
    public static void Fibanocci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        Fibanocci(b,c,n-=1);
        System.out.println(c);
}

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..:");
        int a = 0;
        int b=1;

       int n= sc.nextInt();
        Fibanocci(a,b,n-2);
        System.out.println(b);
        System.out.println(a);
}
}
