package r.tuerk.autohaus;

public class GeschaeftGebrauchtwagen extends Geschaeft {
    private double verkaufspreis;
    private double einkaufspreis;
    private double kilometerstand;

    public GeschaeftGebrauchtwagen(Person vertriebler, String kFZZeichen, double verkaufspreis, double einkaufspreis, double kilometerstand) {
        super(vertriebler, kFZZeichen);
        this.verkaufspreis = verkaufspreis;
        this.einkaufspreis = einkaufspreis;
        this.kilometerstand = kilometerstand;
        setWert(calculateWert());
    }

    public double calculateWert() {
        return (verkaufspreis - einkaufspreis) * kilometerstand;
    }
}
