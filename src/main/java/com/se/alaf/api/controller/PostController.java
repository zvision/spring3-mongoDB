package com.se.alaf.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.alaf.api.model.post.Post;
import com.se.alaf.api.posts.repository.PostRepository;
import com.se.alaf.api.posts.service.JsonPlaceHolderService;


@RestController
@RequestMapping(value = "/api/v1")
public class PostController {

	@Autowired
	private JsonPlaceHolderService postService;
	
	@Autowired
	private PostRepository repo;
	
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPosts() {
		return ResponseEntity.ok(postService.loadPosts().getBody());
	}

	
	@GetMapping("/posts/{id}")
	public ResponseEntity<List<Post>> getLimitNumberOfPosts(@PathVariable("id") Long id) {
		List<Post> posts = postService.getLimitNumberOfPosts(id).getBody();
		repo.saveAll(posts);
		return ResponseEntity.ok(posts);
	}

	
}
