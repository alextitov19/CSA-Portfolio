package Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.*;

import Playground.FileReader;
import Playground.FileWriter;
import Store.Store;
import Store.Items;

public class Model {
    public void bookCheck() {
        Items please = new Items();
        //for when you don't have enough money
        if (please.money < 10) {
            //please.moneyLabel.setText("You do not have enough money for this purchase. You only have " + please.money + " dollars");
        }
        else {
            please.money = please.money - 10;//coins changed
            please.books += 1;
            //please.moneyLabel.setText("You currently have " + please.money + " dollars.");
            //please.itemsLabel.setText("You have bought " + please.books + " books and " + please.cards + " cards.");
            //update coins and xp
            //FileReader fileReader = new FileReader();
            //int[] atts = fileReader.GetAttributes();
            //int xp = atts[1];
            //int coins = please.money;
            //atts = new int[]{coins, xp};
            //FileWriter fileWriter = new FileWriter();
            //fileWriter.SetValue(atts);
        }

    }

}
