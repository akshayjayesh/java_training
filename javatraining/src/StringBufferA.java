
import java.lang.*;
public class StringBufferA {
    public static void Stringa(int a){
        System.out.println(a);
    }

    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("jshfshsfjskfhkfhfnfjfjnfbfb");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.insert(0,'a'));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append('c'));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.delete(1,sb.length()-1));
       StringBuffer ab= new StringBuffer(sb.delete(1,sb.length()-1));
//       StringBuffer ac;
//        System.out.println(ac.capacity());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(ab.capacity());
        System.out.println(ab.length());
        System.out.println(ab);
        int a=ab.length();
        Stringa( a);

    }
}
