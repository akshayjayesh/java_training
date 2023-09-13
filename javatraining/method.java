public class method {
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[]args){
        method obj =new method();
        int c=obj.sum(2,3);
        System.out.println("Sum of numbers :"+c);
    }
}
