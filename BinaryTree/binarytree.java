package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class  binarytree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public   Node buildtree(int node[]) {
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

        public static void preorder(Node root){// time complexity 0(n)
            if(root==null){
                System.out.print("|-1|  ");
                return;

            }
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root){
        if(root==null){
            return ;
        }
            inorder(root.left);
            System.out.print(root.data+"  ");
            inorder(root.right);

        }
    public static void postorder(Node root){
        if(root==null){

            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+",");

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
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if (currnode.right!=null){
                    q.add(currnode.right);
                }

            }
        }

    }
        public static int  countNodes(Node root){

            if(root == null){
            return 0;
        }

          int left= countNodes(root.left);
          int right= countNodes(root.right);
           return left +right+1;
        }
        public static int sumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofNodes(root.left);
        int rightsum=sumofNodes(root.right);

        return leftsum+rightsum+root.data;
        }
    public static int heightofTree(Node root)
    {
        if(root== null){
            return 0;
        }
        return Math.max(heightofTree(root.left),heightofTree(root.right))+1;
    }
    public static int  diameterofTree(Node root){

            if (root == null) return 0;
            int leftHeight = heightofTree(root.left);
            int rightHeight = heightofTree(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;

            int leftDiameter = diameterofTree(root.left);
            int rightDiameter = diameterofTree(root.right);

            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }

            public static boolean subtree(Node root,Node subroot){
            if(subroot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if(identifying(root,subroot)){
                    return true;
                }

            }
            return subtree(root.right,subroot)||subtree(root.left,subroot);
            }
public static boolean identifying(Node root, Node subroot){
        if(root==null&&subroot==null){
            return true;}
        if(root==null||subroot==null){
            return false;
        }
        if(root.data==subroot.data){
            return identifying(root.left,subroot.left)&&identifying(root.right,subroot.right);
    }
        return false;
    }
            public static void main(String[] args) {
                int node[] = {3,4,1,-1,-1,2,0,-1,-1,-1,5,-1,-1};
                int subnode[] = {4,1,-1,-1,2,-1,-1};
            BinaryTree t1 = new BinaryTree();
            BinaryTree t2=new BinaryTree();
            Node root=t1.buildtree(node);
            Node subroot=t2.buildtree(subnode);
                System.out.println(subtree(root,subroot));
        }
    }
