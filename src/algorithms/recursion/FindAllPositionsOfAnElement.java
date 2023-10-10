package algorithms.recursion;

import java.util.ArrayList;

public class FindAllPositionsOfAnElement {
    public ArrayList<Integer> find(int[] array, int element) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return helper(array, element, 0, arrayList);
    }

    private ArrayList<Integer> helper(int[] array, int element, int position, ArrayList<Integer> arrayList) {
        if (position == array.length) {
            return arrayList;
        }

        if (array[position] == element) {
            arrayList.add(position);
        }

        return helper(array, element, position + 1, arrayList);
    }
}
