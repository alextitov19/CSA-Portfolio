package Store;
import java.lang.*;

public class Model {
    public String label1;
    public String label2;

    public Model(int money, int cards, int books) {
        Boolean bool = Control.authenticateBook(money);
        if (bool == true){
            money-=10;
            books+=1;
            this.label1 = "You currently have " + money + " dollars";
            this.label2 = "You have bought " + books + " books and " + cards + " cards.";
        } else {
            this.label1 = "You do not have enough money for this purchase. You only have " + money + " dollars";
        }

    }

}
