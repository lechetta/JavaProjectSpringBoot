package com.project.WebService.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.WebService.entities.Order;
import com.project.WebService.services.OrderService;

//controlador Rest

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	//injeção de dependencia.
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){	
		List<Order> user = OrderService.findAll();
		return ResponseEntity.ok().body(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = OrderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
