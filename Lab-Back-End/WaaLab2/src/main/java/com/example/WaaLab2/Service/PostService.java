package com.example.WaaLab2.Service;

import com.example.WaaLab2.Entity.Dto.Input.PostRequest;
import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Post;

import java.util.List;

public interface PostService {
    void save(Post p);
    PostResponse findById(Long id);
    List<PostResponse> findAll();



}
