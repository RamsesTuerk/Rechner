import java.util.ArrayList;

public class Funktion {
    ArrayList<Double> formularValues = new ArrayList<>();
    int formularGrade;

    //Konstrucktor für Funktionen
    public Funktion(int grad, ArrayList<Double> werte) {
        this.formularValues = werte;
        this.formularGrade = grad;
    }

    //Konstructor für die Erstellung einer Funktion ohne werte (Ausschließlich für die erstellung einer Beispielfunktion)
    public Funktion(int grad) {
        this.formularGrade = grad;
    }

    //Rückgabe der Funktion als String für die Ausgabe
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

    // Rückgabe der Beispielfunktion als String für die Ausgabe
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

    //Zusammenschreiben der Funktion in einem String für die Ausgabe
    private String buildStringFormular(String output, int i) {
        if (i + 1 < formularGrade) {
            output += "x";
            output += "^" + (formularGrade - i);

        } else if (i + 1 == formularGrade) {
            output += "x";
        }
        return output;
    }

    //Auflösen der Funktion nach Y
    public double getY(double x) {
        double y = 0;
        for (int j = 0; j < formularGrade; j++) {
            y += formularValues.get(j) * (Math.pow(x, formularGrade - j));
        }
        y += formularValues.getLast();

        return y;
    }

    //Ableiten der Funktion (Giebt eine Funktion Zurück)
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
