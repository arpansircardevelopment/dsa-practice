package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> completeTriangle(int index) {
        List<List<Integer>> resultArray = new ArrayList<>();
        List<Integer> tempArray, lastArray = null;

        for (int i = 0; i < index; i++) {
            tempArray = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tempArray.add(1);
                } else {
                    tempArray.add(lastArray.get(j - 1) + lastArray.get(j));
                }
            }

            lastArray = tempArray;
            resultArray.add(tempArray);
        }

        return resultArray;
    }
}
