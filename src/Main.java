import arrays.FindNumbersWithEvenDigits;

public class Main {
    public static void main(String[] args) {
        FindNumbersWithEvenDigits findNumbersWithEvenDigits = new FindNumbersWithEvenDigits();
        int count = findNumbersWithEvenDigits.optimizedApproach(new int[]{10, 200, 3000, 40000, 5});
        System.out.println(count);
    }
}