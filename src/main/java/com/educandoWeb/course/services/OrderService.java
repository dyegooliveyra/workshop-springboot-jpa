package com.educandoWeb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return this.orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = this.orderRepository.findById(id);
		return order.get();
	}

}
