package Games;

import Playground.FileReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Chimp {

    private JPanel panel;
    private JLabel titleLabel;
    private JLabel scoreLabel;
    private JLabel instructLabel;
    private JLabel highScoreLabel;
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

    private boolean started = false;
    private boolean first = false;
    private int score = 0;
    private int highScore = 0;
    private int counter = 1;

    private int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
    private String[] strNumbers = {"","","","","","","","","","","","","","","","","","","","","","","","",""};

    public static void main(String[] args) {

        RunChimp();

    }

    public static void RunChimp() {

        JFrame frame = new JFrame("Chimp Game");
        frame.setContentPane(new Chimp().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.pack();
        frame.setVisible(true);

        new Chimp();

    }

    public Chimp() {

        GUI();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(1);
                b1.setText(strNumbers[0]);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(2);
                b2.setText(strNumbers[1]);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(3);
                b3.setText(strNumbers[2]);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(4);
                b4.setText(strNumbers[3]);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(5);
                b5.setText(strNumbers[4]);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(6);
                b6.setText(strNumbers[5]);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(7);
                b7.setText(strNumbers[6]);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(8);
                b8.setText(strNumbers[7]);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(9);
                b9.setText(strNumbers[8]);
            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(10);
                b10.setText(strNumbers[9]);
            }
        });

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(11);
                b11.setText(strNumbers[10]);
            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(12);
                b12.setText(strNumbers[11]);
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(13);
                b13.setText(strNumbers[12]);
            }
        });

        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(14);
                b14.setText(strNumbers[13]);
            }
        });

        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(15);
                b15.setText(strNumbers[14]);
            }
        });

        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(16);
                b16.setText(strNumbers[15]);
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(17);
                b17.setText(strNumbers[16]);
            }
        });

        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(18);
                b18.setText(strNumbers[17]);
            }
        });

        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(19);
                b19.setText(strNumbers[18]);
            }
        });

        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(20);
                b20.setText(strNumbers[19]);
            }
        });

        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(21);
                b21.setText(strNumbers[20]);
            }
        });

        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(22);
                b22.setText(strNumbers[21]);
            }
        });

        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(23);
                b23.setText(strNumbers[22]);
            }
        });

        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(24);
                b24.setText(strNumbers[23]);
            }
        });

        b25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(25);
                b25.setText(strNumbers[24]);
            }
        });

    }

    public void GUI() {

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(-1));

        titleLabel = new JLabel("title", SwingConstants.CENTER);
        scoreLabel = new JLabel("score", SwingConstants.CENTER);
        instructLabel = new JLabel("instructions", SwingConstants.CENTER);
        highScoreLabel = new JLabel("high score", SwingConstants.CENTER);

        titleLabel.setText("<html> CHIMP MEMORY TEST</html>");
        scoreLabel.setText("Score: " + score);
        instructLabel.setText("Press the numbers in order");
        highScoreLabel.setText("High score: " + highScore);

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

        panel.add(titleLabel, newConstraints(1,0,50,100,3));
        panel.add(scoreLabel, newConstraints(0,1,25,25,1));
        panel.add(instructLabel, newConstraints(1,1,50,50,3));
        panel.add(highScoreLabel, newConstraints(4,1,10,10,1));
        panel.add(b1, newConstraints(0,2,50,50,1));
        panel.add(b2, newConstraints(1,2,50,50,1));
        panel.add(b3, newConstraints(2,2,50,50,1));
        panel.add(b4, newConstraints(3,2,50,50,1));
        panel.add(b5, newConstraints(4,2,50,50,1));
        panel.add(b6, newConstraints(0,3,50,50,1));
        panel.add(b7, newConstraints(1,3,50,50,1));
        panel.add(b8, newConstraints(2,3,50,50,1));
        panel.add(b9, newConstraints(3,3,50,50,1));
        panel.add(b10, newConstraints(4,3,50,50,1));
        panel.add(b11, newConstraints(0,4,50,50,1));
        panel.add(b12, newConstraints(1,4,50,50,1));
        panel.add(b13, newConstraints(2,4,50,50,1));
        panel.add(b14, newConstraints(3,4,50,50,1));
        panel.add(b15, newConstraints(4,4,50,50,1));
        panel.add(b16, newConstraints(0,5,50,50,1));
        panel.add(b17, newConstraints(1,5,50,50,1));
        panel.add(b18, newConstraints(2,5,50,50,1));
        panel.add(b19, newConstraints(3,5,50,50,1));
        panel.add(b20, newConstraints(4,5,50,50,1));
        panel.add(b21, newConstraints(0,6,50,50,1));
        panel.add(b22, newConstraints(1,6,50,50,1));
        panel.add(b23, newConstraints(2,6,50,50,1));
        panel.add(b24, newConstraints(3,6,50,50,1));
        panel.add(b25, newConstraints(4,6,50,50,1));


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
        //number of cells vertically
        constraints.gridwidth = g;
        return constraints;
    }

    public void play(int choice) {

        if(first) {
            clear();
            first = false;
            instructLabel.setText("");
        }

        if(!started) {

            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = 0;
            }

            for(int i = 0; i < score + 1; i++) {
                numbers[i] = i + 1;
            }

            randomize(numbers);
            reveal();
            titleLabel.setText("CHIMP MEMORY GAME");
            instructLabel.setText("Remember the numbers and press 1");

            started = true;
            first = true;
        } else {
            if (numbers[choice - 1] == counter) {
                counter++;
            } else {
                reveal();
                started = false;
                score = 0;
                titleLabel.setText("You missed one!");
                scoreLabel.setText("Score: " + score);
                instructLabel.setText("Press any button to restart");

                FileReader fileReader = new FileReader();
                int[] atts = fileReader.GetAttributes();
                int coins = atts[0];
                int xp = atts[1];
                coins += score;
                atts = new int[]{coins, xp};
                fileReader.SetValue(atts);
            }

            if(counter == score + 2) {
                score++;
                titleLabel.setText("Score +1");
                scoreLabel.setText("Score: " + score);
                if (score > highScore) {
                    highScore = score;
                }
                highScoreLabel.setText("High Score: " + highScore);
                instructLabel.setText("Press any button to continue");

                if(score == 25) {
                    titleLabel.setText("Maximum Score Achieve");
                    instructLabel.setText("Resetting");
                }

                reveal();
                started = false;
                counter = 1;

            }
        }

    }

    public void clear () {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");
    }

    public void randomize(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int newInt = random.nextInt(4);
            int temp = array[i];
            array[i] = array[newInt];
            array[newInt] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                strNumbers[i] = null;
            } else {
                strNumbers[i] = Integer.toString(numbers[i]);
            }
        }

    }

    public void reveal() {

        b1.setText(strNumbers[0]);
        b2.setText(strNumbers[1]);
        b3.setText(strNumbers[2]);
        b4.setText(strNumbers[3]);
        b5.setText(strNumbers[4]);
        b6.setText(strNumbers[5]);
        b7.setText(strNumbers[6]);
        b8.setText(strNumbers[7]);
        b9.setText(strNumbers[8]);
        b10.setText(strNumbers[9]);
        b11.setText(strNumbers[10]);
        b12.setText(strNumbers[11]);
        b13.setText(strNumbers[12]);
        b14.setText(strNumbers[13]);
        b15.setText(strNumbers[14]);
        b16.setText(strNumbers[15]);
        b17.setText(strNumbers[16]);
        b18.setText(strNumbers[17]);
        b19.setText(strNumbers[18]);
        b20.setText(strNumbers[19]);
        b21.setText(strNumbers[20]);
        b22.setText(strNumbers[21]);
        b23.setText(strNumbers[22]);
        b24.setText(strNumbers[23]);
        b25.setText(strNumbers[24]);

    }

}
