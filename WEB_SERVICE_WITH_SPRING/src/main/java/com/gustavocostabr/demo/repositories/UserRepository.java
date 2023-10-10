package com.gustavocostabr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocostabr.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
