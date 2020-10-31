package Quiz;

public class QuestionGenerator { //generates a question, given a  question type, and 2 parameters
    int questionType;
    int param1;
    int param2;
    int[] possibleAnswers = new int[4];

    public int getAnswer() {
        switch (questionType) { //types of problems are subject to change and addition; this is only a proof of concept
            case 1: //a+b
                return param1 + param2;
            case 2: //a*b
                return param1 * param2;
        }
        return 0;
    }

    public String getQuestionText(){ //returns the text of the question as it would appear in GUI
        switch (questionType){
            case 1:
                return  "What is ! + @ ?".replace("!", String.valueOf(param1)).replace("@", String.valueOf(param2));
            case 2:
                return  "What is ! * @ ?".replace("!", String.valueOf(param1)).replace("@", String.valueOf(param2));
        }
        return "error occured";
    }

    public int[] getPossibleAnswers(){
        //returns a list of possible MC answers
        //the first should always be the correct one, should be randomized later by model --> buttons
        //wrong answers should be dependent on question type, all others are 0 for now
        possibleAnswers[0] = this.getAnswer();
        possibleAnswers[1] = 0;
        possibleAnswers[2] = 0;
        possibleAnswers[3] = 0;
        return possibleAnswers;
    }
    public QuestionGenerator(int type, int p1, int p2){
        questionType=type;
        param1=p1;
        param2=p2;
    }

}
