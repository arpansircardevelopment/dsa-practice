import arrays.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int output = majorityElement.majorityElement(new int[]{3,2,3});
        System.out.println(output);
    }
}