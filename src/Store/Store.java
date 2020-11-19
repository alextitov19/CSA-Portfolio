package Store;
//Created by Eyaad Mir
import Gmail.GmailUI;
import Playground.FileReader;
import Playground.FileWriter;
import Store.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.*;

public class Store {
    protected JButton ViewItems;
    protected JButton ViewInventory;
    protected JPanel store;
    protected JLabel welcomeLabel;
    protected JLabel moneyLabel;
    protected JLabel itemsLabel;
    public int money; //coins initialized
    public int books = 0;
    public int cards = 0;



    public static void main(String[] args) {
    }

    public static void RunStoreUI() {
        //load in coins and xp
        FileReader fileReader = new FileReader();
        int[] atts = fileReader.GetAttributes();

        // Declaring parts of the main screen
        JFrame frame = new JFrame();
        JButton ViewItems = new JButton("Buy Items");
        JPanel store = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome to the store!");
        Store test = new Store();
        test.money = atts[0];
        JLabel moneyLabel = new JLabel("You currently have " + test.money + " dollars");
        JLabel itemsLabel = new JLabel("You have bought " + test.books + " books and " + test.cards + " cards.");
        store.setLayout(null);

        // Dimensions and properties of Frame
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.add(store);

        //Setting locations of my buttons and Labels
        ViewItems.setBounds(190, 200, 200, 125);
        welcomeLabel.setBounds(40, 0, 200, 175);
        moneyLabel.setBounds(40, 400, 200, 175);
        itemsLabel.setBounds(340, 400, 300, 175);

        store.add(ViewItems);
        store.add(welcomeLabel);
        store.add(moneyLabel);
        store.add(itemsLabel);
        //Brings user to buying items
        ViewItems.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Items buy = new Items();
                buy.RunItemsUI();
            }
        });


    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
    }
}
class Items extends Store {
    private JLabel test;
    private JPanel items;
    public JLabel moneyLabel;
    public JLabel itemsLabel;
    private JLabel book;
    private JLabel card;
    private JButton buyBook;
    private JButton buyCards;
    private JButton goBack;
    private static String label1;
    private static String label2;

    public void RunItemsUI() {
        //load in coins and xp
        FileReader fileReader = new FileReader();
        int[] atts = fileReader.GetAttributes();

        //Initializing GUI
        JFrame frame = new JFrame();
        JPanel items = new JPanel();
        JLabel test = new JLabel("Buy Items:");
        JLabel book = new JLabel();
        JLabel card = new JLabel();
        money = atts[0];
        JLabel moneyLabel = new JLabel("You currently have " + money + " dollars");
        JLabel itemsLabel = new JLabel("You have bought " + books + " books and " + cards + " cards.");
        JButton buyBook = new JButton("Buy Book: $10");
        JButton buyCards = new JButton("Buy Cards: $5");
        JButton goBack = new JButton("Go Back");

        items.setLayout(null);

        // Dimensions and properties of Frame
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.add(items);

        //Setting images of the items
        book.setIcon(new ImageIcon(".\\.\\.\\Icons\\book.jpg"));
        card.setIcon(new ImageIcon(".\\.\\.\\Icons\\cards.jpg"));
        //Setting locations of my buttons and Labels
        test.setBounds(40, 0, 200, 175);
        moneyLabel.setBounds(40, 450, 500, 175);
        itemsLabel.setBounds(340, 400, 300, 175);
        buyBook.setBounds(40,120,150,125);
        buyCards.setBounds(40,270,150,125);
        book.setBounds(300,120,175,135);
        card.setBounds(300,270,175,117);
        goBack.setBounds(20,400,120,100);

        //Adding parts to panel
        items.add(book);
        items.add(card);
        items.add(test);
        items.add(buyBook);
        items.add(buyCards);
        items.add(moneyLabel);
        items.add(itemsLabel);
        items.add(goBack);

        //When user presses button to buy book
        buyBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model boook = new Model(money, cards, books);
                label1 = boook.label1;
                label2 = boook.label2;
                moneyLabel.setText(label1);
                itemsLabel.setText(label2);
                FileReader fileReader = new FileReader();
                int[] atts = fileReader.GetAttributes();
                int xp = atts[1];
                int coins = money;
                atts = new int[]{coins, xp};
                FileWriter fileWriter = new FileWriter();
                fileWriter.SetValue(atts);

            }
        });
        //When user presses button to buy cards
        buyCards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //For when you don't have enough money
               // if (money < 5) {
                 //   moneyLabel.setText("You do not have enough money for this purchase. You only have " + money + " dollars");
                    //  try {
                    // thread to sleep for 1000 milliseconds
                    //    Thread.sleep(1000);
                    //}  catch (InterruptedException ex) {
                    //  Thread.currentThread().interrupt();
                    //}
                    //moneyLabel.setText("You currently have " + money + " dollars");
              //  }
               // else {
               //     money = money - 5;//coins changed
               //     cards += 1;
                //    moneyLabel.setText("You currently have " + money + " dollars.");
                //    itemsLabel.setText("You have bought " + books + " books and " + cards + " cards.");
                //    FileReader fileReader = new FileReader();
                //    int[] atts = fileReader.GetAttributes();
                //    int xp = atts[1];
                //    int coins = money;
                //    atts = new int[]{coins, xp};
                //    FileWriter fileWriter = new FileWriter();
                //    fileWriter.SetValue(atts);
               // }
                Model1 boook = new Model1(money, cards, books);
                //label1 = boook.label1;
                //label2 = boook.label2;
                //moneyLabel.setText(label1);
                //itemsLabel.setText(label2);
                moneyLabel.setText("You currently have " + money + " dollars.");
                itemsLabel.setText("You have bought " + books + " books and " + cards + " cards.");
                FileReader fileReader = new FileReader();
                int[] atts = fileReader.GetAttributes();
                int xp = atts[1];
                int coins = money;
                atts = new int[]{coins, xp};
                FileWriter fileWriter = new FileWriter();
                fileWriter.SetValue(atts);
            }
        });
        //Go back to store
        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Store back = new Store();
                back.RunStoreUI();
            }
        });



    }
}

