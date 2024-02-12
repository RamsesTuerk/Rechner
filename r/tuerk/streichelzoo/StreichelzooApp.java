package r.tuerk.streichelzoo;

import java.util.Scanner;

public class StreichelzooApp {
    static Zoo zoo = new Zoo();
    public static void main(String[] args) {

    //TODO siehe Aufgabe

    }

    public static void addAnimal(){
        Tier newAnimal = new Tier(inputString("Welches Tier möchtest du hinzufügen?"));
        zoo.addAnimal(newAnimal);
    }

    public static void showZoo(){
        System.out.println(zoo.toString());
    }

    public static void doStreicheln(){

    }

    private static String inputString(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        return scanner.nextLine();
    }

    private static int inputInt(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(info);
        return scanner.nextInt();
    }


}
