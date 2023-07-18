package com.desafio01.Modulo01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio01.Modulo01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService service;
	
	public double total (Order order) {
		return  service.shipment(order) - (order.getBasic() * (order.getDiscount()/100));
	}

}
