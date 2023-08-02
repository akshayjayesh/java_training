import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subjects u have  :");
        int sub=sc.nextInt();
    int[] arr =new int[sub];
    for (int i=0;i<arr.length;i++){
        System.out.println("Enter the mark od subject "+(i+1)+"  =");
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum=sum+arr[i];

    }
        System.out.println("Total marks you Scores is :"+sum);
    }
}
