import java.util.Scanner;

public class ReaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base and Height Of Triangle :");
        int base=sc.nextInt();
        int height=sc.nextInt();
 int area_tria=(height*base)/2;

        System.out.println("Total area of the triangle is: "+area_tria);
    }
}
