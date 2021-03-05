package com.codecta.spring.learning.springbootlearning.users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findFirstByFirstName(String firstName);
}
