package com.example.WaaLab2.Service;

import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Dto.Output.UserResponse;
import com.example.WaaLab2.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<UserEntity> findAll();
    UserResponse findById(Long id);
    void save(UserEntity user);
    List<PostResponse> findUserPosts(Long id);

}
