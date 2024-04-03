package ua.skorobahatyi.onlineshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {
    @GetMapping
    public String checkApp(){
        return "Hello Nick, how are you?";
    }
}
