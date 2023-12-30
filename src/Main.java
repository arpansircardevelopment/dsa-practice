import ds.linkedlist.CircularLinkedList;
import ds.linkedlist.DoublyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertAtEnd(10);
        circularLinkedList.insertAtEnd(20);
//        circularLinkedList.insertAtEnd(30);
        circularLinkedList.insertAtIndex(40, 2);
        circularLinkedList.display();
    }
}