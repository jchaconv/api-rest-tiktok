package com.example.demo.repositories;

import com.example.demo.model.UserTikTok;
import org.springframework.data.repository.CrudRepository;

public interface UserTikTokRepository extends
        CrudRepository<UserTikTok, Long> {
}
