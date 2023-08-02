import java.util.*;


public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Widthe of the Rectangle :");
        int width=sc.nextInt();
        System.out.println("Enter the length of the Rectangle :");
        int length =sc.nextInt();

        int area=length*width;

        System.out.println("The area of the rectangle : "+area);
    }
}
