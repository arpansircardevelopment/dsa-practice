package ds.linkedlist;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int value) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node temp = head;
        int location = 0;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            location++;
            temp = temp.next;
        }
        return null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }

        int val = head.value;
        head = head.next;
        System.out.println(val + " deleted");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }

        if (head.next == null) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        int value = temp.value;
        temp.prev.next = null;
        System.out.println(value + " deleted");
    }

    public void display() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}