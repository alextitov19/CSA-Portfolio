package ATM;

import ATM.ATMmodel;
import javax.swing.*;
import java.awt.*;

//Welcome to Neil Sahai's portion of the Project!
//This will be integrated with the other labs shortly
//creating the variables and the basis for my project
public class ATM extends JFrame {
    protected JPanel ATM;
    protected JLabel user;
    protected JTextField userfield;
    protected JButton login;
    protected JPasswordField passfield;
    protected JLabel update;
    protected JLabel pass;
    protected int money = 100;
    protected int balance = 0;
    String uname;
    String pword;
    private static String response;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ATM frame = new ATM();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void RunATMUI() {
        // creating the parts of my login screen
        JFrame frame = new JFrame();
        JPanel ATM = new JPanel();
        JLabel user = new JLabel("Username");
        JLabel pass = new JLabel("Password");
        JTextField userfield = new JTextField();
        JLabel update = new JLabel("Login in with your Credentials!");
        JPasswordField passfield = new JPasswordField();
        JButton login = new JButton("Login!");


        // setting the size and constraints for the login window
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.add(ATM);

        // not using a layout to let me freely move my login around
        ATM.setLayout(null);

        //sets the location of the parts of my GUI
        user.setBounds(40, 20, 80, 125);
        pass.setBounds(40, 40, 80, 175);
        passfield.setBounds(125, 120, 150, 20);
        userfield.setBounds(125, 80, 150, 20);
        update.setBounds(112, 150, 225, 20);
        login.setBounds(125, 190, 150, 20);

        //adding the parts of my login function to the JPanel
        ATM.add(user);
        ATM.add(pass);
        ATM.add(userfield);
        ATM.add(update);
        ATM.add(passfield);
        ATM.add(userfield);
        ATM.add(login);

        //logic to check if the username and password entered are valid.
        //model
        login.addActionListener(e -> {
            update.setText("");
            String uname = userfield.getText();
            String pword = String.valueOf(passfield.getPassword());
            ATMmodel authentication = new ATMmodel(uname, pword);
            response = authentication.status;
            update.setText(response);
        });
    }}

    class function extends ATM {
        //creating the variables for the second panel
        private JPanel main;
        private JLabel withdraw;
        private JLabel deposit;
        private JLabel moneycount;
        private JButton dep;
        private JButton with;

        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                try {
                    function frame = new function();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        public void RunMainUI() {
            JFrame frame = new JFrame();
            JPanel main = new JPanel();
            JLabel withdraw = new JLabel("Click here to withdraw money");
            JLabel moneycount = new JLabel("You currently have " + money + " dollars in your wallet");
            JLabel balancecount = new JLabel("You currently have " + balance + "dollars in your Bank Account");
            JLabel accountupdate = new JLabel("Welcome to your account!");
            JButton with = new JButton("Withdraw $10");
            JButton dep = new JButton("Deposit $10");
            JLabel deposit = new JLabel("Click here to deposit money");

            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            frame.add(main);

            main.setLayout(null);

            //setting the location of the parts of my main screen
            withdraw.setBounds(20, 200, 200, 25);
            deposit.setBounds(250, 200, 200, 25);
            moneycount.setBounds(125, 50, 300, 25);
            balancecount.setBounds(125,150,400, 25);
            accountupdate.setBounds(175, 100, 300, 25);
            with.setBounds(40, 250, 200, 100);
            dep.setBounds(250, 250, 200, 100);

            //adding the parts to my main panel
            main.add(withdraw);
            main.add(deposit);
            main.add(with);
            main.add(dep);
            main.add(moneycount);
            main.add(accountupdate);
            main.add(balancecount);


            //logic for the deposit and withdraw functions
            //model
            with.addActionListener(e -> {
                if (money > 10) {
                    //control
                    //deposit action listener
                    money = money+10;
                    balance = balance-10;
                    moneycount.setText("You have " + money + " dollars available");
                    balancecount.setText("You currently have" + balance + "dollars in your Bank Account");

                } else {
                    accountupdate.setText("You do not have enough money to withdraw.");
                }
                    //withdraw action listener
                dep.addActionListener(s -> {
                    if (money > 0) {
                        //control
                        money = money-10;
                        balance = balance+10;
                        moneycount.setText("You have " + money + " dollars available");
                        balancecount.setText("You currently have" + balance + "dollars in your Bank Account");
                    } else {
                        accountupdate.setText("You do not have enough money to deposit.");
                    }
                });
            });}
        }






