package com.example.vahls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerLanguage { 
    
    @Autowired
    private LanguageRepository repository;
    
    @GetMapping("/languages")
    public List<Language> obterLinguagen(){
        List<Language> list = repository.findAll();
        return list;
    }
    @PostMapping("/languages")
    public Language addLanguage(@RequestBody Language language){
        return repository.save(language);
    }
    
}
