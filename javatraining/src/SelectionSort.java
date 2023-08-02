public class SelectionSort {
    public static void PrintArray(int arr[]){

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int arr[]={8,7,2,1,3};

        for(int i = 0;i< arr.length-1; i++) {
            int smaller=i;
            for(int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[smaller]){
                    smaller=j;
                }
            }
            int temp=arr[smaller];
            arr[smaller]=arr[i];
            arr[i]=temp;
        }
        PrintArray(arr);
        }
}
