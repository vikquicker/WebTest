package webTest.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/start")
    public String Start(){
        return "start";
    }

    @GetMapping("/register")
    public String Register(){
        return "register";
    }
}
