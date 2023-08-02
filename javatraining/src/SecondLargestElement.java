import java.util.*;
public class SecondLargestElement {
    public static void main(String[]args){
        int arr[]={8,8,2,3,1};

        for(int i = 0;i< arr.length-1; i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("The second largest array" );


        int n= arr.length-1;

        while(true) {
            if (n>0) {
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

    }


