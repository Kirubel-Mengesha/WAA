package com.example.Lab1.repo;

import com.example.Lab1.entity.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();

    public Post getById(int id);

    public void save(Post p);
}
