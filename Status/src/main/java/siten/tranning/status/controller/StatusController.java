package siten.tranning.status.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {
	
	@GetMapping("/")
    public String init(Model model) {
        return "index";
    }
}