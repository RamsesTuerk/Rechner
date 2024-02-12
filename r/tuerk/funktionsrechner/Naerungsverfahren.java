package r.tuerk.funktionsrechner;

public class Naerungsverfahren {
    Funktion funktion;
    Funktion ableitungsFunktion;

    //Konstrucktor für Das Näherungsverfahren
    public Naerungsverfahren(Funktion funktion) {
        this.funktion = funktion;
        this.ableitungsFunktion = funktion.ableitung();
    }

    //Berechnen der Nullstellen nach dem Newton verfahren
    public double getNullstelle() {
        double x1 = getRandom();
        double x2;

        for (int i = 0; 100 > i; i++) {
            double y1 = funktion.getY(x1);
            double y2 = ableitungsFunktion.getY(x1);

            x2 = x1 - (y1 / y2);
            x1 = x2;
        }
        return x1;
    }

    //Rückgabe einer zufälligen Zahl zwischen 0 und 100
    private double getRandom() {
        return Math.round(Math.random() / (1.0 / (100.0 - 1.0)) + 1.0);
    }
}
