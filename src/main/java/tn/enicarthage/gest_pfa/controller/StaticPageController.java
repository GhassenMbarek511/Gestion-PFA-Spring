package tn.enicarthage.gest_pfa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {

    @RequestMapping("/about")
    String showAboutPage(){
        return "views/about";
    }
}