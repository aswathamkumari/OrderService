package com.order.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.dao.OrderReposiory;
import com.order.service.model.CustomerOrder;

@RestController
@RequestMapping("/order")
public class OrderController {


	@Autowired
	private OrderReposiory orderReposiory;
	
	@PostMapping("/saveOrder")
	public CustomerOrder saveOrder(@RequestBody CustomerOrder order) {

		System.out.println("Order obj:" + order.toString());
		return orderReposiory.save(order);
	}
}
