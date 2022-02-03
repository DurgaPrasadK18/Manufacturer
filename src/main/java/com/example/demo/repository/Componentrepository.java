package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Component;
@Repository
public interface Componentrepository extends CrudRepository<Component, Integer>{

}