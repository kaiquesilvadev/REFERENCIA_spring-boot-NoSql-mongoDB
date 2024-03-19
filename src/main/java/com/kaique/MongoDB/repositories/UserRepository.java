package com.kaique.MongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kaique.MongoDB.models.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}