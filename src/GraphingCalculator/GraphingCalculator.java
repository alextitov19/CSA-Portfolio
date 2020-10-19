package GraphingCalculator;

import java.awt.*;

public class GraphingCalculator {

    private int numberOfPoints = 20;

    private int[][] coordinates = new int[2][numberOfPoints];



    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());

        int frameWidth = 300;

        int frameHeight = 300;

        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

    }

    //takes in a form of y=mx+b
    public void CalculateLinear(int m, int b) {
        for (int i = 0; i < numberOfPoints; i++) {
            coordinates[0][i] = i;
            coordinates[1][i] = (m * i) + b;
        }
    }

    public int[][] GetCoords() {
        return coordinates;
    }

}
