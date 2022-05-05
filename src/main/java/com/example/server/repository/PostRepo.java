package com.example.server.repository;

import com.example.server.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<PostEntity, Integer> {
}
