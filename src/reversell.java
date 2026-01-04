import org.w3c.dom.ls.LSOutput;

class reversell {
    Node head;
class Node{
    int data;
    Node next;

        Node(int data){
            this.next=null;
            this.data=data;
        }
}
    public void add(int data){
        Node newNode=new Node(data);
        if (head==null){
           head=newNode;
        }else{
        newNode.next=head;
        head=newNode;
    }
}

public void traversalprint(){
   Node curr=head;
   while(curr!=null){
       System.out.print(curr.data+"->");
       curr=curr.next;
   }

}
public void returnhead(){
    int a=head.data;
    System.out.println(a);
}

public void addlast(int data){
    Node newNode=new Node(data);
    Node curr=null;
    if(head==null){
        head=newNode;
        curr=head;
    }
    curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=newNode;
}
    public void llrev(){
       Node curr=head;
       Node prev=null;
       Node next=head;
       while (curr!=null){
       next=curr.next;
       curr.next=prev;
       prev=curr;
       curr=next;
       }
       head=prev;
    }
    public static void main(String[] args) {
        reversell r1=new reversell();
//        r1.add(0);
        r1.addlast(1);
        r1.addlast(2);
        r1.addlast(3);
        // ------------------------- //
        r1.llrev();
        r1.traversalprint();
    }
}