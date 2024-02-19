package r.tuerk.telefonnummer;

public class Person {
    private String vorname;

    private String nachname;

    private VorwahlListe vorwahl;

    private int telefonnummer;

    public Person(String vorname, String nachname, VorwahlListe vorwahl, int telefonnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.vorwahl = vorwahl;
        this.telefonnummer = telefonnummer;
    }
    public VorwahlListe getVorwahl() {
        return vorwahl;
    }

    public String getCompleteNumber(){
        StringBuilder output = new StringBuilder();
        output.append(vorwahl.getVorwahl()).append(telefonnummer);
        return output.toString();
    }
}
