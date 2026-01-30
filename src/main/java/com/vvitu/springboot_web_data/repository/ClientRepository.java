package com.vvitu.springboot_web_data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vvitu.springboot_web_data.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
}
