package algorithms.recursion;

public class RemoveAWordFromAString {
    public String removeWord(String original, String word) {
        if (original.isEmpty()) {
            return "";
        }

        if (original.startsWith(word)) {
            return removeWord(original.substring(word.length()), word);
        } else {
            return original.charAt(0) + removeWord(original.substring(1), word);
        }
    }
}
