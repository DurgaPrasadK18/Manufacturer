package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Componentrepository;

import com.example.demo.entity.Component;

@Service
public class Componentservice {
	@Autowired
	Componentrepository componentRepository;

	public Optional<Component> getcomponent(Integer id) {

		return componentRepository.findById(id);
	}

	public void saveComponent(@Valid Component component) {

		componentRepository.save(component);
	}

	
	
}
