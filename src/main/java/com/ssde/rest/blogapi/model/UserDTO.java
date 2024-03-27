package com.ssde.rest.blogapi.model;

import com.ssde.rest.blogapi.entities.Post;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:07, blog-api
 */
@Builder
@Data
public class UserDTO {
    private UUID id;
    private Integer version;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Set<Post> posts;
}
