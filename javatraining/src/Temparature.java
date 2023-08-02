import java.util.*;
public class Temparature{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temparature reading in celsius :");
        double celsius=sc.nextInt();
        double fahrenheit=(celsius*9/5)+32;

        System.out.println("temp in Fahtenheit :"+fahrenheit);

        int f1=(int)fahrenheit;
        double f2=fahrenheit;
        System.out.println(f1);
        System.out.println(f2);
    }
}
