package GraphingCalculator;

import java.awt.*;

public class CustomPaintComponent extends Component {

    public void paint(Graphics g) {
        // Retrieve the graphics context; this object is used to paint shapes
        Graphics2D g2d = (Graphics2D) g;
        GraphingCalculator gc = new GraphingCalculator();
        int[] xs = gc.GetCoords();
        for (int i = 0; i < xs.length; i++) {
            g2d.drawOval(xs[i], 50, 5, 5);
        }

    }

}
