import java.util.LinkedList;
class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next=null;
        }
    }

    // add at first place head
    public void addfirst(String data){
       Node newNode=new Node(data);
       // if  no head means no linked list is present
       if(head == null){
           head=newNode;
        }else {
           newNode.next=head;
           head=newNode;
       }
    }

    public void addinbtwn()

    public void traversprint(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }

     public static void main(String[] args) {
        LL l1=new LL();
        l1.addfirst("a");
        l1.addfirst("b");
        l1.addfirst("c");

         l1.traversprint();
    }

}
