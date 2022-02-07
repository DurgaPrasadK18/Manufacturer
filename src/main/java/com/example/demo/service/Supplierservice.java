package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Supplierrepository;

import com.example.demo.entity.Supplier;

@Service
public class Supplierservice {
	@Autowired
	Supplierrepository supplierRepository;

	public Iterable<Supplier> getSupplierDetails() {

		return supplierRepository.findAll();
	}



	public void addSupplier(@Valid Supplier supplier) {
		supplierRepository.save(supplier);
	}


}
