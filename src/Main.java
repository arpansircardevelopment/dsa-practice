import arrays.RemoveDuplicatesCyclicSort;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesCyclicSort removeDuplicates = new RemoveDuplicatesCyclicSort();
        int abc = removeDuplicates.findDuplicate(new int[]{3, 1, 3, 4, 2});
        System.out.println(abc);
    }
}