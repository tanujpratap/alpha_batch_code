

public class print_one_to_n {
    public static void print_decreaseing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
       
        print_decreaseing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=13;
        print_decreaseing(n);
    }
    
}
