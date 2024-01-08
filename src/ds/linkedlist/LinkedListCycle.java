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

    public int lengthOfCycle(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                SinglyLinkedList.Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public SinglyLinkedList.Node detectCycle(SinglyLinkedList.Node head) {
        int length = 0;

        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        SinglyLinkedList.Node f = head;
        SinglyLinkedList.Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean driver(ArrayList<Integer> elements) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        elements.forEach(integer -> {
            SinglyLinkedList.Node node = new SinglyLinkedList.Node(integer);
            singlyLinkedList.insertLast(node);
        });

        if (elements.size() >= 2) {
            SinglyLinkedList.Node lastNode = singlyLinkedList.get(singlyLinkedList.getSize() - 1);
            lastNode.next = singlyLinkedList.get(singlyLinkedList.getSize() - 3);
        } else {
            return false;
        }

        System.out.println("Length of cycle: " + lengthOfCycle(singlyLinkedList.get(0)));
        return hasCycle(singlyLinkedList.get(0));
    }
}
