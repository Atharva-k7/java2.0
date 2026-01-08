class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev=currNode;
    }
    public static LL addTwoLists(LL l1, LL l2) {
        LL result = new LL();
        Node n1 = l1.head;
        Node n2 = l2.head;

        while (n1 != null && n2 != null) {
            int sum =(n1.data) + (n2.data);
            result.addLast(sum);
            n1 = n1.next;
            n2 = n2.next;
        }

        // If one list is longer, just copy remaining nodes
        while (n1 != null) {
            result.addLast(n1.data);
            n1 = n1.next;
        }
        while (n2 != null) {
            result.addLast(n2.data);
            n2 = n2.next;
        }

        return result;
    }


    // add at first place head
    public void addfirst(int data){
       Node newNode=new Node(data);
       // if  no head means no linked list is present
       if(head == null){
           head=newNode;
        }else {
           newNode.next=head;
           head=newNode;
       }
    }

    public void addtolist(int data){
        Node newNode=new Node(data);
        if(head == null){
           head=newNode;
        }else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;

            newNode.next=null;
        }


    }

    public void traversprint(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public void revtraversprint(){

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        while (currNode!=null){
            System.out.print(currNode.data+"-");
            currNode=currNode.prev;
        }
        System.out.print("null");
    }

     public static void main(String[] args) {
        LL l1=new LL();
        LL l2=new LL();
        l1.addLast(1);
         l1.addLast(2);
         l1.addLast(3);

         l2.addLast(4);
         l2.addLast(5);
         l2.addLast(6);


//         System.out.println("----------------");
//         addTwoLists(l1,l2).traversprint();
//         System.out.println("-----");
         l1.revtraversprint();
    }

}
