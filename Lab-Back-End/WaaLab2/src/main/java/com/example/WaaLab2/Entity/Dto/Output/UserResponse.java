package com.example.WaaLab2.Entity.Dto.Output;

import com.example.WaaLab2.Entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    long id;
    String name;
    List<PostResponse> posts;
}
