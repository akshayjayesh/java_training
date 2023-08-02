import java.util.*;

public class lecture3 {
    public static void main(String[] args){
       int age=25;
       double height=1.75;
       char grade='A';
       boolean isStudent=true;

       String name="john Doe";
       int[] numbers={1,2,3,4,5};


        System.out.println("name :" +name);
        System.out.println("height :" +height);
        System.out.println("grade"+grade);
        System.out.println("isStudent"+isStudent);
        System.out.println("age:"+age);

        System.out.println("Numbers :");
        for(int num=0;num<= numbers.length;num++){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}
