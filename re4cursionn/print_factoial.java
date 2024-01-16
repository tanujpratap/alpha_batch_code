public class print_factoial {
public static int printfact(int n){
    if(n==1){
       
        return n;
    }
   return  n*printfact(n-1);

}
public static void main(String[] args) {
int n=5;
System.out.println(printfact(n));
}
    
}
