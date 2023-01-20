package com.restapi.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.study.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

	
}
