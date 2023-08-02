public class MaximumMethods {
    public static void Maximum(int a,int b){
        if(a>b){
            System.out.println("a is greater than b  :"+a);
        }
        else{
            System.out.println(" b is greater than a :"+b);
        }
    }
    public static  void main(String[]args){
        int a=10;
        int b=5;
        Maximum(a,b);
        MaximumMethods m=new MaximumMethods();
       m.Maximum(10,20);

    }
}
