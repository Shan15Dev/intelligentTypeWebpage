package ch.bbw.intelligencetypewebpage.model;

import java.util.ArrayList;

public class Answer {
    private ArrayList<String> answers;
    private ArrayList<String> type;

    public Answer(ArrayList<String> answers, ArrayList<String> type) {
        this.answers = answers;
        this.type = type;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }
}
