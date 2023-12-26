import algorithms.recursion.backtracking.NQueens;
import ds.linkedlist.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(7);
        list.insertLast(10);
        list.insertLast(17);
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}