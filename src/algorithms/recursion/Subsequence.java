package algorithms.recursion;

public class Subsequence {
    public void subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsequence(processed + ch, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }
}
