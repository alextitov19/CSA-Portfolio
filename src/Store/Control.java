package Store;

import java.lang.*;

public class Control {
    public static Boolean authenticateBook(int money) {
        if (money >= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static Boolean authenticateCard(int money) {
        if (money >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
