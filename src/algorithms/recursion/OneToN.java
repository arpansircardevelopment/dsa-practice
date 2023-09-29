package algorithms.recursion;

public class OneToN {
    public void iterate(int n) {
        if (n == 0) {
            return;
        }

        iterate(n - 1);
        System.out.println(n);
    }
}
