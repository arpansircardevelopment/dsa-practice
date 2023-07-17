import arrays.PascalTriangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.completeTriangle(5);

        for (List<Integer> i : result) {
            System.out.println(i);
        }
    }
}