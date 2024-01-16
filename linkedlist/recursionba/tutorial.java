public class tutorial {
    public static void main(String[] args) {
        
        
        printnatural(1);
        
    }
    /**
     * @param n
     * @return
     */
    static int printnatural(int n){
        if(n==51){
            return n;
        }
        System.out.println(n);
        
        return printnatural(n+1);
        
    }
    
}
