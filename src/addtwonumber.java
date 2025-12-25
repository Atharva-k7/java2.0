class LiL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
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

    }
    public static LiL addTwoLists(LiL l1, LiL l2) {
        LiL result = new LiL();
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
    public void traversprint(){
        LiL.Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }

   public static void main(String[] args) {
        LiL l1=new LiL();
        LiL l2=new LiL();

        l1.addLast(1);
       l1.addLast(2);
       l1.addLast(3);

       l2.addLast(3);
       l2.addLast(2);
       l2.addLast(1);

        addTwoLists(l1,l2).traversprint();
    }}