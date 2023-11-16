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

    public String removeWordButNotWord2(String original, String word, String word2) {
        if (original.isEmpty()) {
            return "";
        }

        if (original.startsWith(word) && !original.startsWith(word2)) {
            return removeWordButNotWord2(original.substring(word.length()), word, word2);
        } else {
            return original.charAt(0) + removeWordButNotWord2(original.substring(1), word, word2);
        }
    }
}
