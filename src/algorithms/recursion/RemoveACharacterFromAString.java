package algorithms.recursion;

public class RemoveACharacterFromAString {

    public void solutionOne(String original, String solution, char ch) {
        if (original.isEmpty()) {
            System.out.println(solution);
            return;
        }

        char currentCh = original.charAt(0);
        if (currentCh == ch) {
            solutionOne(original.substring(1), solution, ch);
        } else {
            solutionOne(original.substring(1), solution + currentCh, ch);
        }
    }

    public String solutionTwo(String original, char ch) {
        if (original.isEmpty()) {
            return "";
        }

        char currentCh = original.charAt(0);
        if (currentCh == ch) {
            return solutionTwo(original.substring(1), ch);
        } else {
            return currentCh + solutionTwo(original.substring(1), ch);
        }
    }
}
