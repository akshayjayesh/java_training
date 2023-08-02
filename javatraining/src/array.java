import java.util.Scanner;

public class array
{
    public static void main(String[]args){
        int num=1;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = num;
                num++;

            }
        }
        System.out.println("the array is  :\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("Transpose of the array  :\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0;j<columns; j++) {
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
    }
}
