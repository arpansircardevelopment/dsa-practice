import arrays.SetMismatch;;import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        int[] output = setMismatch.findTheSetMismatch(new int[]{1, 2, 2, 4});
        System.out.println(Arrays.toString(output));
    }
}