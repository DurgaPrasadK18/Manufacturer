package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Productrepository;

import com.example.demo.entity.Product;

@Service
public class Productservice {
	@Autowired
	Productrepository productRepository;

	public Optional<Product> getproduct(Integer productId) {

		return productRepository.findById(productId);
	}

	public void saveProduct(@Valid Product product) {

		productRepository.save(product);
	}

	

}