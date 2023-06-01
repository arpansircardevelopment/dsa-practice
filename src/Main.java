import striver_dsa_sheet.QuestionOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionOne questionOne = new QuestionOne();
        int[] response = questionOne.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(response));
    }
}
