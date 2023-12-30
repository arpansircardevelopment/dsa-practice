package ds.linkedlist;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void insertAtEnd(int val) {
        if (head == null) {
            insertAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void insertAtIndex(int val, int index) {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != tail && count < index - 1) {
            count++;
            temp = temp.next;
        }

        if (count != index - 1) {
            System.out.println("Index does not exist.");
            return;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
