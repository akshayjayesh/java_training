import java.sql.SQLOutput;
import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[3];
        System.out.println("Enter the marks for u got");
        for(int i=0;i<3;i++){
            System.out.println("Enter the marks of subject "+(i+1)+"  :");
            marks[i]=sc.nextInt();
        }
        System.out.println("The marks u have Entered");
        for(int i=0;i<3;i++){
            System.out.println("Mark of subject  "+i+" is :"+marks[i]);
        }
    }

}
