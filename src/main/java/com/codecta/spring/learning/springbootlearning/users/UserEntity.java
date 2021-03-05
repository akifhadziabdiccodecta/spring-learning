package com.codecta.spring.learning.springbootlearning.users;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(
        name = "users",
        indexes = {
                @Index(name = "first_name_index", columnList = "first_name"),
                @Index(name = "personal_identifier_unique", columnList = "personalId", unique = true),
                @Index(name = "username_unique", columnList = "username", unique = true),
        }
)
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends UserAutoMapped {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "personal_id", length = 50, nullable = false)
    private String personalId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "hash")
    private String hash;
}
