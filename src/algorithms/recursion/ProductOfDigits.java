package algorithms.recursion;

public class ProductOfDigits {
    public int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * productOfDigits(n / 10);
    }
}
