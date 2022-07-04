package ch.bbw.intelligencetypewebpage.model;

public class UserPoints {
    private static int musical = 0;
    private static int mathematical = 0;
    private static int spatial = 0;
    private static int bodily = 0;
    private static int intrapersonal = 0;
    private static int interpersonal = 0;
    private static int naturally = 0;

    // Löschen im finalen Projekt
    public static void increment(String type, int number) {
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
                interpersonal += number;
                break;
            case "natur":
                naturally += number;
                break;
        }
    }

    public static int getMusical() {
        return musical;
    }

    public static int getMathematical() {
        return mathematical;
    }

    public static int getSpatial() {
        return spatial;
    }

    public static int getBodily() {
        return bodily;
    }

    public static int getIntrapersonal() {
        return intrapersonal;
    }

    public static int getInterpersonal() {
        return interpersonal;
    }

    public static int getNaturally() {
        return naturally;
    }
}
