public class FibanocciRecurssion {
    public static void fibba(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibba(b,c,n-1);

    }
    public static void main(String[]args){
        int a=0;
        int b=1;
        int n=7;
        fibba(a,b,n-2);

    }
}
