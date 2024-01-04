package ds.linkedlist;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LinkedListCycle {
    private boolean hasCycle(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public boolean driver(ArrayList<Integer> elements) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        elements.forEach(integer -> {
            SinglyLinkedList.Node node = new SinglyLinkedList.Node(integer);
            singlyLinkedList.insertLast(node);
        });

        if (elements.size() >= 2) {
            SinglyLinkedList.Node lastNode = singlyLinkedList.get(singlyLinkedList.getSize() - 1);
            lastNode.next = singlyLinkedList.get(singlyLinkedList.getSize() - 2);
        } else {
            return false;
        }

        return hasCycle(singlyLinkedList.get(0));
    }
}
