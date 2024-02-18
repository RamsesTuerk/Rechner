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
        StringBuilder output = new StringBuilder();
        for (Geschaeft geschaeft : gescheaftsliste) {
            output.append(geschaeft.toString()).append("\n");
        }
        return output.toString();
    }
}
