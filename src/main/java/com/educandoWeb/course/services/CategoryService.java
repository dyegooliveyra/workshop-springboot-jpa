package com.educandoWeb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoWeb.course.entities.Category;
import com.educandoWeb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return this.categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> order = this.categoryRepository.findById(id);
		return order.get();
	}
	
}
