package com.ssde.rest.blogapi.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by jorian, SSDE Inc
 * on Tue 26/03/24 at 17:55, blog-api
 */
@Data
@Builder
@Entity
@Table(name = "post")
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;
    @Version
    private Integer version;
    private String content;
    private Integer likes;
    private Integer upvotes;
    private Integer dnvotes;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
