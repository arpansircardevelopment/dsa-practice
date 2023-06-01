import striver_dsa_sheet.QuestionThree;

public class Main {
    public static void main(String[] args) {
        QuestionThree questionThree = new QuestionThree();
        int unique = questionThree.removeDuplicates(new int[]{1, 1, 2});
        System.out.println(unique);
    }
}