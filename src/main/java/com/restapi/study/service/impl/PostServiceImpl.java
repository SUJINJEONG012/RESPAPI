//package com.restapi.study.service.impl;
//
//import org.springframework.stereotype.Service;
//
//import com.restapi.study.dto.PostDto;
//import com.restapi.study.entity.Post;
//import com.restapi.study.repository.PostRepository;
//import com.restapi.study.service.PostService;
//
//@Service
//public class PostServiceImpl implements PostService {
//
//	private PostRepository postRepository;
//
//	public PostServiceImpl(PostRepository postRepository) {
//		this.postRepository = postRepository;
//	}
//
//	@Override
//	public PostDto createPost(PostDto postDto) {
//		// PostDto => Post 변환
//		Post post = new Post();
//
//		post.setTitle(postDto.getTitle());
//		post.setContent(postDto.getContent());
//		post.setDescription(postDto.getDescription());
//		// DB에 새 포스트 저장 (리턴 Post)
//		Post newPost = postRepository.save(post);
//
//		// Post => PostDto 변환
//		PostDto postResponse = new PostDto();
//		postResponse.setId(newPost.getId());
//		postResponse.setTitle(newPost.getTitle());
//
//		postResponse.setContent(newPost.getContent());
//
//		postResponse.setDescription(newPost.getDescription());
//		return postResponse;
//	}
//
//}
