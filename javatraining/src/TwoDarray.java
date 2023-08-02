
import java.util.*;
public class TwoDarray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        System.out.println("Enter array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Array u Entered");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
//        System.out.println("Enter a number to search");
//        int n = sc.nextInt();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if ( arr[i][j]==n) {
//                    System.out.println("Element found at (" + i + " ," + j+")");
//
//                }
//            }
//
//        }

    }




}
