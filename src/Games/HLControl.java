package Games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HLControl {

    //roundStarted boolean changes
    public boolean roundStarted = false;
    private HLView view;
    private HLModel model;

    //allows control to access model and view instances
    public HLControl(HLModel model, HLView view) {
        this.model = model;
        this.view = view;

        //creates frame
        view.RunHLView(view);

        //set individual action listeners
        view.setUpActionListener(new UpListener());
        view.setNextActionListener(new NextListener());
        view.setDownActionListener(new DownListener());

    }


    class UpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(roundStarted) {
                //after higher or lower is pressed, the user should only be allowed to press next,
                //roundStarted is false, meaning that up and down have no function
                roundStarted = false;
                int one = Integer.parseInt(view.getNumber1Text());
                //get random digit for second number
                //one is parameter to make sure two != one
                int two = randomize(one);
                view.setNumber2(Integer.toString(two));
                if(compare(one,two)) {
                    view.setTitleLabel("<html><div style='text-align: center;'>Correct!<br>+1 point<br>Press NEXT</html>");
                    view.score++;
                } else {
                    view.setTitleLabel("<html><div style='text-align: center;'>\"You Lost!<br>Press RESTART to try again<html>");
                    view.setNextButton("RESTART");
                    view.score = 0;
                    //after loss, converts score to money
                    getMoney(view.score);
                }
                //updates score
                view.setScoreLabel("Score: " + view.score);
                //updates high score
                updateHighScore(view.score, model.highScore);
            }
        }
    }

    class DownListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(roundStarted) {
                //after higher or lower is pressed, the user should only be allowed to press next,
                //roundStarted is false, meaning that up and down have no function
                roundStarted = false;
                int one = Integer.parseInt(view.getNumber1Text());
                //get random digit for second number
                //one is parameter to make sure two != one
                int two = randomize(one);
                view.setNumber2(Integer.toString(two));
                if(compare(two,one)) {
                    view.setTitleLabel("<html><div style='text-align: center;'>Correct!<br>+1 point<br>Press NEXT</html>");
                    view.score++;
                } else {
                    view.setTitleLabel("<html><div style='text-align: center;'>\"You Lost!<br>Press RESTART to try again<html>");
                    view.setNextButton("RESTART");
                    view.score = 0;
                    //after loss, converts score to money
                    getMoney(view.score);
                }
                //updates score
                view.setScoreLabel("Score: " + view.score);
                //updates high score
                updateHighScore(view.score, model.highScore);
            }
        }
    }

    class NextListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(!roundStarted) {
                //when the game first begins, the first number must be randomized as well.
                //randomizes number 2 before number 2 is moved to number 1
                if(view.score == 0){
                    Random random = new Random();
                    int x = random.nextInt(9) + 1;
                    view.setNumber2(Integer.toString(x));
                }
                //sets number 1 equal to number 2
                view.setNumber1(view.getNumber2Text());
                //clears number2
                view.setNumber2("?");
                view.clearTitleIcon();
                view.setTitleLabel("<html><div style='text-align: center;'>Will the next number be<br>HIGHER or LOWER?");
                //update score
                view.setScoreLabel("Score: " + view.score);
                view.setNextButton("    NEXT   ");
            }
            roundStarted = true;
        }
    }

    private int randomize(int x) {
        Random rand = new Random();
        int y = rand.nextInt(9) + 1;
        //if the new number (number 2) is equivalent to the given number (number 1), the number must be rerandomized
        //recursion allows this method to keep randomizing until a new number is achieved (x != y)
        if(x == y) {
            y = randomize(x);
        }
        return y;
    }

    //decides whether user input is correct
    private boolean compare(int x, int y) {
        return model.compare(x,y);
    }

    //updates high score if the new score is higher
    private void updateHighScore(int score, int highScore) {
        model.update(score);
        view.setHighScoreLabel("High Score: " + model.highScore);
    }

    //converts score to coins
    private void getMoney(int score) {
        model.money(score);
    }



}

