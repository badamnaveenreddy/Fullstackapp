

package com.vvitu.springboot_web_data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vvitu.springboot_web_data.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {
}