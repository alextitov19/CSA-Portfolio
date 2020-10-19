package GraphingCalculator;

import java.awt.*;

public class GraphingCalculator {

    private int numberOfPoints = 400;
    private int[][] coordinates = new int[2][numberOfPoints];

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());
        int frameWidth = 1000;
        int frameHeight = 1000;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    //takes in a form of y=mx+b
    private int[][] CalculateLinear(int m, int b) {
        int[][] arr = new int[2][numberOfPoints];
        for (int i = 0; i < numberOfPoints; i++) {
            arr[0][i] = i;
            arr[1][i] = (m * i) + b;
            System.out.printf("i:%d, X: %d, Y:%d\n", i, coordinates[0][i], coordinates[1][i]);
        }
        return arr;
    }

    public int[][] GetCoords() {
        int[][] arr = {{10, 20, 30, 40}, {10, 20, 30, 40}};
        GraphingCalculator gc = new GraphingCalculator();
        return  gc.CalculateLinear(1, 7);
    }

}
