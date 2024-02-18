package r.tuerk.autohaus;

public class GeschaeftGebrauchtwagen extends Geschaeft {
    private final double verkaufspreis;
    private final double einkaufspreis;
    private final double kilometerstand;

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
