package com.example.WaaLab2.Service.Impl;

import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Dto.Output.UserResponse;
import com.example.WaaLab2.Entity.Post;
import com.example.WaaLab2.Entity.UserEntity;
import com.example.WaaLab2.Repo.PostRepo;
import com.example.WaaLab2.Repo.UserRepo;
import com.example.WaaLab2.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    PostRepo postRepo;
    @Autowired
    ModelMapper modelmapper;
    @Override
    public List<UserEntity> findAll(){
       return userRepo.findAll();
    }
    @Override
    public UserResponse findById(Long id){
        return userRepo.findById(id)
                .map(user -> modelmapper.map(user, UserResponse.class))
                .orElse(null);

    }
    @Override
    public void save(UserEntity user){
       userRepo.save(user);
       postRepo.saveAll(user.getPosts());

    }
    @Override
    public List<PostResponse> findUserPosts(Long id){
        UserEntity user = userRepo.findById(id).orElse(null);
        if (user == null) {
            return null;
        }
        List<Post> posts = user.getPosts();
        return posts.stream()
                .map(p -> modelmapper.map(p, PostResponse.class))
                .collect(Collectors.toList());

    }
}
