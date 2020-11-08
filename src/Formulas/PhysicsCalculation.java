package Formulas;

public class PhysicsCalculation {

    double xi, xf, vi, vf, a, t;

    public PhysicsCalculation(double[] values) {
        xi = values[0];
        xf = values[1];
        vi = values[2];
        vf = values[3];
        a = values[4];
        t = values[5];
    }

    public double Calculate(int op) {
        switch (op){
            case 1:
            case 2:
            case 3:
            case 4:
            default:
        }
        return 0;
    }

}
