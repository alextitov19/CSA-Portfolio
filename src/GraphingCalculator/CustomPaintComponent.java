package GraphingCalculator;

import java.awt.*;

public class CustomPaintComponent extends Component {

    public void paint(Graphics g) {
        // Retrieve the graphics context; this object is used to paint shapes
        Graphics2D g2d = (Graphics2D) g;
        GraphingCalculator gc = new GraphingCalculator();
        int[][] coords = gc.GetCoords();
        for (int i = 0; i < coords[0].length; i++) {
            g2d.fillOval(coords[0][i], coords[1][i], 5, 5);
        }

    }

}
