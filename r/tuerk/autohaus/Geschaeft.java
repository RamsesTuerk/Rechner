package r.tuerk.autohaus;

public class Geschaeft {
    private final Person vertriebler;
    private final String kFZZeichen;
    private double wert;

    public Geschaeft(Person vertriebler, String kFZZeichen) {
        this.vertriebler = vertriebler;
        this.kFZZeichen = kFZZeichen;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    public String toString() {
        return "Der Vertriebler " + vertriebler.toString() + " hat mit dem Fahrzeug " + kFZZeichen + " einen Geschäftswert von " + wert + " erreicht ";
    }
}
