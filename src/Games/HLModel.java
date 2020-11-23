package Games;

import Playground.FileReader;

public class HLModel {

    public int highScore = 0;

    //if users choice is correct, returns win = true;
    public boolean compare(int x, int y) {
        boolean win;
        if (y > x) {
            win = true;
        } else {
            win = false;
        }

        return win;
    }

    //changes high score if score is higher
    public void update(int score) {
        if (score > highScore) {
            highScore = score;
        }
    }

    //changes coin value in the xml file
    public void money(int score) {
        FileReader fileReader = new FileReader();
        int[] atts = fileReader.GetAttributes();
        int coins = atts[0];
        int xp = atts[1];
        coins += score;
        atts = new int[]{coins, xp};
        fileReader.SetValue(atts);
    }

}

