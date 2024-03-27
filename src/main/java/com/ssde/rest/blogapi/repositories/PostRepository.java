package com.ssde.rest.blogapi.repositories;

import com.ssde.rest.blogapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:23, blog-api
 */
public interface PostRepository extends JpaRepository<Post, UUID> {
}
