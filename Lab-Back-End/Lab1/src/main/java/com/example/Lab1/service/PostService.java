package com.example.Lab1.service;

import com.example.Lab1.entity.Post;
import com.example.Lab1.entity.response.PostDto;


import java.util.List;

public interface PostService {


    public void save(Post p);
    public PostDto getById(int id);

    public List<PostDto> findAll();

}
