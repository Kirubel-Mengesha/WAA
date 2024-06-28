package com.example.WaaLab2.Repo;

import com.example.WaaLab2.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
