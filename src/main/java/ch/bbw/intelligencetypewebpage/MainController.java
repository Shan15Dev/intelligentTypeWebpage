package ch.bbw.intelligencetypewebpage;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("")
    public String home() {
        return "index";
    }
}
