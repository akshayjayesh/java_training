import java.util.*;
public class ItemCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price ad Quantity OF Product u Brought  :");
        int price=sc.nextInt();
        int quantity=sc.nextInt();

        int total_price=price*quantity;
        System.out.println("Total amount u need to pay  :"+total_price);
    }
}
