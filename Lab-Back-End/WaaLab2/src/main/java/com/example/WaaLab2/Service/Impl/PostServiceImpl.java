package com.example.WaaLab2.Service.Impl;

import com.example.WaaLab2.Entity.Dto.Input.PostRequest;
import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Post;
import com.example.WaaLab2.Repo.PostRepo;
import com.example.WaaLab2.Service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<PostResponse> findAll(){
        List<Post> posts = postRepo.findAll();
        return posts.stream()
                .map(m->modelMapper.map(m,PostResponse.class))
                .collect(Collectors.toList());


    }
    @Override
    public PostResponse findById(Long id){
        return modelMapper.map(postRepo.findById(id), PostResponse.class);
    }
    @Override
    public void save(Post p){
        postRepo.save(p);

    }


}
