package algorithms.recursion;

public class SumOfNNumbers {
    public int iterate(int n) {
        if (n == 1) {
            return 1;
        }
        return n + iterate(n - 1);
    }
}
