import java.util.ArrayList;

public class convert_bst_to_balanced_bsst {
    static class Node{
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
            public static void inorder(Node root,ArrayList<Integer>list){
                if(root==null){
                    return ;
                }
                inorder(root.left, list);
             list.add(root.data);
             inorder(root.right, list);

            }
            public static Node balanced_bst(ArrayList<Integer>list, int start,int end){
                
                
                int mid=(start+end)/2;
                if(start>end){
                    return null;
                }
                Node root=new Node(list.get(mid));
                root.left=balanced_bst( list,start, mid-1);
                root.right=balanced_bst( list,mid+1, end);
                return root;
            }
            public static Node complete_balanced_bst(Node root){
   ArrayList<Integer>list=new ArrayList<>();
inorder(root,list);
 root=balanced_bst(list, 0, list.size()-1);
return root;

            }
    public static void main(String[] args) {
        
        Node root=new Node ( 8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
      

 root=complete_balanced_bst(root);
preorder(root);
    }
}
