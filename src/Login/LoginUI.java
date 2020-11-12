package Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI {
    private JTextArea usernameTextArea;
    private JTextArea passwordTextArea;
    private JButton loginButton;

    public LoginUI() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login(usernameTextArea.getText(), passwordTextArea.getText());

            }
        });
    }
}
