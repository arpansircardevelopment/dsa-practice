package algorithms.recursion;

public class FindAnElement {
    public boolean find(int[] array, int element) {
        return helper(array, element, 0);
    }

    private boolean helper(int[] array, int element, int position) {
        if (position == array.length - 1) {
            return array[position] == element;
        }

        return array[position] == element || helper(array, element, position + 1);
    }
}
