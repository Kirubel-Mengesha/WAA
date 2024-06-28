package com.example.WaaLab2.Controller;

import com.example.WaaLab2.Entity.Dto.Input.UserRequest;
import com.example.WaaLab2.Entity.Dto.Output.PostResponse;
import com.example.WaaLab2.Entity.Dto.Output.UserResponse;
import com.example.WaaLab2.Entity.UserEntity;
import com.example.WaaLab2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<UserEntity> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    UserResponse findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody UserEntity u){
        userService.save(u);
    }

    @GetMapping("/{id}/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<PostResponse> findUserPosts(@PathVariable("id") Long id){
        return userService.findUserPosts(id);
    }
}
