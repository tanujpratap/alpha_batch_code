public class sum_of_n {
   public static int printsum(int n){
        if(n==1){
            return n;
        }
        return n+printsum(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printsum(n));
    }
}
    

