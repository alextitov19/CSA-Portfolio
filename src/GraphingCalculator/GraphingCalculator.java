package GraphingCalculator;

import java.awt.*;

public class GraphingCalculator {

    private int numberOfPoints = 400;

    public double m, a, n, b;

    public double[][] coords;

    public static void main(String[] args) {

    }

    //takes in a form of y=m((x+a)^n)+b
    public void CalculateLinear() {
        double[][] arr = new double[2][numberOfPoints];
        for (int i = 0; i < numberOfPoints; i++) {
            arr[0][i] = i;
            arr[1][i] = (m * Math.pow((i + a), n)) + b;
            System.out.println(arr[1][i]);
        }
        coords = arr;
    }

    public void SetVars(double[] arr) {

    }

    public void RunGraphingCalculator() {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());
        int frameWidth = 1000;
        int frameHeight = 1000;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

}
