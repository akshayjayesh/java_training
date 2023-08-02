import java.util.*;

public class MaxOfNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter the number2:");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("Largest number is"+num1);
        }
        else
        {
            System.out.println("Largest number is"+num2);
        }
    }
}
