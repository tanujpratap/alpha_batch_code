public class ccreate_balanced_bst_by_sorted_array{
  static    class Node{
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;

            }
        }
            public static void preorder(Node root){
                if(root==null){
                    return;
                }
                System.out.print(root.data);
                preorder(root.left);
                preorder(root.right);
            }
            public static Node createbst(int []arr,int start,int end){
                int mid=(start+end)/2;
                if(start>end){
                    return null;
                }
                Node root=new Node(arr[mid]);
             root.left=   createbst(arr,start,mid-1);
               root.right= createbst(arr,mid+1,end);

                return root;
                
            }
            
        
    public static void main(String[] args) {
      int[]arr={3,5,6,8,10,11,12};
      int start=0;
      int end=arr.length-1;
   Node root=   createbst(arr,start,end);
      preorder(root);
    }
   
    }
