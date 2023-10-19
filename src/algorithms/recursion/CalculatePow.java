package algorithms.recursion;

public class CalculatePow {
    public void calculate(double x, int n) {
        long nn = n;
        if (nn < 0) {
            nn = -1 * nn;
        }
        double ans = helper(x, nn, 1);
        if (n < 0) {
            ans = 1.0 / ans;
        }
        System.out.println(ans);
    }

    private double helper(double x, long nn, double ans) {
        if (nn <= 0) {
            return ans;
        }

        if (nn % 2 == 1) {
            ans = ans * x;
            return helper(x, nn - 1, ans);
        } else {
            return helper(x * x, nn / 2, ans);
        }
    }
}
