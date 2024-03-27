package com.ssde.rest.blogapi.mapper;

import com.ssde.rest.blogapi.entities.User;
import com.ssde.rest.blogapi.model.UserDTO;
import org.mapstruct.Mapper;

/**
 * Created by jra, SSDE inc
 * on Wed 3/27/24 at 00:14, blog-api
 */
@Mapper
public interface UserMapper {
    User userDtotoUser(UserDTO dto);

    UserDTO userToUserDto(User user);
}
