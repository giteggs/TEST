package com.app.DemoTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.DemoTask.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
