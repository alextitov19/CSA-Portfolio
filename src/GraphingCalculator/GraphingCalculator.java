package GraphingCalculator;

import java.awt.*;

public class GraphingCalculator {

    private int numberOfPoints = 400;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());
        int frameWidth = 1000;
        int frameHeight = 1000;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    //takes in a form of y=m((x+a)^n)+b
    private double[][] CalculateLinear(int m, int a, int n, int b) {
        double[][] arr = new double[2][numberOfPoints];
        for (int i = 0; i < numberOfPoints; i++) {
            arr[0][i] = i;
            arr[1][i] = (m * Math.pow((i + a), n)) + b;
            System.out.println(arr[1][i]);
        }
        return arr;
    }

    public double[][] GetCoords() {
        double[][] arr = {{10, 20, 30, 40}, {10, 20, 30, 40}};
        GraphingCalculator gc = new GraphingCalculator();
        return  gc.CalculateLinear(1, 0, 2, 0);
    }

}
