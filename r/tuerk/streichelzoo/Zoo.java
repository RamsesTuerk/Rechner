package r.tuerk.streichelzoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Tier> zoo = new ArrayList<>();

    public Zoo(){
    }

    public void addAnimal(Tier animal){
        zoo.add(animal);
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < zoo.size(); i++) {
            output += "1)" + zoo.get(i);
        }
        return output;
    }

}
