import arrays.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int unique = removeDuplicates.removeDuplicates(new int[]{1, 1, 2});
        System.out.println(unique);
    }
}