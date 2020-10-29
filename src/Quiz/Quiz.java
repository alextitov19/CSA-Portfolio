package Quiz;

public class Quiz {
    public static void main(String[] args){ //just test code, as GUI has not yet been programed
        QuestionGenerator currentQuestion = new QuestionGenerator(2,9,10);
        System.out.println(currentQuestion.getQuestionText());
        for(int i=0; i<4; i++) {
            System.out.println(currentQuestion.getPossibleAnswers()[i]);
        }
        System.out.println(currentQuestion.getAnswer());

    }
}
