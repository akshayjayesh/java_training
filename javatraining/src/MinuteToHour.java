import java.util.*;
public class MinuteToHour {
    public static  void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of Minutes :");
        int min=sc.nextInt();
        int hour=min/60;
        int rem_min=min%60;
        System.out.println("Time is  :"+hour+"hr "+rem_min+"min");

    }
}
