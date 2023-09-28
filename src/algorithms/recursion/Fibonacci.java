package algorithms.recursion;

public class Fibonacci {
    public void printFibonacci(int n) {
        int result = iterate(n);
        System.out.println(result);
    }

    private int iterate(int n) {
        if (n < 2) {
            return n;
        }
        return iterate(n - 1) + iterate(n - 2);
    }
}
