package Games;

import Playground.FileReader;
import Playground.FileWriter;

import javax.swing.*;
import java.awt.*;

//need these imports for later
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HLView {

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

    public boolean roundStarted = false;
    public int score = 0;

    //Constructor with action listeners (later)
    public HLView() {

        GUI();

    }

    //main method creates JFrame
    public static void main(String[] args) {

        RunHLView();

    }

    public static void RunHLView() {

        JFrame frame = new JFrame("HighLow");
        frame.setContentPane(new HLView().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,600);
        frame.pack();
        frame.setVisible(true);

        new HLView();
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
        panel.add(number1, newConstraints(0,0,200,200,3));
        panel.add(titleLabel, newConstraints(1,0,100,200,1));
        panel.add(scoreLabel, newConstraints(1,1,50,200,1));
        panel.add(highScoreLabel, newConstraints(1,2,50,200,1));
        panel.add(number2, newConstraints(2,0,200,200,3));
        panel.add(downButton, newConstraints(0,3,100,200,1));
        panel.add(nextButton, newConstraints(1,3,100,200,1));
        panel.add(upButton, newConstraints(2,3,100,200,1));

        Font numbers = new Font("Arial", Font.BOLD, 144);
        number1.setFont(numbers);
        number2.setFont(numbers);

        Font big = new Font("Arial", Font.BOLD, 36);
        titleLabel.setFont(big);
        downButton.setFont(big);
        nextButton.setFont(big);
        upButton.setFont(big);

        number1.setText("?");
        titleLabel.setText("");
        titleLabel.setIcon(new ImageIcon(".\\.\\.\\Icons\\HighLowTitle.png"));
        scoreLabel.setText("<html><div style='text-align: center;'>Press START to begin</html>");
        highScoreLabel.setText("High Score: 0");
        number2.setText("?");
        downButton.setText("LOWER");
        nextButton.setText("   START  ");
        upButton.setText("HIGHER");


    }

    //method returns a set of grid bag constraints for label and button positioning
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
        //number of cells vertically
        constraints.gridheight = g;
        return constraints;
    }

    public void setNumber1(String text) {
        number1.setText(text);
    }
    public void setNumber2(String text) {
        number2.setText(text);
    }
    public void setTitleLabel(String text) {
        titleLabel.setText(text);
    }
    public void clearTitleIcon() {
        titleLabel.setIcon(null);
    }
    public void setScoreLabel(String text) {
        scoreLabel.setText(text);
    }
    public void setHighScoreLabel(String text) {
        highScoreLabel.setText(text);
    }
    public void setUpButton(String text) {
        upButton.setText(text);
    }
    public void setNextButton(String text) {
        nextButton.setText(text);
    }
    public void setDownButton(String text) {
        downButton.setText(text);
    }

    public String getNumber1() {
        return number1.getText();
    }
    public String getNumber2() {
        return number2.getText();
    }
    public String getTitleLabel() {
        return titleLabel.getText();
    }
    public String getScoreLabel() {
        return scoreLabel.getText();
    }
    public String getHighScoreLabel() {
        return highScoreLabel.getText();
    }
    public String getUpButton() {
        return upButton.getText();
    }
    public String getNextButton() {
        return nextButton.getText();
    }
    public String getDownButton() {
        return downButton.getText();
    }

    public void setUpActionListener(ActionListener actionListener) {
        upButton.addActionListener(actionListener);
    }
    public void setNextActionListener(ActionListener actionListener) {
        nextButton.addActionListener(actionListener);
    }
    public void setDownActionListener(ActionListener actionListener) {
        downButton.addActionListener(actionListener);
    }

}

