package Quiz;

import Playground.FileReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizUI {

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel questionLabel;

    private QuestionGenerator currentQuestion = new QuestionGenerator(1, 1, 1);
    private int currentAnswer;

    public static void main(String[] args) {
        RunQuizUI();
    }

    public QuizUI() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        questionLabel.setText("Press any button to start");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button1.getText().equals(String.valueOf(currentAnswer))) {
                    System.out.println("Correct!");
                    FileReader fileReader = new FileReader();
                    int[] atts = fileReader.GetAttributes();
                    int coins = atts[0];
                    int xp = atts[1];
                    coins += 5;
                    atts = new int[]{coins, xp};
                    FileWriter fileWriter = new FileWriter();
                    fileWriter.SetValue(atts);                } else {
                    System.out.println("Incorrect");
                }

                ResetQuiz();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button2.getText().equals(String.valueOf(currentAnswer))) {
                    System.out.println("Correct!");
                    FileReader fileReader = new FileReader();
                    int[] atts = fileReader.GetAttributes();
                    int coins = atts[0];
                    int xp = atts[1];
                    coins += 5;
                    atts = new int[]{coins, xp};
                    FileWriter fileWriter = new FileWriter();
                    fileWriter.SetValue(atts);                } else {
                    System.out.println("Incorrect");
                }

                ResetQuiz();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button3.getText().equals(String.valueOf(currentAnswer))) {
                    System.out.println("Correct!");
                    FileReader fileReader = new FileReader();
                    int[] atts = fileReader.GetAttributes();
                    int coins = atts[0];
                    int xp = atts[1];
                    coins += 5;
                    atts = new int[]{coins, xp};
                    FileWriter fileWriter = new FileWriter();
                    fileWriter.SetValue(atts);                } else {
                    System.out.println("Incorrect");
                }

                ResetQuiz();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button4.getText().equals(String.valueOf(currentAnswer))) {
                    System.out.println("Correct!");
                    FileReader fileReader = new FileReader();
                    int[] atts = fileReader.GetAttributes();
                    int coins = atts[0];
                    int xp = atts[1];
                    coins += 5;
                    atts = new int[]{coins, xp};
                    FileWriter fileWriter = new FileWriter();
                    fileWriter.SetValue(atts);
                } else {
                    System.out.println("Incorrect");
                }

                ResetQuiz();
            }
        });
    }

    public static void RunQuizUI() {
        JFrame frame = new JFrame("QuizUI");
        frame.setContentPane(new QuizUI().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void ResetQuiz() { //resets the UI and Question displayed
        GetNewQuestion();
        currentAnswer = currentQuestion.getAnswer();
        displayQuestion(currentQuestion);
        displayChoices(currentQuestion);
    }

    public void GetNewQuestion() { //must be randomized
        currentQuestion.questionType = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        currentQuestion.param1 = (int) (Math.random() * ((999 - 0) + 1)) + 0;
        currentQuestion.param2 = (int) (Math.random() * ((999 - 0) + 1)) + 0;

    }

    public void displayQuestion(QuestionGenerator c) {  //adds question to label
        questionLabel.setText(c.getQuestionText());
    }

    public void displayChoices(QuestionGenerator c) { // adds possible choices to buttons, needs to be randomized later
        button1.setText(String.valueOf(currentAnswer));
        button2.setText("0");
        button3.setText("0");
        button4.setText("0");
    }


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
        panel1.setLayout(new GridBagLayout());
        questionLabel = new JLabel();
        questionLabel.setText("Label");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 4;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(questionLabel, gbc);
        button1 = new JButton();
        button1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button1, gbc);
        button2 = new JButton();
        button2.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button2, gbc);
        button3 = new JButton();
        button3.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button3, gbc);
        button4 = new JButton();
        button4.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button4, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer1, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}


