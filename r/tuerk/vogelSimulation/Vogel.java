package r.tuerk.vogelSimulation;

public abstract class Vogel {

    private String Standort;


    public Vogel(String standort){
        this.Standort = standort;
    }
    public abstract void fliegen(String ziel);

    public String getStandort() {
        return Standort;
    }

    public void setStandort(String standort) {
        Standort = standort;
    }
}
