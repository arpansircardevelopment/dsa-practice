package algorithms.recursion;

// Write a program to print numbers up to 5 by using recursion
public class Recursion {
    public void recursion() {
        iterate(1);
    }

    private void iterate(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        iterate(n + 1);
    }
}
