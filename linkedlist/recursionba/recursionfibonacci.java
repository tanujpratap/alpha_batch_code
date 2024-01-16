public class recursionfibonacci {
    public static void main(String[] args) {
        fibonacci(1);
        
        
    }
    static int fibonacci(int n){
        if (n==5){
            return n;
        }
        
        System.out.println(n);
        return n+fibonacci(n-1);

    }
}
