package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }


    // Node template
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;

        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }


    //Insert at First

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail= head;
        }
        size +=1;
    }

    // Insert Last

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
        }
        Node node = new Node(val);

        tail.next=node;
        tail=node;
        size++;
    }

    // insert at particular given index
    public void insertAtIndex(int val,int idx){
        if (idx == 0) {
            insertFirst(val);
            return;
        }
        if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next); // if you don't have this constructor
//        node.next=temp.next; -->right side connection
        temp.next=node;
        size++;


    }

    // using recursion 

    public void insertRecur(int val, int idx){

        Node temp = head;
        Recursion(val,idx,temp);


    }
    public void Recursion(int val, int idx,Node temp){
        if(temp==null){
            return;
        }
        if(idx==1){
            Node node = new Node( val);
            node.next=temp.next;
            temp.next=node;
            size++;
            return;
        }
        temp=temp.next;
        Recursion(val,idx-1,temp);
    }



    // DELETE NODES
    //Delete first
    public int DeleteFirst(){
        int val = head.val;
        head=head.next;
        if(head==null){
         tail=null;
        }

       size--;
    return val;
    }

    //DeleteLast
    public int  DeleteLast(){
        if(size<=1){
            return DeleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    //Delete given index node
    public int DeleteAtIndex(int index){
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size - 1) {
            return DeleteLast();
        }

        Node temp=get(index-1);
        int val = temp.next.val;
        temp.next=temp.next.next;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++){
           node=node.next;
        }
        return node;
    }

    //Display
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
