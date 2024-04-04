package ua.skorobahatyi.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/v1/test")
public class TestController {
    @GetMapping
    public String checkApp(){
        return "Hello Nick, how are you?";
    }

    @GetMapping("/html")
    public String checkHtmlPage(){
        return "hello1";
    }
}
