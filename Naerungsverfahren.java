public class Naerungsverfahren {
    Funktion funktion;
    Funktion ableitungsFunktion;

    public Naerungsverfahren(Funktion funktion) {
        this.funktion = funktion;
        this.ableitungsFunktion = funktion.ableitung();
    }

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

    private double getRandom() {
        return Math.round(Math.random() / (1.0 / (100.0 - 1.0)) + 1.0);
    }
}
