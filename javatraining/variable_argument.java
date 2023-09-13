public class variable_argument {
    static int sum(int...arr){
        int res=0;
        for(int a:arr){
            res +=a;
        }
        return res;
    }

    {
        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));

    }
}

