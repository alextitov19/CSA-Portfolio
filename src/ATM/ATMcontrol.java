package ATM;
import ATM.ATMmodel.*;

public class ATMcontrol {
    public int bankBalance;

    public static Boolean authenticate (String uname, String pword) {
        if (uname.equals("CSA") && pword.equals("test")) {
            return true;
        } else {
            return false;
        }
    }
   /** public static int changeBalance (int walletMoney, String operator) {
        if (operator == "withdraw") {
            if (bankBalance > 0) {
                money =- 10;
            }
        } else if (operator == "deposit") {
            money =+ 10;
        }

        return money;
    } **/
}
