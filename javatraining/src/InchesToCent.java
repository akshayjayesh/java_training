import java.util.*;
public class InchesToCent {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the measure in inches :");
        int inches=sc.nextInt();
        double centimeter=inches*2.54;
        System.out.println("Inches converted to centemeter is :"+centimeter);
    }
}
