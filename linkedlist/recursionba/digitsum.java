public class digitsum {
     public static void main(String[] args) {
       System.out.println(prsum(1234));
    }
        static int prsum(int n){
            if(n==0){
                return 0;
            }
            return (n%10)+prsum(n/10);
        }
    
    
}
