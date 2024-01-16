public class find_powxn {
    public static int getpower(int x,int n){
        if(n==0){
            return 1;
        }
         
        return x*getpower(x, n-1);
    }
    // optimizedcode
    public static int getpowerr(int x,int n){
        if(n==1){
            return x;
        }
        if(n%2==0){
            return getpowerr(x, n/2)*getpowerr(x, n/2);
        }
        return x*getpowerr(x, n/2)*getpowerr(x, n/2);
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
     int p=   getpower(x, n);
     System.out.println(p);
     System.out.println(getpowerr(x, n));
    }
    
}
