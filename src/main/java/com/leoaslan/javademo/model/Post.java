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
	@Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String content;
}
