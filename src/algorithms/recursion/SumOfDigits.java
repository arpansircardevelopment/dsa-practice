package algorithms.recursion;

public class SumOfDigits {
    public int sumOfDigits(int n) {
        if (n % 10 == 0) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
