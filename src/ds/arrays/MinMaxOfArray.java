package ds.arrays;


public class MinMaxOfArray {

    public static class Pair {
        public int min;
        public int max;
    }

    public Pair getMinMax(int[] array, int n) {
        Pair minMax = new Pair();

        if (n == 0) {
            return new Pair();
        }

        if (n == 1) {
            minMax.min = array[0];
            minMax.max = array[0];
            return minMax;
        }

        if (array[0] > array[1]) {
            minMax.min = array[0];
            minMax.max = array[1];
        } else {
            minMax.min = array[1];
            minMax.max = array[0];
        }

        for (int i = 2; i < n; i++) {
            if (minMax.min > array[i]) {
                minMax.min = array[i];
            }

            if (minMax.max < array[i]) {
                minMax.max = array[i];
            }
        }

        return minMax;
    }
}
