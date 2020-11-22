package Games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import Games.HLView;
import Games.HLModel;

import javax.swing.*;

public class HLControl {

    public boolean roundStarted = false;
    private HLView view;
    private HLModel model;
    private ActionListener upActionListener;
    private ActionListener nextActionListener;
    private ActionListener downActionListener;

    public HLControl(HLModel model, HLView view) {
        this.model = model;
        this.view = view;

        view.RunHLView(view);

        view.setUpActionListener(new UpListener());
        view.setNextActionListener(new NextListener());
        view.setDownActionListener(new DownListener());

    }


    class UpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(roundStarted) {
                roundStarted = false;
                int one = Integer.parseInt(view.getNumber1Text());
                int two = randomize(one);
                view.setNumber2(Integer.toString(two));
                if(compare(one,two)) {
                    view.setTitleLabel("<html><div style='text-align: center;'>Correct!<br>+1 point<br>Press NEXT</html>");
                    view.score++;
                } else {
                    view.setTitleLabel("<html><div style='text-align: center;'>\"You Lost!<br>Press RESTART to try again<html>");
                    view.setNextButton("RESTART");
                    view.score = 0;
                    getMoney(view.score);
                }
                view.setScoreLabel("Score: " + view.score);
                updateHighScore(view.score, model.highScore);
            }
        }
    }

    class DownListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(roundStarted) {
                roundStarted = false;
                int one = Integer.parseInt(view.getNumber1Text());
                int two = randomize(one);
                view.setNumber2(Integer.toString(two));
                if(compare(two,one)) {
                    view.setTitleLabel("<html><div style='text-align: center;'>Correct!<br>+1 point<br>Press NEXT</html>");
                    view.score++;
                } else {
                    view.setTitleLabel("<html><div style='text-align: center;'>\"You Lost!<br>Press RESTART to try again<html>");
                    view.setNextButton("RESTART");
                    view.score = 0;
                    getMoney(view.score);
                }
                view.setScoreLabel("Score: " + view.score);
                updateHighScore(view.score, model.highScore);
            }

        }


    }

    class NextListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(!roundStarted) {
                if(view.score == 0){
                    Random random = new Random();
                    int x = random.nextInt(9) + 1;
                    view.setNumber2(Integer.toString(x));
                }
                view.setNumber1(view.getNumber2Text());
                view.setNumber2("?");
                view.clearTitleIcon();
                view.setTitleLabel("<html><div style='text-align: center;'>Will the next number be<br>HIGHER or LOWER?");
                view.setScoreLabel("Score: " + view.score);
                view.setNextButton("    NEXT   ");
            }
            roundStarted = true;
        }
    }

    private int randomize(int x) {
        Random rand = new Random();
        int y = rand.nextInt(9) + 1;
        if(x == y) {
            y = randomize(x);
        }
        return y;
    }

    private boolean compare(int x, int y) {
        return model.compare(x,y);
    }

    private void updateHighScore(int score, int highScore) {
        model.update(score);
        view.setHighScoreLabel("High Score: " + model.highScore);
    }

    private void getMoney(int score) {
        model.money(score);
    }



}

