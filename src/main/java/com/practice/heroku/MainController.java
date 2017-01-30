package com.practice.heroku;

import com.practice.library.UtilityClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "Index page loaded successfully.";
    }

    @RequestMapping("/util")
    @ResponseBody
    String utilClass() {
        return UtilityClass.getString();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }
}
