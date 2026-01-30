package com.vvitu.springboot_web_data.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vvitu.springboot_web_data.model.Client;
import com.vvitu.springboot_web_data.repository.ClientRepository;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientRepository repo;

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return repo.save(client);
    }

    @GetMapping
    public List<Client> getClients() {
        return repo.findAll();
    }
}
