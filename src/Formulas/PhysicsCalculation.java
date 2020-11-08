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

    public double Calculate(int op) throws Exception {
        double answer;
        switch (op){
            case 1:
                answer = vi + (a*t);
                break;
            case 2:
                answer = xi + (vi * t) + (0.5 * a * t * t);
                break;
            case 3:
                answer = Math.sqrt((vi * vi) + (2 * a * (xf - xi)));
                break;
            case 4:
                answer = xi + (0.5 * (vf + vi) * t);
                break;
            default:
                throw new Exception("PhysicsCalculation.Calculate.op value not 1-4");
        }
        return answer;
    }

}
