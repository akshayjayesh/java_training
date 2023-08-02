import java.lang.String;
public class String_demo {
    public static void main(String[]args) {
        String name = "Rahul";
        System.out.println(name);
        System.out.println(name.hashCode());
        name = "vinod";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name.hashCode());
        String fullNmae = name;
        System.out.println(fullNmae.hashCode());
        System.out.println(fullNmae);
        name = "Rahal";
        System.out.println(name.hashCode());
//        for(int i=name.length()-1;i>=0;i--){
//            System.out.print(name.charAt(i));
//        }
        char ch;
//        System.out.println(name.equals(name));
        System.out.println(name.toUpperCase());
        for (int i = 0; i < name.length(); i++){
            ch = name.charAt(i);
            int freq = 0;
        for(int j = 0; j < name.length(); j++)
        {

    if (ch == name.charAt(j)) {
        ++freq;

    }


        }

            System.out.println("frequency of "+name.charAt(i)+" is :"+freq);



    }






    }
}
