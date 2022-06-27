package com.user.management.repository;

import com.user.management.model.UserDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDAO, Integer> {
    UserDAO findByUsername(String username);
}
