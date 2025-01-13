package com.example.demospringsecurity.service;

import com.example.demospringsecurity.dto.UserDto;
import com.example.demospringsecurity.model.RegistrationRequest;
import com.example.demospringsecurity.model.User;

import java.util.List;

public interface UserService {

    boolean checkEmail(String email);

    UserDto registerUser(RegistrationRequest registrationRequest);

    UserDto getLoginUser();

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    UserDto createUser(User user);

    UserDto updateUser(User user);

    void deleteUser(User user);
}
