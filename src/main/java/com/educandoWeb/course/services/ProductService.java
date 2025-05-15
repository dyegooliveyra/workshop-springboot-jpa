package com.educandoWeb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoWeb.course.entities.Product;
import com.educandoWeb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return this.productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> product = this.productRepository.findById(id);
		return product.get();
	}
}
