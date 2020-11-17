package Games;

import Playground.FileReader;

public class HLModel {

    public int highScore = 0;

    public boolean compare(int x, int y) {
        boolean win;
        if (y > x) {
            win = true;
        } else {
            win = false;
        }

        return win;
    }

    public void update(int score) {
        if (score > highScore) {
            highScore = score;
        }
    }

    public void money(int score) {
        FileReader fileReader = new FileReader();
        int[] atts = fileReader.GetAttributes();
        int coins = atts[0];
        int xp = atts[1];
        coins += score;
        atts = new int[]{coins, xp};
        FileWriter fileWriter = new FileWriter();
        fileWriter.SetValue(atts);
    }

}

