import algorithms.searching.binary.BinarySearch;
import algorithms.searching.binary.OrderAgnosticBinarySearch;
import arrays.FindNumbersWithEvenDigits;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        OrderAgnosticBinarySearch agnosticBinarySearch = new OrderAgnosticBinarySearch();
        int location = agnosticBinarySearch.search(new int[]{50, 40, 30, 20, 10}, 40);
        System.out.println(location);
    }
}