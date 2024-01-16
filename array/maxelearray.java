import java.util.Scanner;
public class maxelearray {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int[]a={1,2,3,4,5,6,7};
       // for(int i=0;i<a.length;i++){
       //    a[i]=sc.nextInt();
        
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
    
        System.out.println("the maximum value of the array is"+max);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("the minimum aarray"+min);
    }
    
}
