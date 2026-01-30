package com.vvitu.springboot_web_data.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vvitu.springboot_web_data.model.Newsletter;
import com.vvitu.springboot_web_data.repository.NewsletterRepository;

@RestController
@RequestMapping("/api/newsletter")
@CrossOrigin(origins = "*")
public class NewsletterController {

    @Autowired
    private NewsletterRepository repo;

    @PostMapping
    public Newsletter subscribe(@RequestBody Newsletter n) {
        return repo.save(n);
    }

    @GetMapping
    public List<Newsletter> getAll() {
        return repo.findAll();
    }
}
