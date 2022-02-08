package com.example.spring5jokesappv2myversion.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // Hard-coded dependency injection. Die Implementierung der
    // Dependency Injection mit 3rd party Dependencies kommts später im Kurs
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getChuckNorrisJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }


}
