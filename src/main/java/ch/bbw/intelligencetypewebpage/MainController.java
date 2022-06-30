package ch.bbw.intelligencetypewebpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.bbw.intelligencetypewebpage.model.Answer;
import ch.bbw.intelligencetypewebpage.model.Questions;
import ch.bbw.intelligencetypewebpage.model.UserPoints;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MainController {

    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private Questions q1 = new Questions("Frage 1?",
            new Answer(new String[] { "a", "b", "c", "d" }, new String[] { "mathe", "mathe", "mathe", "mathe" }));
    private int index = 0;

    public MainController() {
        questions.add(q1);
    }

    @GetMapping("")
    public String home(Model model) {
        System.out.println("GetMapping");
        model.addAttribute("question", questions.get(index));
        model.addAttribute("userpoints", new UserPoints());
        return "index";
    }

    @PostMapping("")
    public String homepost(Model model, @ModelAttribute UserPoints userpoints,
            @RequestParam(value = "hiddeninput", required = true) String answernumber) {
        userpoints.increment(questions.get(index).getAnswers().getType()[0], 1);
        System.out.println("----Postmapping");
        System.out.println(answernumber);
        System.out.println(userpoints.getMathematical());
        System.out.println("----Postmapping");
        // if (questions.size() == ++index) { // 1 == ++0 True
        // System.out.println("Exit");
        // }
        model.addAttribute("userpoints", userpoints);
        model.addAttribute("question", questions.get(index));
        return "index";
    }

}
