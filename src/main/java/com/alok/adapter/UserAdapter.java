package com.alok.adapter;

import com.alok.dto.UserDetails;
import com.alok.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter {
    public UserDetails adapt(UserEntity userEntity) {
        return UserDetails
                .builder()
                .id(userEntity.getId()).firstName(userEntity.getFirstName()).lastName(userEntity.getLastName()).email(userEntity.getEmail())
                .phoneNumber(userEntity.getPhoneNumber()).build();
    }

    public UserEntity adapt(UserDetails userDetails) {
        return UserEntity
                .builder()
                .firstName(userDetails.getFirstName()).lastName(userDetails.getLastName()).email(userDetails.getEmail())
                .phoneNumber(userDetails.getPhoneNumber()).build();
    }
}
