import java.util.*;

public class HourMinutes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of minutes :");
        int minutes=sc.nextInt();

        int hour=minutes/60;
        int rem_minutes=minutes%60;

        System.out.println("your time is  :"+hour+"hr" +rem_minutes+"min");
    }
}
