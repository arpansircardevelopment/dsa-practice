package algorithms.recursion;

public class OneToNTo1 {
    public void iterate(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        iterate(n - 1);
        System.out.println(n);
    }
}
