package com.marcelodesantana.service;

import com.marcelodesantana.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
