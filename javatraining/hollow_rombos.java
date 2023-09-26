public class hollow_rombos {

        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++){
                //space
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=n;j++){
//                System.out.print("*");
                    if(j==1||i==1||i==n||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

}
