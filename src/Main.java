import algorithms.searching.binary.CeilingOfANumber;
import algorithms.searching.binary.FloorOfANumber;

public class Main {
    public static void main(String[] args) {
        CeilingOfANumber ceiling = new CeilingOfANumber();
        int output = ceiling.ceiling(new int[]{6, 9, 10, 13, 16, 19, 20}, 21);
        System.out.println(output);
    }
}