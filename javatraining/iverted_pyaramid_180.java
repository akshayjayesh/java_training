public class iverted_pyaramid_180 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner looop for space
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
