package com.gustavocostabr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocostabr.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
