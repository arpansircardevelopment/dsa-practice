package algorithms.recursion;

import java.util.ArrayList;

public class FindAllPositionsOfAnElement {
    public ArrayList<Integer> find(int[] array, int element) {
        return helperWithoutArgs(array, element, 0);
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

    private ArrayList<Integer> helperWithoutArgs(int[] array, int element, int position) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (position == array.length) {
            return arrayList;
        }

        if (array[position] == element) {
            arrayList.add(position);
        }

        ArrayList<Integer> answerFromBelow = helperWithoutArgs(array, element, position + 1);
        arrayList.addAll(answerFromBelow);
        return arrayList;
    }
}
