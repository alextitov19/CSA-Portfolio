//Andrew's mini-project week 7

package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RPS {

    //GUI generated code
    private JButton rockButton;
    private JPanel panel1;
    private JButton paperButton;
    private JButton scissorsButton;
    private JLabel CPULabel;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JLabel scoreLabel;
    private JLabel highScoreLabel;

    private int highScore = 0;
    private int score = 0;

    //Constructor called by main
    public RPS() {

        //resets the game
        CPULabel.setText("");
        userLabel.setText("");
        titleLabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\RPSLogo.PNG"));

        //Rock Paper Scissors Button Listeners
        rockButton.addActionListener(new ActionListener() {
            @Override
            //play(0) sets the user's choice to rock
            public void actionPerformed(ActionEvent e) {
                play(0);
            }
        });

        paperButton.addActionListener(new ActionListener() {
            @Override
            //play(1) sets the user's choice to paper
            public void actionPerformed(ActionEvent e) {
                play(1);
            }
        });

        scissorsButton.addActionListener(new ActionListener() {
            @Override
            //play(2) sets the user's choice to scissors
            public void actionPerformed(ActionEvent e) {
                play(2);
            }
        });
    }

    public static void main(String[] args) {

        //creates the JFrame
        JFrame frame = new JFrame("RPS");
        frame.setContentPane(new RPS().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //calls constructor
        new RPS();

    }

    //Called after a button is selected
    public void play(int choice) {

        //Removes the title image
        titleLabel.setIcon(null);
        titleLabel.setText("");

        //Changes text from "Press a Button to Start" to scorekeeper
        scoreLabel.setText("Current Score: " + score);

        //CPU randomly makes a choice (rock, paper, scissors)
        Random random = new Random();
        int CPUChoice = random.nextInt(3);

        //Sets the picture for the user's choice
        userHand(choice);

        //Sets the picture for the CPU's choice
        CPUHand(CPUChoice);

        int winCalc = (3 + choice - CPUChoice) % 3;

        /*winCalc is set to 0, 1, or 2 based on the two choices
        If the choices are the same, then 3 + choice - CPUChoice = 3 and 3 % 3 = 0, so 0 is a tie
        If the user's choice is 1 more or 2 less than the CPU's choice, then the user wins
        ex: Rock (0) beats Scissors (2), Paper (1) beats Rock (0), Scissors (2) beats Paper (1)
        -2 % 3 = 1, so the user wins when winCalc = 1
        If the user's choice is 2 more or 1 less than the CPU's choice then the user loses
        ex: Rock (0) loses to Paper (1), Paper (1) loses to Scissors(2), Scissors (2) loses to Rock(0)
        -1 % 3 = 2, so the user loses when winCalc = 2
         */

        //converts winCalc value to win, lose, or tie
        calculateWinner(winCalc);

        //updates score keeper
        scoreLabel.setText("Score: " + score);

        //updates the value high score if current score has beaten the high score
        if (score > highScore) {
            highScore = score;
        }

        //updates high score keeper
        highScoreLabel.setText("High Score: " + highScore);

    }

    //converts input to win, lose, or tie and changes title text
    public void calculateWinner(int number) {
        switch (number) {
            //0 is a tie
            case 0:
                titleLabel.setText("<html>It's a Tie!<br></html>");
                break;
            //1 is a win
            case 1:
                titleLabel.setText("<html>You Won!<br>+1 Point</html>");
                score++;
                break;
            //2 is a loss
            case 2:
                titleLabel.setText("<html>You Lost!<br>Try Again?</html>");
                score = 0;
                break;
        }
    }

    //sets user hand image (rock, paper, or scissors)
    public void userHand(int number) {
        //number corresponds to user choice (0 - Rock, 1 - Paper, 2 - Scissors)
        switch (number) {
            case 0:
                userLabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\UserRock.png"));
                break;
            case 1:
                userLabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\UserPaper.png"));
                break;
            case 2:
                userLabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\UserScissors.png"));
                break;
        }
    }

    //sets CPU hand image (rock, paper, or scissors)
    public void CPUHand(int number) {
        //number corresponds to CPU choice (0 - Rock, 1 - Paper, 2 - Scissors)
        switch (number) {
            case 0:
                CPULabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\CPURock.png"));
                break;
            case 1:
                CPULabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\CPUPaper.png"));
                break;
            case 2:
                CPULabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\CPUScissors.png"));
                break;
        }
    }

    //Below is GUI Generated Code

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        rockButton = new JButton();
        rockButton.setText("Button");
        panel1.add(rockButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paperButton = new JButton();
        paperButton.setText("Button");
        panel1.add(paperButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scissorsButton = new JButton();
        scissorsButton.setText("Button");
        panel1.add(scissorsButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        titleLabel = new JLabel();
        titleLabel.setText("");
        panel1.add(titleLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        userLabel = new JLabel();
        userLabel.setText("");
        panel1.add(userLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        CPULabel = new JLabel();
        CPULabel.setText("");
        panel1.add(CPULabel, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scoreLabel = new JLabel();
        scoreLabel.setHorizontalAlignment(0);
        scoreLabel.setText("Press a Button to Start");
        panel1.add(scoreLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        highScoreLabel = new JLabel();
        highScoreLabel.setText("High Score: 0");
        panel1.add(highScoreLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
