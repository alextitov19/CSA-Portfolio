package Games;

import com.sun.java.accessibility.util.GUIInitializedListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Random;

public class Numbers {

    private JPanel panel;
    private JLabel title;
    private JLabel number;
    private JTextField entry;
    private JButton submit;

    //the value of buttonPress changes the function of the button
    private int buttonPress = 0;
    //set to the value of the answer
    private int correctNum = 0;
    //set to the value of the input
    private int answerNum = 0;
    private int score = 0;
    private int highScore = 0;

    public static void main(String[] args) {

        RunNumbers();

    }

    public static void RunNumbers() {

        JFrame frame = new JFrame("Number Memory Game");
        frame.setContentPane(new Numbers().panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250,150);
        frame.pack();
        frame.setVisible(true);

        new Numbers();

    }

    public Numbers() {

        GUI();


        //action listener for submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if function switches the button function each time it's pressed
                if(buttonPress == 0) {
                    //start function creates the number
                    start();
                } else if (buttonPress == 1) {
                    //erases number and waits for user response
                    clearNum();
                } else {
                    //checks user response and updates score accordingly
                    checkAnswer();
                }
            }
        });

    }

    public void GUI() {
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(-1));

        title = new JLabel("title",SwingConstants.CENTER);
        number = new JLabel("number",SwingConstants.CENTER);
        entry = new JTextField();
        submit = new JButton();

        panel.add(title, newConstraints(0,0,50,250,2));
        panel.add(number, newConstraints(0,1,50,250,2));
        panel.add(entry, newConstraints(0,2,50,200,1));
        panel.add(submit, newConstraints(1,2,50,50,1));

        title.setText("Number Memory Game");
        number.setText("Press 'Start' to begin");
        submit.setText("Start");

    }

    //method to simplify location constraints for buttons and labels
    public GridBagConstraints newConstraints(int a, int b, int c, int d, int g) {

        GridBagConstraints constraints = new GridBagConstraints();
        //fill cells horizontally
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //fill cells vertically
        constraints.fill = GridBagConstraints.VERTICAL;
        //main cell x position
        constraints.gridx = a;
        //main cell y position
        constraints.gridy = b;
        //height
        constraints.ipady = c;
        //width
        constraints.ipadx = d;
        //number of cells horizontally
        constraints.gridwidth = g;
        return constraints;
    }

    public void start() {
        //creates random number with length equal to one more than the score
        double x = randomNum(score + 1);
        int y = (int) x;
        title.setText("Memorize the Number");
        number.setText(String.valueOf(y));
        entry.setText(null);
        submit.setText("Continue");
        //changes to next button function
        buttonPress = 1;
    }

    public void clearNum() {
        //sets the answer number to the randomly displayed number
        correctNum = Integer.parseInt(number.getText());
        //hide the answer
        number.setText(null);
        title.setText("What was the number");
        //clear entry to prevent cheating
        entry.setText(null);
        submit.setText("Submit");
        //changes to next button function
        buttonPress = 2;
    }

    public void checkAnswer() {

        //if the entry is not a number, the entry will always be incorrect
        try {
            answerNum = Integer.parseInt(entry.getText());
        } catch (Exception e) {
            answerNum = 0;
        }

        //compares the entry and solution and decides whether the user wins
        if (answerNum == correctNum) {
            title.setText("+1 point");
            number.setText("Press 'Next' to continue");
            entry.setText("Correct!");
            submit.setText("Next");
            score++;
        } else {
            title.setText("Final Score: " + score);
            if (score > highScore) {
                highScore = score;
                number.setText("New High Score!");
            } else {
                number.setText("High Score: " + highScore);
            }
            entry.setText("Incorrect!");
            submit.setText("Restart");
            score = 0;
        }
        //changes to next button function
        buttonPress = 0;
    }

    //set to double to increase maximum number length
    public double randomNum(int length) {
        Random random = new Random();
        double num = random.nextInt(9) + 1;
        //continues appends random digits until the length is equal to the desired length
        for(int i = 1; i < length; i++) {
            num = 10 * num + random.nextInt(10);
        }
        return num;
    }

}
