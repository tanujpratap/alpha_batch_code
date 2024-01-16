public class is_valid_bst {
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
    static class info{
        boolean isbst;
        int min;
        int max;
        int size;
        info(boolean isbst,int max,int min ,int size){
            this.isbst=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxbst=0;
    public static info largestbst(Node root){
        if(root==null){
            return new info(true,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        }
info leftinfo=largestbst(root.left);
info rightinfo= largestbst(root.right);
int size=leftinfo.size+rightinfo.size+1;
int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
if(root.data<=leftinfo.max || root.data>=rightinfo.min){
    return new info(false, max, min, size);
}
if(leftinfo.isbst&&rightinfo.isbst){
    maxbst=Math.max(maxbst,size);
  return  new info(true,max,min,size);
}
 return new info(false,max,min,size);
    }
 
    public static void main(String[] args) {
           Node root=new Node ( 50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
            root.right.right.left=new Node(65);
             root.right.right.right=new Node(80);
        info Info=largestbst(root);
        System.out.println(maxbst);
    }
    
}
