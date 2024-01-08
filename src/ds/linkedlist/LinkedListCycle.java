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

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }

    public SinglyLinkedList.Node lengthOfLinkedList(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node slow = head;
        SinglyLinkedList.Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
