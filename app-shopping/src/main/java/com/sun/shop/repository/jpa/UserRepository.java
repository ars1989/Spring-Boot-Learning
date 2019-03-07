package com.sun.shop.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.sun.shop.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
