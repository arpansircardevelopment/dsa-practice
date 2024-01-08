import ds.linkedlist.LinkedListCycle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArray = new ArrayList<>();
        integerArray.add(10);
        integerArray.add(20);
        integerArray.add(30);
        integerArray.add(40);
        integerArray.add(50);

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean hasCycle = linkedListCycle.driver(integerArray);
        System.out.println("Has Cycle: " + hasCycle);
    }
}