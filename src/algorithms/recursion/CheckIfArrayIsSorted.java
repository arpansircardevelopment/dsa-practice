package algorithms.recursion;

public class CheckIfArrayIsSorted {
    public boolean isSorted(int[] array) {
        return helper(array, 0);
    }

    private boolean helper(int[] array, int position) {
        if (position == array.length - 1) {
            return true;
        }

        return array[position] < array[position + 1] && helper(array, position + 1);
    }

}