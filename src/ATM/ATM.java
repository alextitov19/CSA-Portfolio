package ATM;

import CalculatorUI.CalculatorUI;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Welcome to Neil Sahai's portion of the Project!
//This will be integrated with the other labs shortly
//creating the variables and the basis for my project
public class ATM extends JFrame {
    private JPanel ATM;
    private JLabel user;
    private JTextField userfield;
    private JButton login;
    private JPasswordField passfield;
    private JLabel update;
    private JLabel pass;
    String uname;
    String pword;

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

    public ATM() {
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(ATM);

        // not using a layout to let me freely move my login around
        ATM.setLayout(null);

        //sets the location of the parts of my GUI
        user.setBounds(40, 20, 80, 125);
        pass.setBounds(40, 40, 80, 175);
        passfield.setBounds(125, 120, 150, 15);
        userfield.setBounds(125, 80, 150, 15);
        update.setBounds(112, 150, 225, 15);
        login.setBounds(125, 190, 150, 15);

        //adding the parts of my login function to the JPanel
        ATM.add(user);
        ATM.add(pass);
        ATM.add(userfield);
        ATM.add(update);
        ATM.add(passfield);
        ATM.add(userfield);
        ATM.add(login);

        //logic to check if the username and password entered are valid, only one works right now.
        login.addActionListener(e -> {
            String uname = userfield.getText();
            String pword = String.valueOf(passfield.getPassword());

            if (uname.equals("NeilSahai") && pword.equals("CSisCool!")) {
                update.setText("Login Successful!");
            } else {
                update.setText("Login Unsuccessful, Please try again!");
            }
        });
    }}




