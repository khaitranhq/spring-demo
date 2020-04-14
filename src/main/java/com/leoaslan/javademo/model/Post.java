package com.leoaslan.javademo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "post")
public class Post {
	public Post(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	@Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String content;
}
