package com.codecta.spring.learning.springbootlearning.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Iterable<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity entity) {
        return userRepository.save(entity);
    }
}
