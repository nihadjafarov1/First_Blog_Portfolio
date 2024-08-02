package com.example.blogportfolio.repository;

import com.example.blogportfolio.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
