package com.codecta.spring.learning.springbootlearning.users;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class UserMapper {

    public UserEntity toEntity(UserDto user) {
        var entity = new UserEntity();
        BeanUtils.copyProperties(user, entity, UserAutoMapped.class);
        return entity;
    }

    public UserDto toDto(UserEntity entity) {
        var dto = new UserDto();
        BeanUtils.copyProperties(entity, dto, UserAutoMapped.class);
        return dto;
    }

    public List<UserDto> toDtoList(Iterable<UserEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
