package ch.bbw.intelligencetypewebpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch.bbw.intelligencetypewebpage.model.Answer;
import ch.bbw.intelligencetypewebpage.model.Questions;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class MainController {

    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private Questions q1 = new Questions("Frage 1?",
            new Answer(new String[] { "a", "b", "c", "d" }, new String[] { "mathe", "mathe", "mathe", "mathe" }));

    public MainController() {
        questions.add(q1);
    }

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("index", 0);
        model.addAttribute("question", questions.get(0));
        return "index";
    }

    @PostMapping("")
    public String homepost(Model model, @ModelAttribute int index) {
        if (questions.size() == ++index) { // 1 == ++0 True
            System.out.println("Exit");
        }
        model.addAttribute("index", index);
        model.addAttribute("question", questions.get(index));
        return "index";
    }

}
