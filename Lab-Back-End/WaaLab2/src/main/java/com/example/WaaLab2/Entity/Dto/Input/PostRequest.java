package com.example.WaaLab2.Entity.Dto.Input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private long id;
    private String title;
    private String content;
    private String author;
}
