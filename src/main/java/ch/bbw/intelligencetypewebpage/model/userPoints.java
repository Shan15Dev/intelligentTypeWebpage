package ch.bbw.intelligencetypewebpage.model;

public class userPoints {
    private int musiksikalisch = 0;
    private int mathematisch = 0;
    private int raeumlich = 0;
    private int koerperlich = 0;
    private int intrapersonal = 0;
    private int interpersonal = 0;
    private int natuerlich = 0;

    public void incement(String type){
        switch (type){
            case "musik":
                musiksikalisch++;
                break;
            case "mathe":
                mathematisch++;
                break;
            case "koerper":
                koerperlich++;
                break;
            case "intrapersonal":
                intrapersonal++;
                break;
            case "interpersonal":
                intrapersonal++;
                break;
            case "natur":
                natuerlich++;
                break;
        }
    }


    public int getMusiksikalisch() {
        return musiksikalisch;
    }

    public void setMusiksikalisch(int musiksikalisch) {
        this.musiksikalisch = musiksikalisch;
    }

    public int getMathematisch() {
        return mathematisch;
    }

    public void setMathematisch(int mathematisch) {
        this.mathematisch = mathematisch;
    }

    public int getRaeumlich() {
        return raeumlich;
    }

    public void setRaeumlich(int raeumlich) {
        this.raeumlich = raeumlich;
    }

    public int getKoerperlich() {
        return koerperlich;
    }

    public void setKoerperlich(int koerperlich) {
        this.koerperlich = koerperlich;
    }

    public int getIntrapersonal() {
        return intrapersonal;
    }

    public void setIntrapersonal(int intrapersonal) {
        this.intrapersonal = intrapersonal;
    }

    public int getInterpersonal() {
        return interpersonal;
    }

    public void setInterpersonal(int interpersonal) {
        this.interpersonal = interpersonal;
    }

    public int getNatuerlich() {
        return natuerlich;
    }

    public void setNatuerlich(int natuerlich) {
        this.natuerlich = natuerlich;
    }
}
