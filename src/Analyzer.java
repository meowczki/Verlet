import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Analyzer implements ODEUpdate {
    private List<Double> xValues = new ArrayList<>();
    private List<Double> vValues = new ArrayList<>();
    private List<Double> tValues = new ArrayList<>();

    public List<Double> getxValues() {
        return xValues;
    }


    public List<Double> getvValues() {
        return vValues;
    }

    public List<Double> gettValues() {
        return tValues;
    }


    public void saveToFile(String fileName) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.println("t \t x \t v");
        for (int i = 0; i < xValues.size(); i++) {
            printWriter.println(tValues.get(i).toString() + '\t' + xValues.get(i).toString() + '\t' + vValues.get(i).toString());
        }
        printWriter.close();


    }

    @Override
    public void update(double t, double x, double v) {
        xValues.add(x);
        vValues.add(v);
        tValues.add(t);
    }

    public void clearData() {
        xValues.clear();
        tValues.clear();
        vValues.clear();
    }
}
