package com.ssde.rest.blogapi.repositories;

import com.ssde.rest.blogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:23, blog-api
 */
public interface UserRepository extends JpaRepository<User, UUID> {
}
