//Copyright Aleksandr Titov 10/15/2020
//Aleksand Titov has ownership and credit for this file

package CalculatorUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorUI {
    private JPanel panelMain;
    private JButton button4;
    private JButton button7;
    private JButton button2;
    private JButton button5;
    private JButton button8;
    private JButton button3;
    private JButton button6;
    private JButton button9;
    private JButton buttonAdd;
    private JButton buttonDivide;
    private JButton buttonPower;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonRoot;
    private JButton buttonDot;
    private JButton buttonEquals;
    private JLabel labelOutput;
    private JButton button1;
    private JButton button0;
    private JButton buttonNegative;
    private JButton buttonBackspace;
    private JButton buttonClear;

    private final int ADD = 0;
    private final int SUB = 1;
    private final int MUL = 2;
    private final int DIV = 3;
    private final int POW = 4;
    private final int ROO = 5;

    private int currentOp;

    private double firstInput;
    private double secondInput;


    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorUI");
        CalculatorUI calculator = new CalculatorUI();
        frame.setContentPane(calculator.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public CalculatorUI() {

        labelOutput.setText(""); //clear output label


        //add listeners to all buttons
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button0.getText();
                labelOutput.setText(text);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button1.getText();
                labelOutput.setText(text);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button2.getText();
                labelOutput.setText(text);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button3.getText();
                labelOutput.setText(text);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button4.getText();
                labelOutput.setText(text);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button5.getText();
                labelOutput.setText(text);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button6.getText();
                labelOutput.setText(text);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button7.getText();
                labelOutput.setText(text);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button8.getText();
                labelOutput.setText(text);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += button9.getText();
                labelOutput.setText(text);
            }
        });

        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = labelOutput.getText();
                text += buttonDot.getText();
                labelOutput.setText(text);
            }
        });

        buttonNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double text = Double.parseDouble(labelOutput.getText());
                text *= -1;
                labelOutput.setText(Double.toString(text));
            }
        });


        //operation buttons
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, ADD);
                labelOutput.setText("");
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, SUB);
                labelOutput.setText("");
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, MUL);
                labelOutput.setText("");
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, DIV);
                labelOutput.setText("");
            }
        });

        buttonPower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, POW);
                labelOutput.setText("");
            }
        });

        buttonRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetOperation(labelOutput, ROO);
                labelOutput.setText("");
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetAnswer(labelOutput);
            }
        });

        buttonBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = labelOutput.getText();
                if (s.length() > 0) {
                    char[] arr = s.toCharArray();
                    char[] newArr = new char[s.length() - 1];
                    for (int i = 0; i < newArr.length; i++) {
                        newArr[i] = arr[i];
                    }
                    labelOutput.setText(newArr.toString());
                }
            }
        });

    }

    //calculate result of math operation and set labelOutput text to result
    //ran by buttonEquals
    private void SetAnswer(JLabel label) {
        if (CheckLabel(label) == true) {
            double result = 0;
            secondInput = GetDouble(label);
            switch (currentOp) {
                case ADD:
                    result = firstInput + secondInput;
                    break;
                case SUB:
                    result = firstInput - secondInput;
                    break;
                case MUL:
                    result = firstInput * secondInput;
                    break;
                case DIV:
                    result = firstInput / secondInput;
                    break;
                case POW:
                    result = Math.pow(firstInput, secondInput);
                    break;
                case ROO:
                    result = Math.pow(firstInput, 1 / secondInput);
                    break;
                default:
                    System.out.printf("currentOp value = %d\n", currentOp);
                    try {
                        throw new Exception("currentOp is equal to a value that is not 0-5");
                    } catch (Exception exception) {
                        System.out.print(exception.getMessage());
                        System.exit(1);
                    }
            }
            labelOutput.setText(Double.toString(result));
        }
    }

    //record input and operation
    //ran by mathOp buttons
    private void SetOperation(JLabel label, int operation) {
        if (CheckLabel(label) == true) {
            firstInput = GetDouble(label);
            currentOp = operation;
            SetMathOpButtonStatus(false);
            System.out.printf("First input : %f\n", firstInput);
        }
    }

    //convert label text to double
    //run only after running CheckLabel()
    private double GetDouble(JLabel label) {
        String s = label.getText();
        if (s.charAt(0) == '.') {
            s = "0" + s;
        }
        if (s.charAt(s.length() - 1) == '.') {
            s = s + "0";
        }
        return Double.parseDouble(s);
    }

    //checks a label to see if it has a number
    private boolean CheckLabel(JLabel label) {
        if (label.getText().isBlank() == false) {
            if (label.getText() != ".") {
                return true;
            }
        }
        return false;
    }

    //enable or disable the status of mathOp buttons
    private void SetMathOpButtonStatus(boolean status) {
        buttonAdd.setEnabled(status);
        buttonSubtract.setEnabled(status);
        buttonMultiply.setEnabled(status);
        buttonDivide.setEnabled(status);
        buttonRoot.setEnabled(status);
        buttonPower.setEnabled(status);
    }

    //reset/clear calculator
    //to be called by buttonClear which is not added yet
    private void Reset() {
        SetMathOpButtonStatus(true);
        firstInput = secondInput = 0.0;
        currentOp = 0;
        labelOutput.setText("");
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
        panelMain.setBackground(new Color(-12829636));
        panelMain.setEnabled(true);
        panelMain.setForeground(new Color(-7566848));
        button4 = new JButton();
        button4.setBackground(new Color(-7567360));
        button4.setForeground(new Color(-12829636));
        button4.setText("4");
        button4.putClientProperty("hideActionText", Boolean.FALSE);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button4, gbc);
        button5 = new JButton();
        button5.setBackground(new Color(-7567360));
        button5.setForeground(new Color(-12829636));
        button5.setText("5");
        button5.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button5, gbc);
        button6 = new JButton();
        button6.setBackground(new Color(-7567360));
        button6.setForeground(new Color(-12829636));
        button6.setText("6");
        button6.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button6, gbc);
        labelOutput = new JLabel();
        labelOutput.setBackground(new Color(-12829636));
        Font labelOutputFont = this.$$$getFont$$$("Courier", Font.BOLD, 72, labelOutput.getFont());
        if (labelOutputFont != null) labelOutput.setFont(labelOutputFont);
        labelOutput.setForeground(new Color(-9736592));
        labelOutput.setHorizontalAlignment(11);
        labelOutput.setText("0.0");
        labelOutput.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(labelOutput, gbc);
        button1 = new JButton();
        button1.setBackground(new Color(-7567360));
        button1.setForeground(new Color(-12829636));
        button1.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button1, gbc);
        button7 = new JButton();
        button7.setBackground(new Color(-7567360));
        button7.setForeground(new Color(-12829636));
        button7.setText("7");
        button7.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button7, gbc);
        button2 = new JButton();
        button2.setBackground(new Color(-7567360));
        button2.setForeground(new Color(-12829636));
        button2.setText("2");
        button2.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button2, gbc);
        button3 = new JButton();
        button3.setBackground(new Color(-7567360));
        button3.setForeground(new Color(-12829636));
        button3.setText("3");
        button3.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button3, gbc);
        button8 = new JButton();
        button8.setBackground(new Color(-7567360));
        button8.setForeground(new Color(-12829636));
        button8.setText("8");
        button8.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button8, gbc);
        button9 = new JButton();
        button9.setBackground(new Color(-7567360));
        button9.setForeground(new Color(-12829636));
        button9.setText("9");
        button9.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button9, gbc);
        button0 = new JButton();
        button0.setBackground(new Color(-7567360));
        button0.setForeground(new Color(-12829636));
        button0.setText("0");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(button0, gbc);
        buttonNegative = new JButton();
        buttonNegative.setBackground(new Color(-7567360));
        buttonNegative.setForeground(new Color(-12829636));
        buttonNegative.setText("(-)");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonNegative, gbc);
        buttonDot = new JButton();
        buttonDot.setBackground(new Color(-7567360));
        buttonDot.setForeground(new Color(-12829636));
        buttonDot.setText(".");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonDot, gbc);
        buttonEquals = new JButton();
        buttonEquals.setBackground(new Color(-7567360));
        buttonEquals.setForeground(new Color(-12829636));
        buttonEquals.setText("=");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonEquals, gbc);
        buttonAdd = new JButton();
        buttonAdd.setBackground(new Color(-7567360));
        buttonAdd.setForeground(new Color(-12829636));
        buttonAdd.setText("+");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonAdd, gbc);
        buttonSubtract = new JButton();
        buttonSubtract.setBackground(new Color(-7567360));
        buttonSubtract.setForeground(new Color(-12829636));
        buttonSubtract.setText("-");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonSubtract, gbc);
        buttonRoot = new JButton();
        buttonRoot.setBackground(new Color(-7567360));
        buttonRoot.setForeground(new Color(-12829636));
        buttonRoot.setText("root");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonRoot, gbc);
        buttonPower = new JButton();
        buttonPower.setBackground(new Color(-7567360));
        buttonPower.setForeground(new Color(-12829636));
        buttonPower.setText("x^y");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonPower, gbc);
        buttonDivide = new JButton();
        buttonDivide.setBackground(new Color(-7567360));
        buttonDivide.setForeground(new Color(-12829636));
        buttonDivide.setText("%");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonDivide, gbc);
        buttonMultiply = new JButton();
        buttonMultiply.setBackground(new Color(-7567360));
        buttonMultiply.setForeground(new Color(-12829636));
        buttonMultiply.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonMultiply, gbc);
        buttonBackspace = new JButton();
        buttonBackspace.setBackground(new Color(-7567360));
        buttonBackspace.setForeground(new Color(-12829636));
        buttonBackspace.setText("<-");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonBackspace, gbc);
        buttonClear = new JButton();
        buttonClear.setBackground(new Color(-7567360));
        buttonClear.setForeground(new Color(-12829636));
        buttonClear.setText("Clear");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(buttonClear, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
