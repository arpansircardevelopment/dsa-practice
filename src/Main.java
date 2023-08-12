import algorithms.searching.binary.FloorOfANumber;

public class Main {
    public static void main(String[] args) {
        FloorOfANumber floorOfANumber = new FloorOfANumber();
        int output = floorOfANumber.floor(new int[]{6, 9, 10, 13, 16, 19, 20}, 5);
        System.out.println(output);
    }
}