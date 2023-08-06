package algorithms.searching.linear;

public class SearchElementInArray {

    // go through the array to check if the element is present or not
    // if the element is present, return the index
    // if the element is not present, return -1
    public int findElementInArray(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        // if the above if-block isn't executed, we will execute this statement
        return -1;
    }

}
