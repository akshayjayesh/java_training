import java.util.Scanner;

public class BankProblem {public static void main(String[]args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer :1.Withdraw 2.Deposit 3.Balance enguiry ");
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("You Choose Withdrawal..");
                break;
            case 2:
                System.out.println("You Choose Deposit..");
                break;
            case 3:
                System.out.println("You Choose Balance Enquiry..");
                break;
            default:
                System.out.println("Invalid Input..");
        }
    }
}
