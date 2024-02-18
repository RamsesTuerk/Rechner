package r.tuerk.autohaus;

import java.util.ArrayList;

public class Geschaeftsliste {
    ArrayList<Geschaeft> gescheaftsliste = new ArrayList<>();

    public void addGescheaft(Geschaeft gescheaft) {
        gescheaftsliste.add(gescheaft);
    }

    public Geschaeft getHighestGeschaeft() {
        Geschaeft highestGeschaeft = gescheaftsliste.getFirst();
        for (Geschaeft geschaeft : gescheaftsliste) {
            if (geschaeft.getWert() > highestGeschaeft.getWert()) {
                highestGeschaeft = geschaeft;
            }
        }
        return highestGeschaeft;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < gescheaftsliste.size(); i++) {
            output += gescheaftsliste.get(i).toString() + "\n";
        }
        return output;
    }
}
