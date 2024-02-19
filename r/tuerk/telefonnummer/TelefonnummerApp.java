package r.tuerk.telefonnummer;

public class TelefonnummerApp {
    public static void main(String[] args) {
        Person person = new Person("Thomas","Türk", VorwahlListe.D,1622152445);
        System.out.println(person.getCompleteNumber());
    }
}
