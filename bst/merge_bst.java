import java.util.ArrayList;

public class merge_bst {
    static class Node{
        int data;
        Node left;
        Node right;
      
        Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
}    
}
public static  void inorder(Node root ,ArrayList<Integer>arr){
    if(root==null){
        return;
    }
inorder(root.left, arr);
arr.add(root.data);
inorder(root.right,arr);
}
public static Node createbst(ArrayList<Integer>arr,int start,int end){
   if(start>end){
    return null;
   }
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));
      root.left=  createbst(arr, start, mid-1);
      root.right=  createbst(arr, mid+1, end);
      return root;
    
}

public static Node mergebst(Node root1,Node root2){
    ArrayList<Integer>arr1=new ArrayList<>();
    inorder(root1, arr1);
    ArrayList<Integer>arr2=new ArrayList<>();
    inorder(root2, arr2);
    //merge
    ArrayList<Integer>finalarr=new ArrayList<>();
    int i=0;
    int j=0;
    while(i<arr1.size()&&j<arr2.size()){
        if(arr1.get(i)<=arr2.get(i)){
            finalarr.add(arr1.get(i));
            i++;
        }
        else{
            finalarr.add(arr2.get(j));
            j++;
        }

    }
    while(i<arr1.size()){
        finalarr.add(arr1.get(i));
        i++;
    }
     while(j<arr2.size()){
        finalarr.add(arr2.get(j));
        j++;
    }
   return createbst(finalarr, 0, finalarr.size()-1);

}
public static void preorder(Node root){
    if(root==null){
        return;

    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
}
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
            Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node root=mergebst(root1, root2);
        preorder(root);
        
    }
    
}
