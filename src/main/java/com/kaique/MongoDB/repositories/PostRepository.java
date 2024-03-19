package com.kaique.MongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kaique.MongoDB.models.entities.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}