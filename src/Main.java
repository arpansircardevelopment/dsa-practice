import ds.linkedlist.CircularLinkedList;
import ds.linkedlist.DoublyLinkedList;
import ds.linkedlist.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertLast(2);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.removeDuplicates();
        singlyLinkedList.display();
    }
}