package ds.arrays;

/**
 * Write a program to reverse an array or string
 */

public class ReverseArrayOrString {

    public String reverseString(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            newString = string.charAt(i) + newString;
        }
        return newString;
    }

    public int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
