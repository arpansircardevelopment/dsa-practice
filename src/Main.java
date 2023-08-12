import algorithms.searching.binary.CeilingOfANumber;
import algorithms.searching.binary.FloorOfANumber;
import algorithms.searching.binary.SmallestLetterGreaterThanTarget;

public class Main {
    public static void main(String[] args) {
        SmallestLetterGreaterThanTarget smallestLetterGreaterThanTarget = new SmallestLetterGreaterThanTarget();
        char output = smallestLetterGreaterThanTarget.smallestLetter(new char[]{'c', 'f', 'j'}, 'd');
        System.out.println(output);
    }
}