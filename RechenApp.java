import java.util.ArrayList;
import java.util.Scanner;

public class RechenApp {
    public static void main(String[] args) {

        ableitungsFunktion();

    }

    private static Funktion funktionsAbfrage(){
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

    private static void ableitungsFunktion(){

        Funktion funktion = funktionsAbfrage();

        System.out.println(funktion.ableitung().getFormularAsString());

    }

    private static void getYFunktion(){
        Funktion funktion = funktionsAbfrage();

        double x = inputDouble("Bitte gebe X an:");

        System.out.println(funktion.getY(x));
    }

    private static void getNullstelle(){

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
