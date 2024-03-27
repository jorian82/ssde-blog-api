package com.ssde.rest.blogapi.model;

import com.ssde.rest.blogapi.entities.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:06, blog-api
 */
@Builder
@Data
public class PostDTO {
    private UUID id;
    private Integer version;
    private String content;
    private Integer likes;
    private Integer upvotes;
    private Integer dnvotes;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private User user;
}
