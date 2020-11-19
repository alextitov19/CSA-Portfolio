package Quiz;


import java.util.ArrayList;
import java.util.Collections;

//model section of code

public class QuestionGenerator { //generates a question, given a  question type, and 2 parameters
    int questionType;
    int param1;
    int param2;


    public int getAnswer() {
        switch (questionType) { //types of problems are subject to change and addition; this is only a proof of concept
            case 1: //a+b
                return param1 + param2;
            case 2: //a*b
                return param1 * param2;
            case 3: //sqrt(a^2)
                return param1;
            case 4: // a/b
                return param2/param1;
            case 5: //sqrt(a^2+b^2)
                return (int) Math.hypot(param1,param2)/10;
        }
        return 0;
    }

    public String getQuestionText(){ //returns the text of the question as it would appear in GUI
        switch (questionType){
            case 1:
                return  "What is ! + @ ?".replace("!", String.valueOf(param1)).replace("@", String.valueOf(param2));
            case 2:
                return  "What is ! * @ ?".replace("!", String.valueOf(param1)).replace("@", String.valueOf(param2));
            case 3:
                return  "What is the square root of !?".replace("!", String.valueOf(param1*param1));
            case 4:
                return "The floor of the product of roots of the polynomial \n !x^2 + @ = 0 \n is most nearly:".replace("!",String.valueOf(param1/10)).replace("@",String.valueOf(param2/10));
            case 5:
                return "What is the floor of the length of the hypotenuse of a right triangle with legs of ! and @?".replace("!",String.valueOf(param1/10)).replace("@",String.valueOf(param2/10));
        }
        return "error occured";
    }

    public ArrayList<Integer> getPossibleAnswers(){
        //returns a list of possible MC answers
        //the first should always be the correct one, should be randomized later by model --> buttons
        ArrayList<Integer> possibleAnswers = new ArrayList<Integer>();
        for(int i = 0; i < 4; i++)
            possibleAnswers.add(0);
        int a = this.getAnswer();
        possibleAnswers.set(0, a);
        if (a != 0) {
            possibleAnswers.set(1, (int) (Math.random() * 5 * a)); // between 0a and 5a
            possibleAnswers.set(2, (int) (Math.random() * 5 * a));
            possibleAnswers.set(3, (int) (Math.random() * 5 * a));
        }
        else {
            possibleAnswers.set(1, (int) (Math.random() * 1000));
            possibleAnswers.set(2, (int) (Math.random() * 1000));
            possibleAnswers.set(3, (int) (Math.random() * 1000));
        }

        //randomize list
        Collections.shuffle(possibleAnswers);
        return possibleAnswers;
    }

    public QuestionGenerator(int type, int p1, int p2){
        questionType=type;
        param1=p1;
        param2=p2;
    }

}
