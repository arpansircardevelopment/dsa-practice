import ds.linkedlist.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertFirst(50);

        dll.insertLast(60);
        dll.display();
    }
}