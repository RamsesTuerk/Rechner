import java.util.ArrayList;
import java.util.Scanner;

public class RechenApp {
    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            int choice = inputInt("Rechnerfunktionen: 1) Auflösung nach x 2) Ableitung 3) Nullstelle nach Newton");

            switch (choice) {
                case 1:
                    System.out.println("y = " + getYFunktion());
                    break;
                case 2:
                    System.out.println("1. Ableitung" + ableitungsFunktion());
                    break;
                case 3:
                    System.out.println("Nullstelle: " + getNullstelle());
                    break;
                case 4:
                    System.out.println("Danke fürs nutzen des Programmes");
                    run = false;
                    break;
                default:
                    System.out.println("Bitte gebe eine Korrekte Funktion an");
            }
        }
    }

    //Userinteraktion eingabe einer Funktion
    private static Funktion funktionsAbfrage() {
        ArrayList<Double> values = new ArrayList<>();

        int grad = inputInt("Welchen Grad hat deine Funktion?");
        Funktion exampleFunktion = new Funktion(grad);
        System.out.println(exampleFunktion.getFormularExampleAsString());
        for (int i = 0; i <= grad; i++) {
            values.add(inputDouble("a" + i + ":"));
        }
        Funktion funktion = new Funktion(grad, values);
        System.out.println("Deine Funktion: " + funktion.getFormularAsString());
        return funktion;
    }

    //Ableiten nach einer Funktion die vom User angegeben wurde
    private static String ableitungsFunktion() {
        Funktion funktion = funktionsAbfrage();
        return funktion.ableitung().getFormularAsString();
    }

    //Auflösen einer Funktion nach Y die vom User angegeben wurde
    private static double getYFunktion() {
        Funktion funktion = funktionsAbfrage();
        double x = inputDouble("Bitte gebe X an:");
        return funktion.getY(x);
    }

    //Errechnung einer Nullstelle von einer Funktion die vom User angegeben wurde
    private static double getNullstelle() {
        Funktion funktion = funktionsAbfrage();
        Naerungsverfahren nullstelle = new Naerungsverfahren(funktion);
        return nullstelle.getNullstelle();
    }

    //Userinput Integer
    private static int inputInt(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextInt();
    }

    //Userinput Double
    private static double inputDouble(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        return scanner.nextDouble();
    }
}
