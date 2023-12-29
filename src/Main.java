import ds.linkedlist.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.delete(2);
        dll.display();
    }
}