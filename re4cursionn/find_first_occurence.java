public class find_first_occurence {
    public static int findoccurence(int arr[],int i,int key){
if(i==arr.length-1){
    return -1;
}
if(arr[i]==key){
    return i;
}
return findoccurence(arr, i+1, key);
    }
    public static int find_last_occurence(int []arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfound=find_last_occurence(arr, i+1, key);
        if(isfound==-1 && arr[i]==key){
            return i;
            
        }
        return isfound;
       
    }
    public static void main(String[] args) {
        int i=0;
        int arr[]={1,2,3,4,5,6,1,2,3};
int key=3;
System.out.println(findoccurence(arr, i, key));
System.out.println(find_last_occurence(arr, i, key));
    }
    
}
