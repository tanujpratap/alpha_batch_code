public class recursionsum {
    public static void main(String[] args) {
        System.out.println(recursionsum(4));
        
    }
    static int recursionsum(int n){
        if(n==5){
            return 5;

        }
        return n+recursionsum(n+1);
    }
}
