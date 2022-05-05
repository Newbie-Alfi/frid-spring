package com.example.server.repository;

import com.example.server.entity.ChairEntity;
import org.springframework.data.repository.CrudRepository;

public interface ChairRepo extends CrudRepository<ChairEntity, Integer> {
}
