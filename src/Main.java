import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        VerletIntegrator verletIntegrator=new VerletIntegrator(0.01);
        Analyzer analyzer=new Analyzer();
        TennisToss tennisToss=new TennisToss();
        verletIntegrator.integrate(tennisToss,analyzer,0,20,1.5,5.2);

        try {
            analyzer.saveToFile("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        EulerCromerIntegrator integrator=new EulerCromerIntegrator(0.01);
        analyzer.clearData();
        integrator.integrate(tennisToss,analyzer,0,20,1.5,5.2);
        try {
            analyzer.saveToFile("test2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CarBrake carBrake=new CarBrake(0.86,0.7,1200);
        analyzer.clearData();
        EulerCromerIntegrator2 cromerIntegrator2=new
                EulerCromerIntegrator2(0.01);
        cromerIntegrator2.integrate(carBrake,analyzer,0,50,0,300);
        try {
            analyzer.saveToFile("test3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
