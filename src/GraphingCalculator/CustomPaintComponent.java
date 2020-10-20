package GraphingCalculator;

import java.awt.*;

public class CustomPaintComponent extends Component {

    public void paint(Graphics g) {
        // Retrieve the graphics context; this object is used to paint shapes
        Graphics2D g2d = (Graphics2D) g;
        GraphingCalculator gc = new GraphingCalculator();
        double[][] coords = gc.GetCoords();
        for (int i = 0; i < coords[0].length; i++) {
            g2d.fillOval( (int) Math.round(coords[0][i]-2.5), (int) Math.round(coords[1][i]-2.5), 5, 5);
        }
        for (int i = 0; i < coords[0].length-1; i++) {
            g2d.drawLine((int) Math.round(coords[0][i]), (int) Math.round(coords[1][i]), (int) Math.round(coords[0][i+1]), (int) Math.round(coords[1][i+1]));
        }

    }

}
