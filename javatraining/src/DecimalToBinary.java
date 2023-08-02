import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Decimal noumber :");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("The number u have entered is Negative");
        } else {
            Binary(number);


        }
    }

    private static void Binary(int number) {

        if (number <= 1) {
            System.out.print(number);
            return;


        }

            int remainder = number % 2;
            Binary(number >> 1);
            System.out.print(remainder);


    }
}

