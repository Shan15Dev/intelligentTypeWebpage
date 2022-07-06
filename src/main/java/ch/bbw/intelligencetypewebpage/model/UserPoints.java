package ch.bbw.intelligencetypewebpage.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserPoints {
    private static int musical = 0;
    private static int mathematical = 0;
    private static int spatial = 0;
    private static int bodily = 0;
    private static int intrapersonal = 0;
    private static int interpersonal = 0;
    private static int naturally = 0;
    private static String[] types = new String[] {"Musikalisch", "Mathematisch", "Räumlich", "Körperlich", "Intrapersonal", "Interpersonal", "Natur"};
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

    public static List<String> getIntelligenceType(){
        int maxNum = 0;
        int[] scores = new int[] {musical, mathematical, spatial, bodily, intrapersonal, interpersonal, naturally};

        List<String> yourResult = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxNum){
                maxNum = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxNum){
                yourResult.add(types[i]);
            }
        }

        return yourResult;
    }
    public static void setScoresZero(){
        musical = 0;
        mathematical = 0;
        spatial = 0;
        bodily = 0;
        intrapersonal = 0;
        interpersonal = 0;
        naturally = 0;
    }
}
