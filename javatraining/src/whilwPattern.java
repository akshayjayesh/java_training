import java.util.Scanner;

public class whilwPattern {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=1;
        int j=1;
        while(i<=a){
            while(j<=b){
                if(i==1||j==1||i==a||j==b) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
                j++;
            }
            System.out.println("\n");
            i++;

        }

    }

}
