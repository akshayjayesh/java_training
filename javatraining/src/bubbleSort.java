import java.util.*;
public class bubbleSort {
    public static void PrintArray(int arr[]){

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("The second largest array" );


int n= arr.length;

            while(true) {
                if (n > 0) {
                    if (arr[n] != arr[n-1]) {
                        System.out.println(arr[n - 1]);
                        break;
                    }
                    else{
                        n--;
                    }
                }
                else{
                    System.out.println("all are same");
                    break;
                }
            }
        }

    public static void main(String[]args){
        int arr[]={8,8,8,1,3};

        for(int i = 0;i< arr.length-1; i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArray(arr);
    }
}
