package BinaryTree;

import java.util.SortedMap;

 public class BinarySearchTree {
   static class Node {

       int value;
       Node left;
       Node right;

       Node(int value) {
           this.value = value;
           this.left = null;
           this.right = null;
       }
   }
     static class BST{
         int idx=-1;

     public Node buildtree(int node[]) {
        idx++;
         if (node[idx] == -1) {
             return null;
         }
         Node newNode = new Node(node[idx]);
         newNode.left = buildtree(node);
         newNode.right = buildtree(node);
         return newNode;
     }
     }
     public static Node insertBST(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.value>val){
            root.left=insertBST(root.left,val);
        }else{
            root.right=insertBST(root.right,val);
        }
        return root;
    }
     public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);

    }
    public static boolean seacrhBSt(Node root,int key){
        if (root == null) {
            return false;
        }
        if(root.value>key){
           return seacrhBSt(root.left,key);
        }
        else if (root.value==key) {
            return true;
        }
        else{
            return seacrhBSt(root.right,key);
        }
    }

        static void main(String[] args) {
            int[] values = {8,5,3,1,4,6,10,11,14};
            Node root=null;
            int key=1;

            for (int i = 0; i <values.length ; i++) {
               root= insertBST(root,values[i]);
            }
            inorder(root);
            System.out.println();
            if(seacrhBSt(root,1)){
                System.out.println("found it ride it ");
            }else {
                System.out.println("we are very sorry hes dead");
            }


        }

}
