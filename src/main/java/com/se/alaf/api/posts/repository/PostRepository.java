package com.se.alaf.api.posts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.se.alaf.api.model.post.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer>{

	
}
