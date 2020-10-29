package Games;

import javax.swing.*;
import java.awt.*;

//need these imports for later
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HighLow {

    //creating panel, buttons, and labels
    private JPanel panel;
    private JButton downButton;
    private JButton nextButton;
    private JButton upButton;
    private JLabel number1;
    private JLabel titleLabel;
    private JLabel scoreLabel;
    private JLabel highScoreLabel;
    private JLabel number2;

    //Constructor with action listeners (later)
    public HighLow() {

        GUI();

    }

    //main method creates JFrame
    public static void main(String[] args) {

        JFrame frame = new JFrame("HighLow");
        frame.setContentPane(new HighLow().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,600);
        frame.pack();
        frame.setVisible(true);

        new HighLow();
    }

    public void GUI() {

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(-1));

        //define buttons and labels
        //SwingConstants.CENTER centers label text horizontally
        number1 = new JLabel("first", SwingConstants.CENTER);
        titleLabel= new JLabel("title", SwingConstants.CENTER);
        scoreLabel = new JLabel("score", SwingConstants.CENTER);
        highScoreLabel = new JLabel("highScoreLabel", SwingConstants.CENTER);
        number2 = new JLabel("second", SwingConstants.CENTER);
        downButton = new JButton("down");
        nextButton = new JButton("click");
        upButton = new JButton("up");

        //Adds the labels and buttons to the panel
        //newConstraints specifies position of each label and button
        panel.add(number1, newConstraints(0,0,300,200,3));
        panel.add(titleLabel, newConstraints(1,0,100,200,1));
        panel.add(scoreLabel, newConstraints(1,1,100,200,1));
        panel.add(highScoreLabel, newConstraints(1,2,100,200,1));
        panel.add(number2, newConstraints(2,0,300,200,3));
        panel.add(downButton, newConstraints(0,3,100,200,1));
        panel.add(nextButton, newConstraints(1,3,100,200,1));
        panel.add(upButton, newConstraints(2,3,100,200,1));

        //setting text to visualize gui outlay
        //testing toString for later use
        int x = 1;
        number1.setText(Integer.toString(x));
        titleLabel.setText("title");
        scoreLabel.setText("ha u have 0");
        highScoreLabel.setText("still 0");
        number2.setText("2");
        downButton.setText("LOWER");
        nextButton.setText("NEXT");
        upButton.setText("HIGHER");
    }

    //method returns a set of grid bag constraints for label and button positioning
    public GridBagConstraints newConstraints(int a, int b, int c, int d, int g) {

        GridBagConstraints constraint = new GridBagConstraints();
        //fill cells horizontally
        constraint.fill = GridBagConstraints.HORIZONTAL;
        //fill cells vertically
        constraint.fill = GridBagConstraints.VERTICAL;
        //main cell x position
        constraint.gridx = a;
        //main cell y position
        constraint.gridy = b;
        //height
        constraint.ipady = c;
        //width
        constraint.ipadx = d;
        //number of cells vertically
        constraint.gridheight = g;

        return constraint;
    }

}
