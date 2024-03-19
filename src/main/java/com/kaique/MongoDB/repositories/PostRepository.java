package com.kaique.MongoDB.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.kaique.MongoDB.models.entities.Post;

public interface PostRepository extends MongoRepository<Post, String> {


	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
}