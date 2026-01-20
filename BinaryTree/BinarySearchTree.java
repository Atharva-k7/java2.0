package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
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
     public static void levelorder(Node root){
         if(root==null){
             return;
         }
         Queue<Node> q=new LinkedList<>();
         q.add(root);
         q.add(null);

         while(!q.isEmpty()){
           Node currnode=q.remove();

             if(currnode==null){
                 System.out.println();
                 if(q.isEmpty()){
                     break;
                 }else{
                     q.add(null);
                 }
             }else{
                 System.out.print(currnode.value+" ");
                 if(currnode.left!=null){
                     q.add(currnode.left);
                 }
                 if (currnode.right!=null){
                     q.add(currnode.right);
                 }
             }
         }
     }
     public static void inorderbst(Node root){
       if(root==null){
           return;
       }
       Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currnode= q.remove();
            if(currnode==null){
                System.out.println();

            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
            
        }

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

            levelorder(root);

        }

}
