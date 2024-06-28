package com.example.Lab1.service;

import com.example.Lab1.entity.Post;
import com.example.Lab1.entity.response.PostDto;
import com.example.Lab1.repo.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostRepo postrepo;

    @Autowired
    ModelMapper modelmapper;
    @Override
    public void save(Post p) {
        postrepo.save(p);
    }
    @Override
    public PostDto getById(int id) {
        return modelmapper.map(postrepo.getById(id), PostDto.class);

    }
    @Override
    public List<PostDto> findAll() {
        List<Post> posts = postrepo.findAll();
        return posts.stream()
                .map(post -> modelmapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

}