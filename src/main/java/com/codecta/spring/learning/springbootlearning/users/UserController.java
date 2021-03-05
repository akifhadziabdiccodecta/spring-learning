package com.codecta.spring.learning.springbootlearning.users;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping
    private List<UserDto> findAllUsers() {
        return userMapper.toDtoList(userService.findAllUsers());
    }

    @PostMapping
    private UserDto createUser(@RequestBody UserDto dto) {
        return userMapper.toDto(userService.createUser(userMapper.toEntity(dto)));
    }
}
