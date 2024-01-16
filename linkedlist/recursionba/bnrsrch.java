public class bnrsrch {
    public static void main(String[] args) {
        int a []={1,10,20,30,40,90};
        System.out.println(binarysearch(a,30));
    }
    static int binarysearch(int a[],int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            else if (key>a[mid]) {
                low=mid+1;
                
            } else {
                high=mid-1;
            }
            
        }
        return -1;
    }
    
}
