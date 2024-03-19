package com.kaique.MongoDB.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaique.MongoDB.exceptions.ResourceNotFoundException;
import com.kaique.MongoDB.models.dto.PostDTO;
import com.kaique.MongoDB.models.entities.Post;
import com.kaique.MongoDB.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public PostDTO findById(String id) {
		Optional<Post> result = repository.findById(id);
		Post entity = result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
		return new PostDTO(entity);
	}
	
	public List<PostDTO> findByTitle(String text) {
		List<Post> list =  repository.searchTitle(text);
		return list.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
	}
}