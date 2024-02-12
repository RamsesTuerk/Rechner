package r.tuerk.streichelzoo;

public class Tier {

    private String name;
    public static long maxTimeWithoutLove;
    private long lastTime;

    public Tier(String name){
        this.name = name;
        this.lastTime = System.currentTimeMillis();
    }

    public void streicheln() {
        lastTime = System.currentTimeMillis();
    }

    public boolean isHappy() {
        return (System.currentTimeMillis() - lastTime) <= maxTimeWithoutLove;
    }

    public String toString() {
        String mood = "Traurig";
        if (isHappy()) {
            mood = "Fröhlich";
        }

        return "Das Tier " + name + " ist Grade " + mood;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getMaxTimeWithoutLove() {
        return maxTimeWithoutLove;
    }

    public static void setMaxTimeWithoutLove(long maxTimeWithoutLove) {
        Tier.maxTimeWithoutLove = maxTimeWithoutLove;
    }


}
