public class check_sorted {
    static boolean issorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
return false;
        }
     
return issorted(arr, i+1);
}
    
    public static void main(String[] args) {
        int i=0;
        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println(issorted(arr, i));
    }
}
