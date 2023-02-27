package com.serviceops.ecommerce.service;

import com.serviceops.ecommerce.dto.user.UserDto;
import com.serviceops.ecommerce.dto.user.UserPasswordDto;

import java.util.List;

public interface UserService {
    boolean signUp(UserDto userDto);

    UserDto getUser(String email);

    List<UserDto> getAllUsers();

    boolean deleteUser(Long id);

    boolean updateUser(UserDto user);

    boolean updatePassword(UserPasswordDto userPasswordDto);

}