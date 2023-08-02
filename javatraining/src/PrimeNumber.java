import java.util.*;

public class PrimeNumber {
    public  static  void PrimeCheck(int a) {
int n=a;
        if (n <= 1) {

        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("THe number is prime");
                break;
            }
            else{
                System.out.println("Not a Prime");
                break;
            }
        }

    }

    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a nuber to check wether its a prime or not :");
        int a=sc.nextInt();
        PrimeCheck(a);

    }
}
