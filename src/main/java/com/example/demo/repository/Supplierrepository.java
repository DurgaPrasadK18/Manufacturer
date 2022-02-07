package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Supplier;

public interface Supplierrepository extends CrudRepository<Supplier, Integer> {

}
