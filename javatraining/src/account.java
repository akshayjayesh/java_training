public class account {
    private int accountNo;
  double balance;

    //constructor
    public account(int AccountNo,double Balance){
        this.accountNo=AccountNo;
        this.balance=Balance;
    }

    public void Deposits(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited succesfully.... balanace is :"+balance);
        }else{
            System.out.println("Invalid input of amount");
        }
    }
    public void Withdraw(double amount){
        if(balance>0&&amount<balance){
            balance-=amount;
            System.out.println("Deposited withdraw...."+balance);
        }else{
            System.out.println("in sufficient balance");
        }
    }
    public double balance(){
       return balance;
    }
}
