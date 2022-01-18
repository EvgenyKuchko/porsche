package com.project.porsche.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Dto {
    private String firstName;
    private String lastName;
    private int age;
    private String login;
    private String password;
    private Set<RoleDto> roles;
}