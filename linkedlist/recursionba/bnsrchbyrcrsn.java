
public class bnsrchbyrcrsn {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        System.out.println(binarysearch(a, 30, 0, a.length-1));
        
    }
    static int binarysearch(int a[],int key,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(a[mid]==key){
            return mid;
        }
        if(key>a[mid])
        return binarysearch(a, key, mid+1, high);
        else{
            return binarysearch(a, key, low, mid-1);
        }
    }
    
}
