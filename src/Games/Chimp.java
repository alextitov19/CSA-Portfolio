package Games;

import javax.swing.*;
import java.awt.*;

public class Chimp {

    private JPanel panel;
    private JLabel titleLabel;
    private JLabel highScoreLabel;
    private JLabel scoreLabel;
    private JLabel instructionLabel;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;
    private JButton b18;
    private JButton b19;
    private JButton b20;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b25;
    private int highScore = 0;
    private int score = 0;

    public static void main(String[] args) {
        RunChimpGame();
    }

    public static void RunChimpGame() {

        JFrame frame = new JFrame("HighLow");
        frame.setContentPane(new Chimp().panel);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.pack();
        frame.setVisible(true);

        new Chimp();

    }

    public Chimp() {

        GUI();

    }

    public void GUI() {

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(-1));

        titleLabel = new JLabel("Title", SwingConstants.CENTER);
        titleLabel.setText("Chimp Test");
        highScoreLabel = new JLabel("High Score", SwingConstants.CENTER);
        highScoreLabel.setText("High Score: " + highScore);
        scoreLabel = new JLabel("Score", SwingConstants.CENTER);
        scoreLabel.setText("Score: " + score);
        instructionLabel = new JLabel("Instructions", SwingConstants.CENTER);
        instructionLabel.setText("Press any button to begin");

        panel.add(titleLabel, newConstraints(1,0,75,225,3));
        panel.add(highScoreLabel, newConstraints(0,1,75,25,1));
        panel.add(instructionLabel, newConstraints(1,1,75,100,3));
        panel.add(scoreLabel, newConstraints(4,1,75,25,1));

        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25};

        for (JButton button: buttons) {
            setButton(button);
        }
    }

    int i = 0;

    public void setButton(JButton button) {
        button = new JButton();
        panel.add(button, newConstraints(i%5, i/5 + 2, 75,75,1));
        i++;
    }

    //copied from old code
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

}
