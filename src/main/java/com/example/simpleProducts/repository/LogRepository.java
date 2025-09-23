package com.example.simpleProducts.repository;

import com.example.simpleProducts.entity.LogJPA;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogJPA,Integer> {
}
