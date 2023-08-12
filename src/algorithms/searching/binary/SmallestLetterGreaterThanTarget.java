package algorithms.searching.binary;

public class SmallestLetterGreaterThanTarget {

    public char smallestLetter(char[] array, char target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }

        return array[start % array.length];
    }
}
