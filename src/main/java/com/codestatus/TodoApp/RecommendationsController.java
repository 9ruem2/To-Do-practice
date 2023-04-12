package com.codestatus.TodoApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {
    @GetMapping("/")
    public String helloworld(){
        return "To-do Application !";
    }
}