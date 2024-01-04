import ds.linkedlist.CircularLinkedList;
import ds.linkedlist.DoublyLinkedList;
import ds.linkedlist.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList first = new SinglyLinkedList();
        SinglyLinkedList second = new SinglyLinkedList();

        second.insertLast(0);

        SinglyLinkedList answer = SinglyLinkedList.merge(first, second);
        answer.display();
    }
}