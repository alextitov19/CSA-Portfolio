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
import Store.Model;

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
