public class EulerCromerIntegrator2 implements Integrator {
    private double dt;
    public EulerCromerIntegrator2(double dt) {
        this.dt = dt;
    }

    @Override
    public void integrate(CalculateAcceleration calculateAcceleration, ODEUpdate odeUpdate, double tStart, double tStop, double x0, double v0) {
        int nSteps = (int) ((tStop - tStart) / dt);
        double x = x0;
        double v = v0;
        double t = tStart;
        odeUpdate.update(t, x, v);
        double a = calculateAcceleration.a(v);
        for (int i = 0; i < nSteps; i++) {

            double vNew = v + dt * a;
            double xNew = x + vNew* dt;
            double aNew = calculateAcceleration.a(vNew);
            a=aNew;
            t+=dt;
            x=xNew;
            v=vNew;
            odeUpdate.update(t, x, v);

        }
    }
}
