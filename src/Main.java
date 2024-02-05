import ds.linkedlist.LinkedListMergeSort;
import ds.linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(2);

        System.out.println(list.isPalindromeDriver());
    }
}