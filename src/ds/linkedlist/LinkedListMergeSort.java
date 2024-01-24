package ds.linkedlist;

public class LinkedListMergeSort {

    public SinglyLinkedList.Node mergeSort(SinglyLinkedList.Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedList.Node mid = getMid(head);
        SinglyLinkedList.Node left = mergeSort(head);
        SinglyLinkedList.Node right = mergeSort(mid);

        return merge(left, right);
    }

    private SinglyLinkedList.Node merge(SinglyLinkedList.Node left, SinglyLinkedList.Node right) {
        SinglyLinkedList.Node dummyHead = new SinglyLinkedList.Node();
        SinglyLinkedList.Node tail = dummyHead;

        while (left != null && right != null) {
            if (left.value < right.value) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
            } else {
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }
        tail.next = (left != null) ? left : right;
        return dummyHead.next;
    }

    private SinglyLinkedList.Node getMid(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node midPrev = null;

        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        SinglyLinkedList.Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
