package com.ssde.rest.blogapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by jorian, SSDE Inc
 * on Tue 26/03/24 at 20:03, blog-api
 */
@Data
@Builder
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;
    @Version
    private Integer version;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "post")
    private Set<Post> posts = new HashSet<>();
}
