package com.edrcode.dreamshops.service.user;

import com.edrcode.dreamshops.dto.UserDto;
import com.edrcode.dreamshops.model.User;
import com.edrcode.dreamshops.request.CreateUserRequest;
import com.edrcode.dreamshops.request.UpdateUserRequest;

public interface IUserService {

    User getUserById(Long id);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
