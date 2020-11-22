package Menu;

import ATM.ATM;
import CalculatorUI.CalculatorUI;
import Formulas.PhysicsFormulasUI;
import Games.RPS;
import Games.HighLow;
import Games.Chimp;
import Games.Numbers;
import Gmail.GmailUI;
import GraphingCalculator.GraphingCalculatorUI;
import Playground.FileReader;
import Quiz.QuizUI;
import Store.Store;
import Games.MVCHighLowMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI {
    private JButton calculatorButton;
    private JPanel panelMain;
    private JButton graphingCalculatorAlexButton;
    private JButton gmailAlexButton;
    private JButton storeEyaadButton;
    private JButton atmNeilButton;
    private JButton rpsAndrewButton;
    private JButton storeButton;
    private JButton quizSeanButton;
    private JButton hlAndrewButton;
    private JButton chimpAndrewButton;
    private JButton numberAndrewButton;
    private JButton physicsFormulas;
    private JButton HLAndrewButton;

    public static void RunMenuUI() {
        FileReader filereader = new FileReader();
        filereader.SetUnlock("sin", 0);
        filereader.SetUnlock("cos", 0);
        filereader.SetUnlock("tan", 0);
        JFrame frame = new JFrame("MenuUI");
        frame.setContentPane(new MenuUI().panelMain);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }

    public MenuUI() {
        calculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorUI.RunCalculatorUI();
            }
        });
        graphingCalculatorAlexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GraphingCalculatorUI.RunGraphingCalculatorUI();
            }
        });
        gmailAlexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GmailUI.RunGmailUI();
            }
        });
        storeEyaadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Store.RunStoreUI();
            }
        });
        atmNeilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ATM.RunATMUI();
            }
        });
        rpsAndrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RPS.RunRPS();
            }
        });

        quizSeanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuizUI.RunQuizUI();
            }
        });

        hlAndrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HighLow.RunHighLow();
            }
        });

        chimpAndrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chimp.RunChimp();
            }
        });

        numberAndrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Numbers.RunNumbers();
            }
        });
        physicsFormulas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhysicsFormulasUI.RunPhysicsFormulasUI();
            }
        });
        HLAndrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVCHighLowMain.RunHL();
            }
        });
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
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        final JPanel spacer1 = new JPanel();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer2, gbc);
        calculatorButton = new JButton();
        calculatorButton.setText("Calculator (Alex)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(calculatorButton, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer3, gbc);
        graphingCalculatorAlexButton = new JButton();
        graphingCalculatorAlexButton.setText("Graphing Calculator (Alex)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(graphingCalculatorAlexButton, gbc);
        gmailAlexButton = new JButton();
        gmailAlexButton.setText("Gmail (Alex)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(gmailAlexButton, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer4, gbc);
        storeEyaadButton = new JButton();
        storeEyaadButton.setText("Store(Eyaad)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(storeEyaadButton, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer5, gbc);
        atmNeilButton = new JButton();
        atmNeilButton.setText("ATM (Neil)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(atmNeilButton, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer6, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer7, gbc);
        rpsAndrewButton = new JButton();
        rpsAndrewButton.setText("Rock Paper Scissors (Andrew)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(rpsAndrewButton, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 18;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer8, gbc);
        quizSeanButton = new JButton();
        quizSeanButton.setText("Quiz (Sean)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 23;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(quizSeanButton, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer9, gbc);
        hlAndrewButton = new JButton();
        hlAndrewButton.setText("Higher Lower (Andrew)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(hlAndrewButton, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 22;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer10, gbc);
        chimpAndrewButton = new JButton();
        chimpAndrewButton.setText("Chimp Memory (Andrew)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 19;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(chimpAndrewButton, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 20;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer11, gbc);
        numberAndrewButton = new JButton();
        numberAndrewButton.setText("Number Memory (Andrew)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 21;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(numberAndrewButton, gbc);
        physicsFormulas = new JButton();
        physicsFormulas.setText("Physics Formulas (Alex)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(physicsFormulas, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer12, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 16;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer13, gbc);
        HLAndrewButton = new JButton();
        HLAndrewButton.setText("Higher Lower MVC (Andrew)");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 17;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(HLAndrewButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}