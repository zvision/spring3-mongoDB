package com.se.alaf.api.model.post;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Document(collection = "POST_TB")
public @Data class Post {

	@Id
	private long id;
	private Long userid;
	private String title;
	private String body;
}
