package com.example.WaaLab2.Controller;

import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Post;
import com.example.WaaLab2.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostResponse> findAll() {
        return postService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostResponse getById(@PathVariable("id") Long id) {
        return postService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Post p) {
        postService.save(p);

    }

}
