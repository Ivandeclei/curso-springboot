package com.example.curso.services;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entities.Order;
import com.example.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repositoy;
	
	public List<Order> findAll() {
		return repositoy.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repositoy.findById(id);
		return obj.get();
	}

}

