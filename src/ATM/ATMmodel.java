package ATM;
import javax.swing.*;


public class ATMmodel {
    //private String uname;
    //private String pword;
    //private JLabel update;
    public int bankBalance;
    public String status;

    public ATMmodel(String uname, String pword){
        Boolean boolStatus = ATMcontrol.authenticate(uname, pword);
        if (boolStatus == true){
            this.status = "Login Successful";
            function account = new function();
            account.RunMainUI();
        } else {
            this.status = "Login Unsuccessful";
        }
    }
}
