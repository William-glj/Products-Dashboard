package com.example.simpleProducts.repository;

import com.example.simpleProducts.entity.UsersJPA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<UsersJPA,Integer> {
}
