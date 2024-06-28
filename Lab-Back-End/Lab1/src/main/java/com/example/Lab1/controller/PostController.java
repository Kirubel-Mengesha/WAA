package com.example.Lab1.controller;


import com.example.Lab1.entity.Post;
import com.example.Lab1.entity.response.PostDto;
import com.example.Lab1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Post p) {
        postService.save(p);

    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDto getById(@PathVariable("id") int id) {
        return postService.getById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDto> findAll() {
        return postService.findAll();
    }
}
