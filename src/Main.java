import arrays.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MajorityElement2 majorityElement2 = new MajorityElement2();
        List<Integer> output = majorityElement2.majorityElement(new int[]{3, 2, 3});
        System.out.println(output.toString());
    }
}