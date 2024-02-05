package ds.linkedlist;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node temp = head;
        int val;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        val = temp.next.value;
        temp.next = null;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void removeDuplicates() {
        Node temp = head;

        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }

        tail = temp;
        tail.next = null;
    }

    public static SinglyLinkedList merge(SinglyLinkedList first, SinglyLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public int find(int value) {
        Node temp = head;
        int location = 0;
        while (temp != null) {
            if (temp.value == value) {
                return location;
            }
            location++;
            temp = temp.next;
        }
        return -1;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public void reverseLinkedListIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node next;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseLinkedListRecursive() {
        head = reverseLLRecursive(head);
    }

    private Node reverseLLRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLLRecursive(head.next);
        Node next = head.next;
        next.next = head;
        head.next = null;
        return newHead;
    }

    public void reverseBetweenDriver() {
        Node current = reverseBetween(head, 1, 1);
        display();
    }

    private Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node next = null;

        if (current != null) {
            next = current.next;
        }

        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = next;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    private Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public boolean isPalindromeDriver() {
        return isPalindrome(head);
    }

    private boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseLLRecursive(mid);
        Node reReverseHead = headSecond;

        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseLLRecursive(reReverseHead);
        return head == null || headSecond == null;
    }

    public static class Node {
        public int value;
        public Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
