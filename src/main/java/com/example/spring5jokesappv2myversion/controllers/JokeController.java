package com.example.spring5jokesappv2myversion.controllers;

import com.example.spring5jokesappv2myversion.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping({"/",""}) //Alte Schreibweise: @RequestMapping
    public String showJoke(Model model){
    model.addAttribute("joke", jokeService.getChuckNorrisJoke());

        return "index";
    }
}
