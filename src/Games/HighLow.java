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

    private boolean roundStarted = false;
    private boolean gameStarted = false;
    private int score = 0;
    private int highScore = 0;

    //Constructor with action listeners (later)
    public HighLow() {

        GUI();

        downButton.addActionListener(new ActionListener() {
            @Override
            //play(0) sets the user's choice to rock
            public void actionPerformed(ActionEvent e) {
                if(roundStarted) {
                    roundStarted = false;
                    int one = Integer.parseInt(number1.getText());
                    Random rand = new Random();
                    int two = rand.nextInt(9) + 1;
                    number2.setText(Integer.toString(two));
                    winLose(two,one);
                    scoreLabel.setText("Score: " + score);
                    if (score > highScore) {
                        highScore = score;
                    }
                    highScoreLabel.setText("High Score: " + highScore);
                }
            }
        });

        upButton.addActionListener(new ActionListener() {
            @Override
            //play(0) sets the user's choice to rock
            public void actionPerformed(ActionEvent e) {
                if(roundStarted) {
                    roundStarted = false;
                    int one = Integer.parseInt(number1.getText());
                    Random rand = new Random();
                    int two = rand.nextInt(9) + 1;
                    number2.setText(Integer.toString(two));
                    winLose(one,two);
                    scoreLabel.setText("Score: " + score);
                    if (score > highScore) {
                        highScore = score;
                    }
                    highScoreLabel.setText("High Score: " + highScore);
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            //play(0) sets the user's choice to rock
            public void actionPerformed(ActionEvent e) {
                if(!roundStarted) {
                    if(score == 0){
                        Random random = new Random();
                        int x = random.nextInt(9) + 1;
                        number2.setText(Integer.toString(x));
                    }
                    number1.setText(number2.getText());
                    number2.setText("?");
                    titleLabel.setIcon(null);
                    titleLabel.setText("<html><div style='text-align: center;'>\"Will the next number be<br>HIGHER or LOWER?");
                    scoreLabel.setText("Score: " + score);
                    nextButton.setText("    NEXT   ");
                }
                roundStarted = true;
            }
        });

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
        scoreLabel.setText("<html><div style='text-align: center;'>\"Press START to begin</html>");
        highScoreLabel.setText("High Score: 0");
        number2.setText("?");
        downButton.setText("LOWER");
        nextButton.setText("   START  ");
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

    public void winLose(int x, int y) {
        if (y > x) {
            titleLabel.setText("<html><div style='text-align: center;'>\Correct!<br>+1 point<br>Press NEXT</html>");
            score++;
        } else if (y == x) {
            Random rand = new Random();
            int two = rand.nextInt(9) + 1;
            number2.setText(Integer.toString(two));
            winLose(x,y);
        } else {
            titleLabel.setText("<html><div style='text-align: center;'>\"You Lost!<br>Press RESTART to try again<html>");
            nextButton.setText("RESTART");
            score = 0;
        }
    }

}
