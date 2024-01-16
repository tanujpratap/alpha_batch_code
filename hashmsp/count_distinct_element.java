import java.util.HashSet;

public class count_distinct_element {
    static HashSet<Integer>hs=new HashSet<>();
    public static int count_element(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
hs.add(arr[i]);

        }
        // for(Integer element:hs){
            
        //     count++;
        // }
        // return count;
        
return  hs.size();
    }
    public static void main(String[] args) {
        int []arr={4,3,2,5,6,7,3,4,2,1};
System.out.println(count_element(arr));
    }
}
