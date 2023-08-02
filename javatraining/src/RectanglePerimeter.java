import java.util.*;
public class RectanglePerimeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length and Breadth");
        int length =sc.nextInt();
        int bredth=sc.nextInt();

        int perimeter=2*(length+bredth);
        System.out.println("Perimeter is ="+perimeter);
    }
}
