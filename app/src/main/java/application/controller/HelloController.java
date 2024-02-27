package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

    @GetMapping("/teste")
    @ResponseBody
    public String teste() {
        return "Olá Mundo!!!";
    }
}
