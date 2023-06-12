import arrays.FindDuplicatesInAnArray;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindDuplicatesInAnArray duplicates = new FindDuplicatesInAnArray();
        List<Integer> output = duplicates.findDuplicatesInArray(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(output);
    }
}