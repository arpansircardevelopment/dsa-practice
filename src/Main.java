import ds.linkedlist.LinkedListMergeSort;
import ds.linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 1; i <= 5; i ++) {
            list.insertLast(i);
        }

        list.display();
        list.reverseBetweenDriver();
        list.display();
    }
}