package ch.bbw.intelligencetypewebpage;

import ch.bbw.intelligencetypewebpage.data.AllQuestions;
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



    private int index = 0;
    private UserPoints userPoints = new UserPoints();
    private AllQuestions allQuestions = new AllQuestions();
    private ArrayList<Questions> questions = allQuestions.getAllQuestions();

    public MainController() {

    }

    @GetMapping("")
    public String home(Model model) {
        index = 0;
        UserPoints.setScoresZero();
        System.out.println("GetMapping");
        model.addAttribute("question", questions.get(index));
        model.addAttribute("userpoints", userPoints);
        return "index";
    }

    @PostMapping("")
    public String homepost(Model model, @ModelAttribute UserPoints userpoints,
            @RequestParam(value = "hiddeninput", required = true) String answernumber) {

        if (!answernumber.equals("error")) {
            UserPoints.increment(questions.get(index).getAnswers().getType()[Integer.parseInt(answernumber)], 1);
            model.addAttribute("userpoints", userpoints);
            if (questions.size() == ++index) {
                System.out.println("Exit");
                model.addAttribute("intelligenceTypes", UserPoints.getIntelligenceType());
                return "result";
            }
        }

        model.addAttribute("question", questions.get(index));
        return "index";
    }

}
