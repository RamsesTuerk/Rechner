package r.tuerk.autohaus;

public class GeschaeftNeuwagen extends Geschaeft {

    private final double listenpreis;
    private final double rabatt;

    public GeschaeftNeuwagen(Person vertriebler, String kFZZeichen, double listenpreis, double rabatt) {
        super(vertriebler, kFZZeichen);
        this.listenpreis = listenpreis;
        this.rabatt = rabatt;
        setWert(calculateWert());
    }

    public double calculateWert() {
        return (listenpreis - rabatt) * 10;
    }

}
