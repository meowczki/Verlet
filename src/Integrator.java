public interface Integrator {
    public void integrate(CalculateAcceleration calculateAcceleration, ODEUpdate odeUpdate,
                          double tStart, double tStop, double x0, double v0);

}
