package quizbuilder;
import java.util.ArrayList;

public abstract class Questions {

    private String question;
    private ArrayList<String> answerOptions = new ArrayList<String>();
    private String correctAnswer;
    public static String[] answerPrefixes = {"a. ","b. ","c. ","d. "};

    public Questions(String question, ArrayList<String> answerOptions, String correctAnswer, String[] answerPrefixes) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
        this.answerPrefixes = answerPrefixes;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
