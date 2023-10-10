package com.gustavocostabr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocostabr.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
