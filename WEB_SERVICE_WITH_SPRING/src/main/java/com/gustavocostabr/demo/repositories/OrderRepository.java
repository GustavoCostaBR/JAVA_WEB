package com.gustavocostabr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocostabr.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
