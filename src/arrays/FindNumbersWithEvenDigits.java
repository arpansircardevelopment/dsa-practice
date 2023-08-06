package arrays;

public class FindNumbersWithEvenDigits {
    public int bruteForceApproach(int[] arr) {
        int countEvenNumbers = 0;
        for (int number : arr) {
            if (isEven(number)) {
                countEvenNumbers++;
            }
        }

        return countEvenNumbers;
    }

    private boolean isEven(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count % 2 == 0;
    }

    public int optimizedApproach(int[] arr) {
        int count = 0;
        for (int number : arr) {
            int currentDigits = (int) Math.log10(number) + 1;
            if (currentDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
