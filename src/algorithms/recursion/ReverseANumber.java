package algorithms.recursion;

public class ReverseANumber {
    public int reverse(int n) {
        if (n < 10) {
            return n;
        }

        return (n % 10) * 10 + reverse(n / 10);
    }
}