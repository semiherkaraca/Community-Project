package com.community.project.community.project.service;

import com.community.project.community.project.domain.Role;
import com.community.project.community.project.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
