package com.restapi.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.study.dto.PostDto;
import com.restapi.study.entity.Post;
import com.restapi.study.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public PostDto createPost(PostDto postDto) {
		// PostDto => Post 변환
		Post post = new Post();

		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setDescription(postDto.getDescription());
		// DB에 새 포스트 저장 (리턴 Post)
		Post newPost = postRepository.save(post);

		// Post => PostDto 변환
		PostDto postResponse = new PostDto();
		postResponse.setId(newPost.getId());
		postResponse.setTitle(newPost.getTitle());
		postResponse.setContent(newPost.getContent());
		postResponse.setDescription(newPost.getDescription());
		return postResponse;
	}
}
