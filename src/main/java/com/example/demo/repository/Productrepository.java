package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;


@Repository
public interface Productrepository extends CrudRepository<Product, Integer>{

}
