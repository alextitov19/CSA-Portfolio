package Games;

import javax.swing.*;
import javax.swing.text.View;

public class MVCHighLowMain {

    public static void main(String[] args) {
        RunHL();
    }

    public static void RunHL() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HLModel model = new HLModel();
                HLView view = new HLView();
                HLControl controller = new HLControl(model,view);
            }
        });
    }

}
