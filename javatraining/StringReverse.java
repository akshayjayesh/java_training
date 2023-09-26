public class StringReverse {
    public static void main(String[] args) {
        String a="my name is akshay";
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
        if(a.equals(rev)){
            System.out.println("it is  equal");

        }
        else{
            System.out.println("it is not equal");
        }
    }
}
