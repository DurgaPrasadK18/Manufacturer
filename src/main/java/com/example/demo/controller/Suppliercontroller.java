package com.example.demo.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.Componentrepository;
import com.example.demo.repository.Supplierrepository;
import com.example.demo.entity.Supplier;

import com.example.demo.service.Supplierservice;

@RestController
public class Suppliercontroller {
	@Autowired
	Supplierservice supplierService;
	@Autowired
	Componentrepository componentRepository;
	@Autowired
	Supplierrepository supplierRepository;

	@GetMapping("/supplier")
	public Iterable<Supplier> getDetails() {
		return supplierService.getSupplierDetails();

	}

	

	@PostMapping("/supplier")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatSupplier(@RequestBody @Valid Supplier supplier) {
		supplierService.addSupplier(supplier);
	}

	

}