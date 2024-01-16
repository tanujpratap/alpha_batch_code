public class maxm_sum_non_adjacent_ele {
   public static int findmaxm(int[] arr,int i ){
        if(i>=arr.length-1){
          return 0;
        }
  int include=     arr[i]+ findmaxm(arr, i+2);
  int exclude= findmaxm(arr, i+1);
return Math.max(include,exclude);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int sum=0;
        int i=0;
        int maxi=Integer.MIN_VALUE;
      
   int max= findmaxm(arr, i);
   System.out.println(max);
}}
