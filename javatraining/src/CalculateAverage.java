import java.util.*;
public class CalculateAverage {
    public static void main(String[] args){
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Three Numbers :");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int avg=(a+b+c)/3;

        System.out.println("Average of The Numbers is :"+avg);*/
        int sum=0;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Three Numbers :");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int avg=sum/3;
        System.out.println(avg);
    }
}
