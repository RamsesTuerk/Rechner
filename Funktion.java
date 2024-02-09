import java.util.ArrayList;

public class Funktion {
    ArrayList<Double> formularValues = new ArrayList<Double>();
    int formularGrade;

    public Funktion(int grad, ArrayList<Double> werte) {
        this.formularValues = werte;
        this.formularGrade = grad;
    }

    public Funktion(int grad) {
        this.formularGrade = grad;
    }

    public String getFormularAsString() {
        String output = "";

        for (int i = 0; i < formularValues.size(); i++) {

            if (formularValues.get(i) != 0) {

                if (i > 0 && formularValues.get(i) < 0) {
                    output += " ";
                    output += formularValues.get(i);
                    output = buildStringFormular(output, i);
                } else if (i == 0) {
                    output += formularValues.get(i);
                    output = buildStringFormular(output, i);
                } else {
                    output += " +";
                    output += formularValues.get(i);
                    output = buildStringFormular(output, i);
                }
            }
        }
        return output;
    }

    public String getFormularExampleAsString() {
        String output = "";

        for (int i = 0; i < formularGrade + 1; i++) {

            if (i > 0) {
                output += " +a" + i;
            } else {
                output += "a" + i;
            }
            output = buildStringFormular(output, i);

        }
        return output;
    }

    private String buildStringFormular(String output, int i) {
        if (i + 1 < formularGrade) {
            output += "x";
            output += "^" + (formularGrade - i);

        } else if (i + 1 == formularGrade) {
            output += "x";

        }
        return output;
    }

    public double getY(double x) {
        double y = 0;
        for (int j = 0; j < formularGrade; j++) {
            y += formularValues.get(j) * (Math.pow(x, formularGrade - j));
        }
        y += formularValues.getLast();

        return y;
    }

    public Funktion ableitung() {
        ArrayList<Double> ableitungValues = new ArrayList<>();
        int ableitungGrade = formularGrade - 1;
        for (int i = 0; i <= formularGrade; i++) {
            ableitungValues.add(formularValues.get(i) * (formularGrade - i));
        }
        ableitungValues.removeLast();
        return new Funktion(ableitungGrade, ableitungValues);
    }
}
