package GraphingCalculator;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class GraphingCalculator {

    private int[][] coordinates = {{20, 40, 60, 80, 100},
                                  {60, 22, 78, 203, 199}};


    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());

        int frameWidth = 300;

        int frameHeight = 300;

        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

    }

    public int[][] GetCoords() {
        return coordinates;
    }

}
