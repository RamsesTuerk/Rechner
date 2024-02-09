import java.util.ArrayList;
import java.util.Scanner;

public class RechenApp {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();

        int grad = inputInt("Welchen Grad hat deine Funktion?");
        Funktion exampleFunktion = new Funktion(grad);
        System.out.println(exampleFunktion.getFormularExampleAsString());
        for (int i = 0; i <= grad; i++) {
            values.add(inputDouble("a" + i + ":"));
        }
        Funktion funktion = new Funktion(grad, values);
        System.out.println("Formel: " + funktion.getFormularAsString());
        Funktion ableitung = funktion.ableitung();
        System.out.println("Ableitung: " + ableitung.getFormularAsString());
        Naerungsverfahren obj = new Naerungsverfahren(funktion);
        System.out.println("Nullstelle: " + obj.getNullstelle());
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
