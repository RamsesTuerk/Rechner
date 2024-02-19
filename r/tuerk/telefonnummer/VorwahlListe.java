package r.tuerk.telefonnummer;

public enum VorwahlListe {
    BE("Belgien","+32"),
    E("Spanien","+34"),
    D("Deutschland", "+49"),
    PE("Peru","+51"),
    IL("Israel","+972");


    private String land;
    private String vorwahl;

    VorwahlListe(String laendername, String vorwahl){
        this.land = laendername;
        this.vorwahl = vorwahl;
    }
    public String getLand() {
        return land;
    }

    public String getVorwahl() {
        return vorwahl;
    }


}
