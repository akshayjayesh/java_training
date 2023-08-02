import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Mangooo");
                break;
            case 2:
                System.out.println("Apple");
                break;
            case 3:
                System.out.println("Orange");
                break;
            default:
                System.out.println("No fruits...");
        }
    }
}
