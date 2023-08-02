import java.util.Scanner;

public class PositiveTemary {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..:");
        int a = sc.nextInt();
    String res=(a<0)?"Its a Negative Number":"Its a positive Number..";
        System.out.println(res);
    }

}
