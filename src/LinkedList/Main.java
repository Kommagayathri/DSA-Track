package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertLast(10);
        list.insertAtIndex(14,3);
        System.out.println(list.DeleteFirst());
        list.Display();
    }
}

