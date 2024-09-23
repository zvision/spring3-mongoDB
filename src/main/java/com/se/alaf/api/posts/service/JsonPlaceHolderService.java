package com.se.alaf.api.posts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.se.alaf.api.model.post.*;

@Service
public class JsonPlaceHolderService {

	@Autowired
	RestTemplate restTemplete;

	
	private String url = "https://jsonplaceholder.typicode.com";
			
			
	public ResponseEntity<List<Post>> loadPosts() {

		// call https://jsonplaceholder.typicode.com/posts		
		ResponseEntity<List<Post>> exchange = restTemplete.exchange(url+"/posts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Post>>() {
				});
		return exchange;
	}

	public ResponseEntity<List<Post>> getLimitNumberOfPosts(Long id) {

		// call https://jsonplaceholder.typicode.com/posts		
		ResponseEntity<List<Post>> exchange = restTemplete.exchange(url+"/posts?_limit=" + id, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Post>>() {
				});
		System.out.println(exchange.getBody().toString());
		return exchange;
	}
	
}
