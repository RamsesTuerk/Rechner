package r.tuerk.funktionsrechner;

import java.util.ArrayList;
import java.util.Scanner;

public class RechenApp {
    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            int choice = inputInt("Rechnerfunktionen: 1) Auflösung nach y 2) Ableitung 3) Nullstelle nach Newton 4) Exit");

            switch (choice) {
                case 1:
                    System.out.println("y = " + getYFunktion());
                    break;
                case 2:
                    System.out.println("1. Ableitung: " + ableitungsFunktion());
                    break;
                case 3:
                    System.out.println("Nullstelle: " + getNullstelle());
                    break;
                case 4:
                    System.out.println("Danke fürs nutzen des Programmes");
                    run = false;
                    break;
                default:
                    System.out.println("Bitte gebe eine Korrekte r.tuerk.funktionsrechner.Funktion an");
            }
        }
    }

    //Userinteraktion eingabe einer r.tuerk.funktionsrechner.Funktion
    private static Funktion funktionsAbfrage() {
        ArrayList<Double> values = new ArrayList<>();

        int grad = inputInt("Welchen Grad hat deine r.tuerk.funktionsrechner.Funktion?");
        Funktion exampleFunktion = new Funktion(grad);
        System.out.println(exampleFunktion.getFormularExampleAsString());
        for (int i = 0; i <= grad; i++) {
            values.add(inputDouble("a" + i + ":"));
        }
        Funktion funktion = new Funktion(grad, values);
        System.out.println("Deine r.tuerk.funktionsrechner.Funktion: " + funktion.getFormularAsString());
        return funktion;
    }

    //Ableiten nach einer r.tuerk.funktionsrechner.Funktion die vom User angegeben wurde
    private static String ableitungsFunktion() {
        Funktion funktion = funktionsAbfrage();
        return funktion.ableitung().getFormularAsString();
    }

    //Auflösen einer r.tuerk.funktionsrechner.Funktion nach Y die vom User angegeben wurde
    private static double getYFunktion() {
        Funktion funktion = funktionsAbfrage();
        double x = inputDouble("Bitte gebe X an:");
        return funktion.getY(x);
    }

    //Errechnung einer Nullstelle von einer r.tuerk.funktionsrechner.Funktion die vom User angegeben wurde
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
