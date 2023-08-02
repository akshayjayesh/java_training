import java.util.Scanner;

public class Vowerls {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        char[] arr ={'a','e','i','o','u'};
        System.out.println("Enter a character");
        String n=sc.nextLine();
        for (int i=0;i< arr.length;i++){
            if(arr[i]==n.charAt(i)){
                System.out.println("its a vowel");
                break;

            }
            else{
                System.out.println("not a vowel...");
            }
        }
        }


}
