package algorithms.searching.linear;

public class SearchElementInString {

    // go through the string to check if the character element is present or not
    // if the element present, return the index
    // if the element is not present, return - 1
    public int findElementInString(String word, char element) {
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current == element) {
                return i;
            }
        }
        return -1;
    }

}
