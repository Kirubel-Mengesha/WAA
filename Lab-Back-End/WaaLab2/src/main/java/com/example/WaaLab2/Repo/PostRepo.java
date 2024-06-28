package com.example.WaaLab2.Repo;

import com.example.WaaLab2.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
