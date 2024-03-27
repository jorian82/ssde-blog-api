package com.ssde.rest.blogapi.mapper;

import com.ssde.rest.blogapi.entities.Post;
import com.ssde.rest.blogapi.model.PostDTO;
import org.mapstruct.Mapper;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:11, blog-api
 */
@Mapper
public interface PostMapper {
    Post postDtoToPost(PostDTO dto);
    PostDTO postToPostDto(Post post);
}
