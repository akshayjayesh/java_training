import com.sun.security.jgss.GSSUtil;

public class primeNumber {
    public static void main(String[] args) {
        int n=12;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Its a prime number...");
        }
        else{
            System.out.println("Its no a prime number...");
        }
    }
}
