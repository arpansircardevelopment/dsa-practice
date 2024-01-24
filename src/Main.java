import ds.linkedlist.LinkedListMergeSort;
import ds.linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 50; i >= 0; i = i - 10) {
            list.insertLast(i);
        }

        list.display();
        LinkedListMergeSort sorting = new LinkedListMergeSort();
        sorting.mergeSort(list.getHead());
        list.display();
    }
}