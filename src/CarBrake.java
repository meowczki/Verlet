public class CarBrake implements CalculateAcceleration {
    double c;
    double mi;
    double m;

    public CarBrake(double c, double mi, double m) {
        this.c = c;
        this.mi = mi;
        this.m = m;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getMi() {
        return mi;
    }

    public void setMi(double mi) {
        this.mi = mi;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    @Override
    public double a(double x) {
        return (-c*x*x+mi*m*9.81)/m;
    }
}
