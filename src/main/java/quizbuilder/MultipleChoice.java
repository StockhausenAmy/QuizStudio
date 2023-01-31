package quizbuilder;

import java.util.ArrayList;

public class MultipleChoice extends Questions {

    public MultipleChoice(String question, ArrayList<String> answerOptions, String correctAnswer, String[] answerPrefixes) {
        super(question, answerOptions, correctAnswer, answerPrefixes);
    }

    public void printMultipleChoice() {
        System.out.println(getQuestion());
        int i = 0;
        for (String answer : getAnswerOptions()) {
            System.out.println(answerPrefixes[i] + answer + "\n");
            i++;
        }
    }

}
