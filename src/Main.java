import ds.linkedlist.CircularLinkedList;
import ds.linkedlist.DoublyLinkedList;
import ds.linkedlist.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(10, 0);
        singlyLinkedList.insert(20, 1);
        singlyLinkedList.insert(30, 2);
        singlyLinkedList.insertRec(40, 3);
//        singlyLinkedList.insertRec(50, 4);
        singlyLinkedList.display();
    }
}