public class BankAccount {
    public static  void main(String[]args) {
    account bankaccount=new account(123456,25000.00);
    bankaccount.Deposits(500);
    bankaccount.Withdraw(300);
    double balance=bankaccount.balance();
        System.out.println(balance);



    }
}
