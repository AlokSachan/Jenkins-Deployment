package com.alok.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDetails {
    private Long id;
    private String firstName;
    private String lastName;
    @NotNull(message = "Email should not be null")
    @Email(message = "Email should be in valid format")
    @NotEmpty(message = "Email should not be empty")
    private String email;
    private Integer phoneNumber;
}
