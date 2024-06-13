package de.hawhamburg.textgame;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/signup")
    public String singUp() {
        return "signup";
    }

    @PostMapping("/create")
    public String characterCreation(Model model, @RequestParam("username") String username) {
        model.addAttribute("username", username);
        return "character";
    }

    @GetMapping("/quiz")
    public String startGame() {
        return "quiz";
    }

}
