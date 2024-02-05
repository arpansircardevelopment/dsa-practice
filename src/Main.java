import ds.linkedlist.LinkedListMergeSort;
import ds.linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i <= 10; i++) {
            list.insertLast(i);
        }

        list.reorderListDriver();
        list.display();
        System.out.println(list.isPalindromeDriver());
    }
}