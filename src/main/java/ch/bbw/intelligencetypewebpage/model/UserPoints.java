package ch.bbw.intelligencetypewebpage.model;

public class UserPoints {
    private int musical = 0;
    private int mathematical = 0;
    private int spatial = 0;
    private int bodily = 0;
    private int intrapersonal = 0;
    private int interpersonal = 0;
    private int naturally = 0;

    // Löschen im finalen Projekt
    public void increment(String type, int number) {
        switch (type) {
            case "musik":
                musical += number;
                break;
            case "mathe":
                mathematical += number;
                break;
            case "koerper":
                bodily += number;
                break;
            case "intrapersonal":
                intrapersonal += number;
                break;
            case "interpersonal":
                intrapersonal += number;
                break;
            case "natur":
                naturally += number;
                break;
        }
    }

    public int getMusical() {
        return musical;
    }

    public void setMusical(int musical) {
        this.musical = musical;
    }

    public int getMathematical() {
        return mathematical;
    }

    public void setMathematical(int mathematical) {
        this.mathematical = mathematical;
    }

    public int getSpatial() {
        return spatial;
    }

    public void setSpatial(int spatial) {
        this.spatial = spatial;
    }

    public int getBodily() {
        return bodily;
    }

    public void setBodily(int bodily) {
        this.bodily = bodily;
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

    public int getNaturally() {
        return naturally;
    }

    public void setNaturally(int naturally) {
        this.naturally = naturally;
    }
}
