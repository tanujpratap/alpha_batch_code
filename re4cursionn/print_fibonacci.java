public class print_fibonacci {
    public static int print_fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return print_fibonacci(n-1)+print_fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(print_fibonacci(n));
    }
}
