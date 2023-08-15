import algorithms.searching.binary.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PeakIndexInMountainArray peak = new PeakIndexInMountainArray();
        int output = peak.peakIndexInMountainArray(new int[]{0, 10, 5, 2});
        System.out.println(output);
    }
}