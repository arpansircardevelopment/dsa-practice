package algorithms.recursion;

public class OneToN {
    public void iterate(int n, int current) {
        System.out.println(current);
        if (current == n) {
            return;
        }
        iterate(n, current + 1);
    }
}
