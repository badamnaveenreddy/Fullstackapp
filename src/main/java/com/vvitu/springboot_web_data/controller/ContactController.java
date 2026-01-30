package com.vvitu.springboot_web_data.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vvitu.springboot_web_data.model.Contact;
import com.vvitu.springboot_web_data.repository.ContactRepository;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @PostMapping
    public Contact submit(@RequestBody Contact contact) {
        return repo.save(contact);
    }

    @GetMapping
    public List<Contact> getAll() {
        return repo.findAll();
    }
}
