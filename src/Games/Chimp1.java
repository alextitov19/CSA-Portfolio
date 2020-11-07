package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Chimp1 {

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
    int highScore = 0;
    int score = 5;
    boolean started = false;
    boolean correct = false;

    public JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25};
    public String[] numbers = {"1","","","","","","","","","","","","","","","","","","","","","","","",""};
    public static int counter = 1;

    public static void main(String[] args) {
        RunChimp();
    }

    public static void RunChimp() {
        JFrame frame = new JFrame("Chimp");
        frame.setContentPane(new Chimp1().panel);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.pack();
        frame.setVisible(true);

        new Chimp1();
    }

    public Chimp1() {
        GUI();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(3);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(4);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(5);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(6);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(7);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(8);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(9);
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(10);
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(11);
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(12);
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(13);
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(14);
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(15);
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(16);
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(17);
            }
        });
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(18);
            }
        });
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(19);
            }
        });
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(20);
            }
        });
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(21);
            }
        });
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(22);
            }
        });
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(22);
            }
        });
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(23);
            }
        });
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(24);
            }
        });
        b25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(25);
            }
        });
    }

    public void GUI() {
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(-1));

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

    public void play(int buttonNum) {
        int i = 0;
        if(started) {
            String text = numbers[buttonNum];
            if (text != "") {
                i = Integer.parseInt(text);
            } else {

            }

            if(i == counter) {

                System.out.println("yes");
                if(counter == 1) {
                    clear();
                }
                counter++;

            } else {
                revealAll();
                started = false;
            }

        } else {
            for(int j = 0; j < numbers.length; j++) {
                numbers[j] = "";
            }
            for(int j = 0; j < score; j++) {
                numbers[j] = Integer.toString(j+1);
            }
            randomize(numbers);
            revealAll();
            started = true;
            int counter = 1;
            System.out.println(Integer.toString(counter));

            for(String number: numbers) {
                int num = 0;
                if (number != "") { num = Integer.parseInt(number);}
                String numm = numbers[num];
                if(numm == "1") {
                    System.out.println(Integer.toString(num));
                }
            }
        }
    }

    public void randomize(String[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int newIndex = rand.nextInt(array.length);
            String x = array[newIndex];
            array[newIndex] = array[i];
            array[i] = x;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public void revealAll() {
        b1.setText(numbers[1]);
        b2.setText(numbers[2]);
        b3.setText(numbers[3]);
        b4.setText(numbers[4]);
        b5.setText(numbers[5]);
        b6.setText(numbers[6]);
        b7.setText(numbers[7]);
        b8.setText(numbers[8]);
        b9.setText(numbers[9]);
        b10.setText(numbers[10]);
        b11.setText(numbers[11]);
        b12.setText(numbers[12]);
        b13.setText(numbers[13]);
        b14.setText(numbers[14]);
        b15.setText(numbers[15]);
        b16.setText(numbers[16]);
        b17.setText(numbers[17]);
        b18.setText(numbers[18]);
        b19.setText(numbers[19]);
        b20.setText(numbers[20]);
        b21.setText(numbers[21]);
        b22.setText(numbers[22]);
        b23.setText(numbers[23]);
        b24.setText(numbers[24]);
        b25.setText(numbers[0]);
    }

    public void clear() {
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



}

