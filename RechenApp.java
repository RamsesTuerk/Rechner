import java.util.ArrayList;
import java.util.Scanner;

public class RechenApp {
    public static void main(String[] args) {

        int choice = inputInt("Rechnerfunktionen: 1) Auflösung nach x 2) Ableitung 3) Nullstelle nach Newton");

        switch (choice) {
            case 1:
                System.out.println(getYFunktion());
                break;
            case 2:
                System.out.println(ableitungsFunktion());
                break;
            case 3:
                System.out.println(getNullstelle());
                break;
            default:
                System.out.println("Bitte gebe eine Korrekte Funktion an");
        }

    }

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

    private static String ableitungsFunktion() {
        Funktion funktion = funktionsAbfrage();
        return funktion.ableitung().getFormularAsString();
    }

    private static double getYFunktion() {
        Funktion funktion = funktionsAbfrage();
        double x = inputDouble("Bitte gebe X an:");
        return funktion.getY(x);
    }

    private static double getNullstelle() {
        Funktion funktion = funktionsAbfrage();
        Naerungsverfahren nullstelle = new Naerungsverfahren(funktion);
        return nullstelle.getNullstelle();
    }

    private static int inputInt(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextInt();
    }

    private static double inputDouble(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        return scanner.nextDouble();
    }
}
