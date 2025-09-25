package com.example.simpleProducts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureJPA extends CrudRepository<PictureJPA,Long> {
}
