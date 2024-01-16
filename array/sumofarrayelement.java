import java.util.Scanner;
public class sumofarrayelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[]arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

          //  System.out.println(sum);
        }
        System.out.println("the sum of the array is-"+sum);
    }
    
}
