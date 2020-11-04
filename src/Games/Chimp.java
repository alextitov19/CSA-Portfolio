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
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10 = new JButton();
        b11 = new JButton();
        b12 = new JButton();
        b13 = new JButton();
        b14 = new JButton();
        b15 = new JButton();
        b16 = new JButton();
        b17 = new JButton();
        b18 = new JButton();
        b19 = new JButton();
        b20 = new JButton();
        b21 = new JButton();
        b22 = new JButton();
        b23 = new JButton();
        b24 = new JButton();
        b25 = new JButton();

        panel.add(titleLabel, newConstraints(1,0,75,225,3));
        panel.add(highScoreLabel, newConstraints(0,1,75,25,1));
        panel.add(instructionLabel, newConstraints(1,1,75,100,3));
        panel.add(scoreLabel, newConstraints(4,1,75,25,1));
        panel.add(b1, newConstraints(0,2,75,75,1));
        panel.add(b2, newConstraints(1,2,75,75,1));
        panel.add(b3, newConstraints(2,2,75,75,1));
        panel.add(b4, newConstraints(3,2,75,75,1));
        panel.add(b5, newConstraints(4,2,75,75,1));
        panel.add(b6, newConstraints(0,3,75,75,1));
        panel.add(b7, newConstraints(1,3,75,75,1));
        panel.add(b8, newConstraints(2,3,75,75,1));
        panel.add(b9, newConstraints(3,3,75,75,1));
        panel.add(b10, newConstraints(4,3,75,75,1));
        panel.add(b11, newConstraints(0,4,75,75,1));
        panel.add(b12, newConstraints(1,4,75,75,1));
        panel.add(b13, newConstraints(2,4,75,75,1));
        panel.add(b14, newConstraints(3,4,75,75,1));
        panel.add(b15, newConstraints(4,4,75,75,1));
        panel.add(b16, newConstraints(0,5,75,75,1));
        panel.add(b17, newConstraints(1,5,75,75,1));
        panel.add(b18, newConstraints(2,5,75,75,1));
        panel.add(b19, newConstraints(3,5,75,75,1));
        panel.add(b20, newConstraints(4,5,75,75,1));
        panel.add(b21, newConstraints(0,6,75,75,1));
        panel.add(b22, newConstraints(1,6,75,75,1));
        panel.add(b23, newConstraints(2,6,75,75,1));
        panel.add(b24, newConstraints(3,6,75,75,1));
        panel.add(b25, newConstraints(4,6,75,75,1));

        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25};
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
