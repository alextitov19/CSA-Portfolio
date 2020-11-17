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

    private int buttonPress = 0;
    private int correctNum = 0;
    private int answerNum = 0;
    private int score = 0;
    private int highScore = 0;

    public static void main(String[] args) {

        RunNumbers();

    }

    public static void RunNumbers() {

        JFrame frame = new JFrame("Number Memory Game");
        frame.setContentPane(new Numbers().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,150);
        frame.pack();
        frame.setVisible(true);

        new Numbers();

    }

    public Numbers() {

        GUI();



        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonPress == 0) {
                    start();
                } else if (buttonPress == 1) {
                    clearNum();
                } else {
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
        double x = randomNum(score + 1);
        int y = (int) x;
        title.setText("Memorize the Number");
        number.setText(String.valueOf(y));
        entry.setText(null);
        submit.setText("Continue");
        buttonPress = 1;
    }

    public void clearNum() {
        correctNum = Integer.parseInt(number.getText());
        number.setText(null);
        title.setText("What was the number");
        entry.setText(null);
        submit.setText("Submit");
        buttonPress = 2;
    }

    public void checkAnswer() {
        try {
            answerNum = Integer.parseInt(entry.getText());
        } catch (Exception e) {
            answerNum = 0;
        }

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
        buttonPress = 0;
    }

    public double randomNum(int length) {
        Random random = new Random();
        double num = random.nextInt(9) + 1;
        for(int i = 1; i < length; i++) {
            num = 10 * num + random.nextInt(10);
        }
        return num;
    }

}
