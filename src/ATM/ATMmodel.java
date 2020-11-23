package ATM;
import Playground.FileReader;
import javax.swing.*;
import ATM.*;


public class ATMmodel {
    //private String uname;
    //private String pword;
    //private JLabel update;
    public int bankBalance;
    public String status;

    public ATMmodel(String uname, String pword){
        FileReader fileReader = new FileReader();
        int[] atts = fileReader.GetAttributes();
        bankBalance = atts[0];
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
