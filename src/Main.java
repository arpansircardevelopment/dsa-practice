import ds.linkedlist.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.display();
        dll.deleteFirst();
        dll.deleteFirst();
    }
}