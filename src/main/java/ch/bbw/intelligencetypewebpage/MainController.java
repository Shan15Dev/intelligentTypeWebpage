package ch.bbw.intelligencetypewebpage;

import org.springframework.web.bind.annotation.GetMapping;

import ch.bbw.intelligencetypewebpage.model.Answer;
import ch.bbw.intelligencetypewebpage.model.Questions;

import java.util.ArrayList;

public class MainController {

    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private Questions q1 = new Questions("Frage 1?",
            new Answer(new String[] { "a", "b", "c", "d" }, new String[] { "mathe", "mathe", "mathe", "mathe" }));

    public MainController() {

    }

    @GetMapping("")
    public String home() {
        return "index";
    }
}
