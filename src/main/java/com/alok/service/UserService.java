package com.alok.service;

import com.alok.dto.UserDetails;
import com.alok.entity.UserEntity;
import com.alok.exception.ExceptionUtil;
import com.alok.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserEntity getUserDetailsById(Long id)  {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        if(! userEntity.isPresent()) {
            ExceptionUtil.throwException("User not found for Id", HttpStatus.NOT_FOUND);
        }
        return userEntity.get();

    }

    public UserEntity registerUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
