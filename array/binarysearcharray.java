public class binarysearcharray {
    public static void main(String[] args) {
        int[]arr={12,13,14,17,57,89};
       int c=binarysearch(arr, 57);
       System.out.println(c);
    }
     //   int[]arr={12,13,14,17,57,89};
        int start=0,end=arr.length-1,mid=(start+end)/2;
       static int binarysearch(int a,int key){
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            if(key>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;

        }
       return -1;
    }
}
    

