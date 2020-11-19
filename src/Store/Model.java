package Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.*;

import Playground.FileReader;
import Store.Store;
import Store.Items;

public class Model extends Store {
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
class Model1 extends Store {
    public String label1;
    public String label2;

    public Model1(int money, int cards, int books) {
        Boolean bool = Control.authenticateCard(money);
        if (bool == true){
            money-=5;
            cards+=1;
            this.label1 = "You currently have " + money + " dollars";
            this.label2 = "You have bought " + books + " books and " + cards + " cards.";
        } else {
            this.label1 = "You do not have enough money for this purchase. You only have " + money + " dollars";
        }

    }

}
