package r.tuerk.vogelSimulation;

import java.util.ArrayList;

public class VogelSpecht extends Vogel{

    ArrayList<String> spechthoelen = new ArrayList<>();

    public VogelSpecht(String standort) {
        super(standort);
    }

    @Override
    public void fliegen(String ziel) {
        super.setStandort(ziel);
    }

    public void createHole(){
        spechthoelen.add(getStandort());
    }

    public String hoelenToString(){
        StringBuilder output = new StringBuilder();
        for(String hoele : spechthoelen ){
        output.append(hoele).append("\n");
        }
        return output.toString();
    }
}
