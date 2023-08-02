import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number To Check Wether its positive or Negative:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("The number is Negative.....");
        }
        else{
            System.out.println("The Number is Positive.......");
        }

    }
}
