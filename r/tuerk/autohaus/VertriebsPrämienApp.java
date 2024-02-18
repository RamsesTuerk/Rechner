package r.tuerk.autohaus;

import java.util.Scanner;

public class VertriebsPrämienApp {

    //TODO Falsche eingaben verhindern

    private static Geschaeftsliste geschaeftsliste = new Geschaeftsliste();

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            int userChoice = inputInt("Was willst du machen? 1) EIn Geschäft hinzufügen 2) Alle Geschäfte anzeigen 3) Das wertvollste Geschäft anzeigen 4) Programm verlassen");
            switch (userChoice) {
                case 1:
                    geschaeftHinzufuegen();
                    break;
                case 2:
                    geschaeftslisteAusgeben();
                    break;
                case 3:
                    hoechsterGeschaeftsabschlussAusgeben();
                    break;
                case 4:
                    run = false;
                    System.out.println("Auf Wiedersehen");
                    break;
                default:
                    System.out.println("Bitte gebe eine korrekte Nummer an!");
            }
        }
    }

    public static void geschaeftHinzufuegen() {

        int geschaeftsart = inputInt("Wurde ein 1) Neuwagen oder ein 2) Gebrauchswagen verkauft?");

        if (geschaeftsart == 1) {
            geschaeftsliste.addGescheaft(geschaeftNeuwagenHinzufuegen());
        } else {
            geschaeftsliste.addGescheaft(geschaeftGebrauchtwagenHinzufuegen());
        }
    }

    public static void hoechsterGeschaeftsabschlussAusgeben() {
        System.out.println(geschaeftsliste.getHighestGeschaeft().toString());
    }

    public static void geschaeftslisteAusgeben() {
        System.out.println(geschaeftsliste.toString());
    }

    public static GeschaeftNeuwagen geschaeftNeuwagenHinzufuegen() {
        Person person = createPerson();
        String kFZZeichen = inputString("Bitte geben sie das KFZ Zeichen an!");
        double listenpreis = inputDouble("Bitte geben sie den Listenpreis an!");
        double rabatt = inputDouble("Bitte geben sie den gewärten Rabatt an!");

        return new GeschaeftNeuwagen(person, kFZZeichen, listenpreis, rabatt);
    }

    public static GeschaeftGebrauchtwagen geschaeftGebrauchtwagenHinzufuegen() {
        Person person = createPerson();
        String kFZZeichen = inputString("Bitte geben sie das KFZ Zeichen an!");
        double verkaufspreis = inputDouble("Bitte geben sie den Verkaufspreis an!");
        double einkaufspreis = inputDouble("Bitte geben sie den Einkaufspreis an!");
        double kilometerstand = inputDouble("Bitte geben sie den Kilometerstand an!");

        return new GeschaeftGebrauchtwagen(person, kFZZeichen, verkaufspreis, einkaufspreis, kilometerstand);
    }

    public static Person createPerson() {
        String vorname = inputString("Bitte gebe den Vornamen des Vertrieblers an.");
        String nachname = inputString("Bitte geben sie den Nachnamen des Vertrieblers an.");
        return new Person(vorname, nachname);
    }

    private static int inputInt(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextInt();
    }

    private static double inputDouble(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextDouble();
    }

    private static String inputString(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextLine();
    }


}
