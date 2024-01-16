import java.util.*;
public class largest_num_array{
    public static int find_largest(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i= 0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                
            }
        }
        return max; 
    }
    public static void main(String[] args) {
        int []array={12,3,4,5,6,7,8};
        System.out.println(find_largest(array));
    }
}