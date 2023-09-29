package algorithms.recursion;

public class NTo1 {
    public void iterate(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        iterate(n - 1);
    }
}
