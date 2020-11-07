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

public class Control {
    public void changePriceBook() {
        Items pog = new Items();
        pog.money-=10;
        pog.books+=1;
    }
    public void changePriceCard() {
        Items pog = new Items();
        pog.money-=5;
        pog.cards+=1;
    }
}
