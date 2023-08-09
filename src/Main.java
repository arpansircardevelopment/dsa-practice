import algorithms.searching.binary.BinarySearch;
import arrays.FindNumbersWithEvenDigits;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int location = binarySearch.search(new int[]{10, 20, 30, 40, 50}, 35);
        System.out.println(location);
    }
}